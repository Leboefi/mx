package com.example.yepes.moodstocks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.moodstocks.android.Scanner;
import com.moodstocks.android.MoodstocksError;

public class Hola extends AppCompatActivity {

    private static final String API_KEY    = "ddfzlizwhvrfng1okcqx";
    private static final String API_SECRET = "cyLKwHj8WrRDX4bk";

    private boolean compatible = false;
    private Scanner scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola);
        compatible = Scanner.isCompatible();
        if (compatible) {
            try {
                scanner = Scanner.get();
                String path = Scanner.pathFromFilesDir(this, "scanner.db");
                scanner.open(path, API_KEY, API_SECRET);
            } catch (MoodstocksError e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (compatible) {
            try {
                scanner.close();
                scanner.destroy();
                scanner = null;
            } catch (MoodstocksError e) {
                e.printStackTrace();
            }
        }
    }

    public void onScanButtonClicked(View view) {
        if (compatible) {
            startActivity(new Intent(this, ScanActivity.class));
        }
    }

    <activity
    android:name="com.example.helloms.ScanActivity"
            ...
    android:configChanges="orientation|screenSize" >
    </activity>

}




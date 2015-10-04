
package javaapplication2;
import java.net.*;
import java.sql.*;
import java.io.File;

public class Registro {
    
    public Registro(){
        File Meli=new File ("C:\\Users\\gabo\\Documents\\java-sdk-master\\java-sdk-master\\src\\main\\java\\com\\mercadolibre\\sdk\\Meli.java","r");
        String response_api;
        String sURL="http://api.mercadolibre.com/users/100763";
     
     try{
        
        URL url= new URL(sURL); 
        URLConnection conexion = url.openConnection();
   
            
        }
     catch(Exception e){
         e.printStackTrace();
     }
    }
    
}

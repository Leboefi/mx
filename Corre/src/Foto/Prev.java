import java.io.File;

package Foto;

public class Prev {
    File fichero=new File("Foto.java");
    String foto;
    String modelo;
    boleano anexar;
    String descripcion;
    boleano añadir;
    String precio;
    boleano cotizar;
    boleano siguiente;
   
    
    public Foto(File foto,String modelo,boleano anexar,String descripcion,boleano añadir,String precio, boleano cotizar, boleano siguiente){
        
        this.foto=foto;
        foto.modelo=modelo;
        anexar.foto=anexar;
        descripcion.foto=descripcion;
        añadir.foto=añadir;
        precio.foto=precio;
        cotizar.foto=cotizar;
        siguiente.foto=siguiente;
                
    
}

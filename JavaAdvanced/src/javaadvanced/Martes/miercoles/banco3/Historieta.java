
package javaadvanced.Martes.miercoles.banco3;

public class Historieta extends Thread{
    
    @Override
    public void run(){
        Superman SuperMan = new Superman();
        LexLuthor LexL = new LexLuthor();     
        LoadImageApp img = new LoadImageApp();
        
        try{ 
            LexL.golpeoTubo();
            img.ShowImagen("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\lex.jpg");
            Thread.sleep(100);
            img.ShowImagen("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\tubo.jpg");
            Thread.sleep(500);
            img.ShowImagen("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\correr.jpg");
            SuperMan.correrRapido();
            Thread.sleep(500);
            img.ShowImagen("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\lex.jpg");
            Thread.sleep(100);
            img.ShowImagen("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\bomba.jpg");
            LexL.lanzarBomba();
            Thread.sleep(500);
            img.ShowImagen("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\volando.jpg");
            SuperMan.volar();
            Thread.sleep(500);
            img.ShowImagen("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\lex.jpg");            
            LexL.patear();
            Thread.sleep(500);
            img.ShowImagen("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\golpear.jpg");     
            SuperMan.golpear();
                
         }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        
        
    }
    
    public static void main(String[] args) {
   
        Historieta h1 = new Historieta();
        h1.start();        
        
    }
}


package javaadvanced.Martes.miercoles.banco3;

import java.io.FileInputStream;
import java.io.IOException;

public class LeerArchivos{
    
    public void LeerArchivos(){
        
    }
    
    
    public static void leerArchivo(String nomArchiv){
        try {
            FileInputStream fis=
                    new FileInputStream(nomArchiv);
            
            int i = fis.read();
            System.out.println((char)i);
            fis.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    
}

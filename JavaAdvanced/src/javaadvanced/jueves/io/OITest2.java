
package javaadvanced.jueves.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class OITest2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
            
            String s = "Magia!!!";
            
            byte b[] = s.getBytes();
            
            fos.write(b);
            fos.close();
            System.out.println("Magia!!!");
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

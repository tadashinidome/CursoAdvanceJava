
package javaadvanced.jueves.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;


public class IOTest7 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("c:\\magic.txt");
        FileInputStream fis2 = new FileInputStream("c:\\magia.txt");
        
        SequenceInputStream sis = new 
            SequenceInputStream(fis,fis2);
        
        int i;
        
        while((i = sis.read()) != -1){
            System.out.print((char) i);
        }
        
        sis.close();
        fis.close();
        fis2.close();
    }
}

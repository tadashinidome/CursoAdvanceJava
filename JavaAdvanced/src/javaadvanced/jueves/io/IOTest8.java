
package javaadvanced.jueves.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class IOTest8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("c:\\magia.txt");
        FileInputStream fis2 = new FileInputStream("c:\\magic.txt");
        
        FileOutputStream fos = new FileOutputStream("c:\\todos.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis,fis2);
        
        int i;
        
        while((i = sis.read()) != -1)
        {
            fos.write(i);
            System.out.print((char)i);
        }
        
        close(fis,fis2,fos,sis);
        System.out.println("Ya...!");
        
    }
    
    private static void close(FileInputStream fis,
                FileInputStream fis2, FileOutputStream fos,
                SequenceInputStream sis) throws IOException{
        
        fis.close();
        fis2.close();
        fos.close();
        sis.close();
    }
}

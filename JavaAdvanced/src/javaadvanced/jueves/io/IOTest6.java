
package javaadvanced.jueves.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class IOTest6 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("c:\\magia.txt");
        
        BufferedInputStream bin = new BufferedInputStream(fis);
        
        int i=0;
        
        while((i= bin.read())!=-1){
            System.out.println((char) i);
        }
        
        bin.close();
        fis.close();
    }
}


package javaadvanced.jueves.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
La clase Java BufferedOutStream se utiliza 
para almacenar en un buffer un stream de salida.
Internamnete utiliza un buffer para almacenar
datos directamente en un stream.
Añade mas eficiencia que escribe datos de manera
directa en un flujo.
Por lo tanto logra un mejor rendimiento.

Tiene 2 constructores:
    BufferedOutputStream(outputStream os):
        Crea un nuevo flujo de salida almacenado
        en un bufer. Que se utiliza para ecribirlos 
        datos enel stream especificado.
    BufferedOutStream(OutputStream os, int size) 
        crea un nuevo flujo de salida que sera
        almacenado en un bufer el caul se utiliza para
        escribir los datos en el stream escificado
        el tamaño del bufer.

Metodos:
    Void write(int b): Escribe el byte especificado
        en el stream de salida almacenado en bufer.
    Void write(byte[] b, int off, int lean):
        Escribe los bytes de la secuencia de stream
        de bytees especificada en unb arreglo de bytes.
        comienza con el desplazamiento dado.
    Coid flush(): Borra el flujo de salida alamacenado
        en bufer.
        Vacia los datos de una secuencia y envia a otra.
        Se necesita si se ha conectado una secuancia con 
        otra
*/
public class IOTest5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("c:\\magic.txt");
            
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            
            String s = "Hola \n a todos";
            
            byte []b = s.getBytes();
            
            bout.write(b);
            bout.flush();
            bout.close();
            fos.close();
            
            System.out.println("Listo");
            
            
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }
}

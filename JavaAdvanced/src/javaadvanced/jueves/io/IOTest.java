
package javaadvanced.jueves.io;

import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.IIOException;

/*
    Java I/O
    Entrada y salida

    Se utiliza para procesar la entrada y salida.
    En Java se utiliza el concepto Stream (Flujo)
    para hacer que las operaciones de E/S sean
    rapidas.

    El paquete java.io contiene todas las clases
    necesarias para realizar operaciones de entrada
    y salida

    Podemos realizar el manejo de archivos a traves
    de Java I/O API.

Stream
    Es un flujo de datso,q ue esta compuesto por byte
    se llama stream por que es como un flujo de agua
    que se sigue corriendo.

    En Java existen 3stream que secrean para nuestro
    uso automaticoamente.

    1.- System.out: fli}ujo de salida
    2.- Systme.in: flijo de entrada estandar.
    3.- System.err: flujo de errores estandar

    System.out.print("Error");
    System.err.print("Error");

    OutputStram VS InputStream
Input: Lee
Output: Escribe
*/
public class IOTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =
                    new FileOutputStream("c:\\Hola.txt");
            fos.write(65);            
            fos.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}

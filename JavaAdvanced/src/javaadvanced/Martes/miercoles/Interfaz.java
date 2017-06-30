
package javaadvanced.Martes.miercoles;

/*
    Una interface es java es modelo de una clase.
    Tiene costantes estaticas y metodos abstractos
    La interface en java es un mecanismo para lograr
    la abstraccion. Solo puede contener metodos
    abstractos que carezcan de implementacion.
    Tambien permite la simulacion de herencia multiple
    Representa una relacion IS-A
    No se puede instanciar... como las clases abstractas
    
    Por que utilizar interface?
        *PAra lograr la asbtracion
        *Por interface podemos simular la herencia
        multiple
        *Para lograr un bajo acoplamiento.

    A partir de Java 8, la interface contiene metodos
    predeterminados y estaticos.
*/

interface Mostrar{
    //Que hace...
    void show();
}

public class Interfaz implements Mostrar{

    @Override
    public void show() {
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        Interfaz i = new Interfaz();
        i.show();
    }
    
}

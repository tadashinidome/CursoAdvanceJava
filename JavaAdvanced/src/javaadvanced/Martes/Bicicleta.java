
package javaadvanced.Martes;

/*
 
*/

class Vehiculo{
    void run(){
        System.out.println("El vehiculo esta corriendo");
    }
}

public class Bicicleta  extends Vehiculo{
    
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.run();
    }
    
    
    @Override
    void run(){
        System.out.println("La bicicleta esta corriendo");
    }
}

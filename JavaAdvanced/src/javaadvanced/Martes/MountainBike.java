
package javaadvanced.Martes;

public class MountainBike {   
    
    public static void main(String[] args) {
        //Bike b = new Bike("Azul",6 );
        show();
        showBici();
    }
    
    public static void show(){
        Bike b = new Bike("Azul",6 );
        System.out.println(b.getColor());
        System.out.println(b.getVelocidad());
    }
    
    public static void showBici(){
        Bike b = new Bike("Negra", "Magistroni", 8 );
        System.out.println(b.getColor());
        System.out.println(b.getVelocidad());
        System.out.println(b.getMarca());
    }
}

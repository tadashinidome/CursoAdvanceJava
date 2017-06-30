
package javaadvanced.Martes;
/*
    Super es una palabra recervada en java como una
variable referencia la cual es usada para sevir
de intermediario entre la clase padre y la superclase.

Usos de super
1.-Se puede utilizar para referir la verable
de instacia de la clase padre imediata.
2.-Se puede utilizar para invocar el metodo
de la clase imendiato
3.-Se puede utilizar para invocar al constructor de 
la clase padre imendiata.
*/

class Animal {

    //caso 3
    public Animal() {
        System.out.println("Se a creado el animal");
    }   
    
    //caso 2
    void eat(){
        System.out.println("Comiendo..!");
    }
    
    //caso 1
    String color = "Blanco";
}

class Perro extends Animal{
    //caso 3
    Perro(){
        super();
        System.out.println("Se ha crado el perro");
    }
    
    //caso 2
    void eat(){
        System.out.println("Comiendo croquetas");
    }
    void dormir(){
        System.out.println("El perro se durmio");
    }
    void llamar(){
        super.eat();
        dormir();
    }
    
    //caso 1
    String color = "cafe";
    void printColor(){
        //valor de la clase Perro
        System.out.println(color);
        //valor de la clase Animal
        System.out.println(super.color);
    }
}

public class SuperTest {
    public static void main(String[] args) {
       //caso 3 Perro p = new Perro();
       //caso 2 new Perro().llamar();
       
       //caso 1
       new Perro().printColor();
    }
}

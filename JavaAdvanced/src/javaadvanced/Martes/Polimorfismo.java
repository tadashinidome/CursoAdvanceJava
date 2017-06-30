
package javaadvanced.Martes;

/*
 Polimorfismo
    Existen 3 formas de polimorfismo:
        1.-Primitivo: Se implenta gracias a la sobrecarga
        2.-Real: Se implementa gracias a las redefinicion de
        metodos.
        3.-Genrico: Se implementa gracias a las clases
        genericas

"Una variable es pilmorfica cuando puede referirsea 
objetos de clases diferentes y en consecuencias puede
adoptar distintos comportamientos".

El polimorfismo permite desplegar comportamientos distintos en las
subclases de una jerarquia de la herencia
cuando ellas activan metodos con la misma firma o 
signatura.

Ej. Empelado e = new Administardor();
Para manupular al empleado como si fuera administardor
es necesario modelar el tipo de la subclase.
El hecho de que una variable apuntadora a un 
objeto (Tal como la cariable "e") pueda refererise atomaticamente
a tipos multiples se llama polimorfismo.

La JVM automaticamente selecciona el metodo apropiado
a tiempo de ejecucion, lo que se denomina
"LIGADURA DINAMICA". En conclucion todas las variables
tipo superclase concretamente son polimorficas.
*/

class Bike2{
    void run(){
        System.out.println("Runnig...!");
    }
}


public class Polimorfismo extends Bike2{
    
    void run(){
        System.out.println("Running safely with 60KM");
    }
    
    public static void main(String[] args) {
        Bike2 b = new Polimorfismo();
        
        /*
        Upcasting -> Cuando la cariable de referencia
        refiere al objeto de la calse hija
        
        class A(){}
        class B() extends a{}
        A a = new B()
        */
        
        b.run();
    }
}

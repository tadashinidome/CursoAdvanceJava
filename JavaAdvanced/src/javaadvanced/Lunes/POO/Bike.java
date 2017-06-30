
package javaadvanced.Lunes.POO;
/*
Clase: Conjuto de objetos con caracteristicas similares
 que se identifican por nombre, atributos y una serie
 de funciones o metodos aplicables a todo el conjunto.
 Es una plantilla para caracterizar o definir objetos.

Abstraccion: Es la facultad intutiva que permite
 conocer la escencia de las cosas.

Modularidad: Es un proceso mental qu epermite distinguir
 los componentes de los objetos que estan siendo estudiados.

Encapsulamiento: Permite ocultar las caracteristicas no
 relevantes de una clase, destacando las relevantes y 
 modelar su comportamiento. Dando como resultado la
 abstraccion de datos.

Herencia: Relacion entre clases cuya existencia deriva
 de un ancestro, clases base delega sus atributos y
 metodos a las clases derivadas.

Polimorfismo: Es el conjunto de operaciones aplicables a
 un objeto por medio de los mensajes que invocan
 a alguno de los metodos definidos en la clase a la que 
 pertensece el objeto de acuerdo al dominio de la aplicacion(contexto)

Objeto: Es una entidad real o imaginaria que tiene identidad, estado y comportamiento,
conforme al conjunto de objetos (clases) a la que pertenece. Es una instancia de una clase.

Mujer mujer = new Mujer();

Una clase en Java contiene lo siguiente:
  Campos
  metodos
  constructores
  bloques
  clases anidadas e interfaces

 class <class_name>{
  field;
  method;
 }
 
 Variables de instacia
 Mujer mujer = new Mujer();

 
*/
public class Bike {
    public static void main(String[] args) {
        /*Bike bici = new Bike();        
        bici.show(); ó */
        show();
    }
    
    //public void show(){ ó
     public static void show(){
        MountainBike bici = new MountainBike();
        bici.setColor("Azul");
        bici.setVelocidad(6);
        String msg = "Soy una bici de montaña";
        msg += " y mi color es: " + bici.getColor();
        msg += " y tengo: " + bici.getVelocidad() + " Velocidades";
        System.out.println(msg);
    }
}



package javaadvanced.Martes;

import javafx.scene.shape.Circle;

/*
Abstraccion: Accion de separar mentalmente la representacion 
de las caracteristicas escenciales
de un objeto, sin incluir antecedentes o detalles
irrelebantes.

Es el proceso natural en los seres humanos de poseer
la facultad intuitiva de conoscer la escencia de las 
cosas.

Existen 5 tipos de abstraccion.
    Funcional, Parametrica, de datos, contextual
    y generica.

Funcional: Sirbe para modelar la interaccion logica,
    es decir como se daran las instrucciones de:
    plateamiento, entrada, procesamiento, salida y
    navegabilidad en el algoritmo.

Datos: Permite delimitar los atributos y sus metodos
    que deben servir para modelar una clase de objetos
    tomando en cuenta sus alcances, sus tipos de datos,
    sus parametros y sus valores de retorno.

Contextual: Proceso mental que comienza con el analisis
    de un fenomeno, amalgamando las abtraciones de datos
    y funcional para integrar una solucion automatizada,
    que utilice de cierto, los acervos de conosimientos
    previos y tome en cuenta las restricciones y los
    riesgos.

Parametrica: Cuando se diseñan los metodos y las 
    operaciones de las abstracciones de datos, funcionales
    y contextuales, puede haber redundancias que es posible
    evitar si se parametrizan apropiadamente y, con esto
    se ahorra codigo y se tiene una mayor legilibildad,
    flexibilidad y mantenibilidad en los desarrollos de
    software.

Generica: Es un tipo especial de abstraccion parametrica
    que se usa en las clases genericas pero en lugar de
    parametrizar variables se parametrizan tipos de datos
    Se objetivo es la reutilizacion de algoritmos.

EN JAVA
Una clase declarada con la palabra reservada Abstract
se considera abstracta de nombre.
Puede ser abstracta con metodos no abstractos.

La abstraccion es un proceso para ocultar los detalles
de implementacion y mostrar solo la funcionalidad al
usuario.

Enviar sms solo escribe el texto y lo envia
no conoscemos el preceso interno sobre la entrada
de mensajes.

La abstraccion permite concentrarse en LO QUE HACE
el objeto en lugar del COMO LO HACE.

Formas de lograr la Abstraccion:
    1.-Clase Abstracta (0 a 100%)
    2.-Interface (100%)

Una clase declarada abstracta necesita ser extendida
(extends) e implemantar sus metodos. No se puede
instaciar.

Abstarct Class A{

Un metodo que es declarado como abstracto no tiene
implementaciones (COMO LO HACE)
abstract void print();
*/

abstract class Shape{
    abstract void draw();
}

class Circulo extends Shape{

    @Override
    void draw() {
        System.out.println("dibujando circulo");  
    }
    
}
        

public class AbstraccionT extends Circulo{
    public static void main(String[] args) {
        Shape s= new AbstraccionT();
        Circulo s2 = new Circulo();
        s.draw();
        s2.draw();
    }

    @Override
    void draw() {
        System.out.println("dibujando...");
    }
}

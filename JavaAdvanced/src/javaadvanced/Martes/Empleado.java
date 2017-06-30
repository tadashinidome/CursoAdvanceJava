
package javaadvanced.Martes;
/*
Herencia: es un mecanismo que permire que 
un obejeto adquiera todas las propiedades y
comportamientos de un objeto padre.

La idea de la herencia es que puedas crear neuvas
clases a partir de las ya existentes.

Existen diversas clasificaciones de relacion
en la herencia.

Relaciones entre clases: Asociancion, composicion,
Agregacion, herencia.

Hay un termino que permite distinguir los distintos
tipos de relaciones, llamado ACOPLAMIENTO.

-Medida de la dependencia que hay entre 2 medulos,
existen grados de acoplamiento(bajo o alto).

-Cada clase y metodo hece una sola cosa y la hace 
bien (COHESION). Numero de tareas que tiene cada
claseo metodo.

-ES desaeble que 2 o mas modulos de un programa 
mantengan alta cohesion y bajo acoplamiento.

Relaciones entre clases:
    Asociacion (es un): cuando entre 2 clases o mas se da
    una interaccion que no modifica en nada el 
    comportamiento de los objetos antes o despues
    de terminada la relacion.


    La asocicion es un modo de interaccion entre
    objetos donde uno utiliza los servicios de
    otro a corto plazo.

    La asociacion es una ralacion de objetos
    debilmente acoplados.

    Agregacion (Tiene un): Es una relacion entre objetos que 
    afectan el acoplamiento entre ellos mientras
    que dura la relacion. Es decir, un objeto
    depende  de los servicios de otro a lasrgo
    plazo.

    Composicion (contiene): cuando un objeto complejo usa otro
    objeto permamnetemente. La composicion es una
    relacion entre objetos cuya escencia tiene sentido
    cuando ellos estan acoplamientos.
    
    Por utltimo podemos decir que la composicion es un tipo
    de agregacion a muy largo plazo.

    Herencia: Cuando un objeto tiene las caracteristicas
    de otro permanentemente, tendremos una relacion
    entre objetos intimamente acoplados cuya esistencia
    depende de un ancestro irrenunciablemente.

    
*/
//Relacion de Asociacion IS-A
public class Empleado {
    double salario = 40000;
}

class Programador extends Empleado{
    int bono = 1000;
    
    public void main() {
        Programador p = new Programador();
        System.out.println("El salario del programador es;"+
                p.salario);
        System.out.println("El bono del programador es:"+
                p.bono);
    }
    void mensaje(){
        System.out.println("Soy un programador");
        main();
    }
}
//-herencia simple Empleado a programador
//Herencia multinivel Empleado a Programador - Web
//Herencia jerarquica Empelado a Programadory
//Empelado aWeb
class Web extends Programador{
    public static void main(String[] args) {
       Web w = new Web();
       w.mensaje();
    }
}

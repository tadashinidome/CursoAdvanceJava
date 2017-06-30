
package javaadvanced.Martes;
/*
    Firma o signatura de un metodo
    es lo que permite distinguir sin 
    ambiguedad a los metodos tanto en la declaracion
    como en la invocacion (Emision de mensajes) y contiene
    3 elementos:
        El valor de retorno(tipo): double
        Nombre del metodo: pow
        Numero, tipo y orden de los parametros:
            Marth.Pow(x,2)  Marth.pow(2,x)

    En la herencia ademas de producir una clase
nuevaq basada en una antigua añadiendo caracteristicas
adicionasles (escialializacion); pude extender
el comportamiento exixtente de la superclase.

Si un metodo se difine en la subclase de medo que
el nombre, el tipo de retorno y su lista de 
parametros coinciden exacetamente con algun
metodo de la clase ancestro, entonces ese nuevo

Los metodos don el mismo nombre, pero diferente
lista de parametros dentro de la misma clase
se consideran simples sobrecargados.
Esto provoca que el campilador utilice los
argumentos proporcionados en un mensaje para
determinar cual metodo ha de hallar.

to overload <- Sobrecargar
to override <- Redefineir(sobremontar)
To overwrite <- sobreescribir

Override: metodos con las misma signatura en 
distintas clases (de una jeraquia de herencia)

Overload: Metodo con el mismo nombre que la clase
y distinta signatura.

Reglas para redifirnir un metodo:
     1.-El tipo de retorno del metodo redefinido debe
     ser identico al del metodo redefinido.
     2.-Un metodo redefinido no puede ser menos
     accesible que un metodo al que redefine.
     superclase es publica, el redifinido no puede ser
     proctected.
     3.-Un metodo redefinido no puede lanzar excepciones 
     diferentes al metodo que redefine.

     Deferencia entre sobrecarrga y redefinicion.
     1.-la sobrecarga(overload) puede cadificarse en 
     una sola clase y la redifinicion (override) requiere
     2 o mas clases.
     2.-Los metodos sobrecargados tienen distinta
     signatura.
     3.-Los metodos redefinidos tienen la mismna
     signatura.

     //sobrecarga
*/
public class Adder {
    //1.-Cambiando el numero de argumentos
    static int add(int a, int b){
        return a+b;
    }
    
    static int add(int a, int b, int c){
        return a+b+c;
    }
    
    //2.- Cambiando el tipo de dato
    static int suma(int c, int d){
        return c+d;
    }
    
    static double suma(double c, double d){
        return c+d;
    }
    
    
    public static void main(String[] args) {
        //1.-Cambiando el numero de argumentos
        System.out.println(Adder.add(111, 222));
        System.out.println(Adder.add(111,222,333));
        
        //2.- Cambiando el tipo de dato
        System.out.println(Adder.suma(11, 22));
        System.out.println(Adder.suma(15.1, 32.2));
    }
    
}

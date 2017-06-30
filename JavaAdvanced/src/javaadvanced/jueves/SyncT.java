
package javaadvanced.jueves;

/*
 La sincronizacion en Java es la capasidad de 
controlar el acceso de multiples hilos encualquier
recurso compartido.

    La sincronizacion es la mejor opcion cuando
queremos permitir que solo un hilo puede acceder
a recursos compartidos.

La sincronizacion es pricipalmenre usada para:
    1.-Prevenir la interferencia de hilos.
    2.-Prevenir problemas de inconsistencia.

Tipos de Sincronizacion
    1.-Procesos
    2.-Hilos: Mutuamente Excluyentes
        1.-Metodos Sincronizado
        2.-Bloqueo Sincronizado
        3.-Sincronizacion estatica

Cooperacion: Comunicacion entre hilos.
Exclusion Mutua: Ayuda a prevenir que los hilos
interfieran entre si mientras comparteb innformacion.

Bloqueo: La sincronizacion se basa en una entidad
interna conoscida como lock o monito. Casa objeto
tiene un bloqueo asociado a el.

Por convencion un hilo necesita un acceso constante
a los campos de un obejto, tiene que adquirir el 
bloqueo del objeto antes de acceder a ellos y a
continuacion liberar el bloqueo cuando hace con
ellos.

Desde Java 5, el pquete Java.util.current.lock
contiene varias implementaciones de bloqueo.
*/

//Entender elproblema de imprimir en desorden
//agregando synchronized imprime en orden
class Tabla{
   synchronized void imprimir(int n){
        for(int i=1; i<5; i++)
        {
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hilo1 extends Thread{
    Tabla t;
    Hilo1(Tabla t){
        this.t =  t;
    }
    
    public void run(){
        t.imprimir(100);
    }
}

class Hilo2 extends Thread{
    Tabla t;
    Hilo2(Tabla t){
        this.t =  t;
    }
    
    public void run(){
        t.imprimir(100);
    }
}

public class SyncT {
    public static void main(String[] args) {
        Tabla ob = new Tabla();
        Hilo1 t1 = new Hilo1(ob);
        Hilo2 t2 = new Hilo2(ob);
        
        t1.start();
        t2.start();
    }
}

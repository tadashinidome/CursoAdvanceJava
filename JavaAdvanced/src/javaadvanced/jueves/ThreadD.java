
package javaadvanced.jueves;

/*
 Un hilo demonio en Java es un hilo proveerdor de
servicios que porporsiona sevicios al hilo de usuario
su vida depende de los demas hilos, es decir si
todos los demas hilos se mueren la JVM lo termina
automaticamente.

Hay muchos hilos demonios en Java que se ejecutan 
automaticamente. Garbage Collector, finalizer, etc.

JConsole en el simbolo de sistema, proporsiona 
la informacion sobres las clases cargadas, uso de
memoria, ejecucion de hilos, etc.

Puntos importanmtes.

Un hilo en java proporsiona sevicios a los hilos 
para brindar soporte a tareas en un segundo plano.

Su vida depende de los hilos de usuario
Es un hilo de baja prioridad.
Java.land.thread provee dos metodos para un demonio

1.-Public setDeamon(boolean status) es usado para marcar
el hilo actual, como un hilo demonio.

2.-public boolean isDemon() revisa si el hilo
actuales un demonio.


*/

public class ThreadD extends Thread{
    
    @Override
    public void run(){        
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Demonio");
        }else{
            System.out.println("no demonio");
        }
        
    }
    
    public static void main(String[] args) {
        ThreadD t1 = new ThreadD(),
                t2 = new ThreadD(),
                t3 = new ThreadD();
        
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}

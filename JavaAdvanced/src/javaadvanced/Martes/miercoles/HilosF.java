
package javaadvanced.Martes.miercoles;

/*
Hilo: Subproceso ligero, unidad pequeña de procesamiento. Es
una via de ejecucion separada.
Los hilos son independientes, si se produce una excpecion
en un hilo no afecta a los demas hilos y comparten un area
en memoria comun.

Ventajas de usar hilos:
    1.-No bloqueamos al usuario por que son 
    tareas al mismo tiempo.
    2.-Podemos realizar muchas tareas simultaneamente
    ahorrando tiempo.
    3.-Los hilos al se independientes no se afectan entres
    si, en caso de ocurrir, una excepcion en un hilo los demas
    funcionan igual.

Multitarea: Proceso de ejecucion de muchas tareas simultaneamente.
Usamos la multitarea en el CPU. Se logra
de dos manera:
    1.-Multitarea basada en Procesos(multiproceso)
        *Cada porceso tiene su propia direccion
        en memoria, es decir, cada proceso tiene
        una area de memoria separada.
        *El proceso es pesado.
        *El costo de la cumuniacaion entre elproceso
        es alto.
        *Cambiar de un proceso a otro requiere de 
        tiempo para guardar y cargar registros mapas
        de memoriaq, lista de actualizaciones
     2.-Multitarea basada eb hilos(Multihilo)
     *Los hilos comparten los mismos espacios en memoria
     para direcciones.
     *El hilo es ligero.
     *El costo de cumunicacion entre hilos es baja.

(Paralelismo) Multihilo
(Concurrencia)Es la propiedad de los sistemas para
soportar, multiples peticiones, auxiliandose de 
multiprocesamientos y multihilos logrando la multitarea.


Ciclo de vida de un hilo.
    Un hilo puede encontrarse en un de sus 5 estados
    de acuerdo con oracle solo hay 4 en el ciclo de vida
    ejecutable (Running) no existe.
    new, runnable, non runnable and terminated

    1.-New: El hilo esta en este estado, si se crea
    una instancia de la clase Thread pero antes de
    la invocacion de start()
    2.-Runnable: El hilo esta aqui, despues de la 
    invocacion del metodo Start(), pero el
    ThreadScheduler (Administrador de hilos) no lo 
    ha seleccionado como el hilo en ejecucion.
    3.-Running: El hilo esta aqui cuando el TS lo
    ha seleccionado.
    4.-Non-Runnable: (Blocked): Es el estado cuando
    el hilo sigue activo, sin embargo no es apto para
    jecutarse.
    5.-Terminated: Es el estado cuando el hilo ha
    finalizado, muerto, cuando sale del metodo run().

Hay 2 formas de crear un hilo:
    1.-Al extender de la clase Thread
    2.-Al implemantar la interface Runnable.

Clase Thread
    Proporciona los costructores y metodos para crear
    y realizar operaciones en un hilo. La clase Thread
    extiende de la clase Objet e implementa la interface
    Runnable.

    Constructores comunes de la clase Thread
    Thread()
    Thread(String name)
    Thread(Runnable r)
    Thread(Runnable, String name)

Runnable
    La interface Runnable debe ser impelamntada por
    cualquier clase cuya instancia estan destinada
    a se ejecutadas por un hilo.
    La inmterface Runnble tiene un solo metodo
    denominado run()
    public void run(): es usado para realizar la
    accion de un hilo.

*/
public class HilosF extends Thread{
    
    @Override
    public void run(){
        System.out.println("El hilo esta corriendo");
    }
    
    public static void main(String[] args) {
        HilosF hilo = new HilosF();
        // ó hilo.start();
        Thread thread = new Thread(hilo);
        thread.start();
    }
}

//Ejemplo de Runnable
class Hilos implements Runnable{

    @Override
    public void run() {
        System.out.println("El hilo de runnable esta corriendo"); 
    }
    
    public static void main(String[] args) {
        Hilos h = new Hilos();
        Thread t = new Thread(h);
        t.start();
    }
    
}

/*
    Metodos CallBacks
    Public void run()
        //Se utiliza para realizar la ccion de un hilo

    public void start()
        //Inicia la ejecucion del hilo.
        //La JVM llama al metodo run() del hilo
     
    public void sleep()
        //Hace que el hilo actual en ejecucion
        //se detenga temporalmente durante el numero
        //especificado en milisegundos
        
    public void join()
        //Espera a que el hilo se muera

    public int getPriority()
        //regresa la propiedad del hilo

    public int setPriority()
        //Cambia la prioridad del hilo

    public String getName()
        //Regresa el nombre del hilo

    public Thread currentThread()
        //Debuelve la referencia al hilo en 
        //ejecucion actual

    public int getID()
        //Devuelve el ID del hilo

    public Thread.state getState()
        //regresa el estado actual del hilo

    public boolean isAlive()
        //prueba si el hilo esta vivo

    public void yield()
        //Hece que el objeto del hilo actualmente
        //en ejecucion, se detenga temporalmente y
        //permita que otros hilos se ejecuten.

    public void suspend()
        //deprecado
        //para suspender el hilo

    public void stop()
        //deprecado
        //Se utiliza para detener el hilo

    public boolen isDeamon()
        //Verifica si el hilo es un demonio

    public void setDeamon()
        //marca el hilo como un demonio

    public void interrupt()
        //interrumpe el hilo

    public boolean interrumpted()
        //veririfca si el hilo se puede interrumpir

    public static boolean interrupted()
        //prueba si el hilo actual se ha interrumpido
*/
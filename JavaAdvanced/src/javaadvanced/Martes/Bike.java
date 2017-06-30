
package javaadvanced.Martes;

/*Constructor de una clase
 Es un conjunto de instrucciones diseñado
para inicializar una instancia de una clase.
En su declaracion o encabezado puede aceptar 
parametros.

Bike b = new Bike();
Bike() <-- Hace referencia al constructor por
omision.

Antes de su ejecucion, b es nul; al final de 
la llamada "b" es un apuntador a un objeto
(referencia) con espacio reservado en RAM
para contener sus valores de atributos y sus
apuntadores a metodos.

¿Por que el constructor no es un metodo?
No puedo llamar al contructor usando el
operdor de indireccion.

carece de un valor de retorno distinto a un
apuntador.
No puede se REDEFINIDO().
No puede ser declarado con un type.
*/

public class Bike {
    //Propiedades del objeto
    int velocidad;
    String color, marca;
    
    //Declaro el cosntructor implicito
    public Bike(){
        
    }
   
    //Inmutable cuando su valor no cambia durante
    //la ejecucion del programa
    public Bike(String color, int velocidad) {
        this.velocidad = velocidad;
        this.color = color;
    }
    
     public Bike(String color) {        
        this.color = color;
    }
    
    public Bike(String color, String marca, int velocidad) {
        this.velocidad = velocidad;
        this.color = color;
        this.marca = marca;
    }
    
    public int getVelocidad(){ return velocidad; }    
    public String getColor() { return color;  }
    public String getMarca() { return marca;  }
    
}

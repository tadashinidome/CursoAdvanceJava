package javaadvanced.Martes;
/*
 Es una variable de autoreferencia.
 This tiene 6 usos en Java.
    This, se usa para referir a la variable de
    instancia de la clase actual.

    This para invocar el metodo de una clase
    actual.
    
    This() para invocar al constructor de una
    clase (actual).

    This puede ser pasada como argumento en 
    la llamada al metodo.

    This puede ser pasada como argumento en 
    la llamada al constructor.

    This se puede utilizar para devolver la
    instacia de la clase actual del metodo.
*/
public class Student {
    int matricula;
    String nombre;
    String universidad;
    
    //caso 6
    public Student(){
        
    }
    
    Student getStudent(){
        return this;
    }
    
    void msg(){
        System.out.println("Soy un mensaje");
    }
    //caso 5
    PruebaEstudiante obj;
    
    public Student(PruebaEstudiante obj){
        this.obj = obj;
    }
    
    void s(){
        System.out.println(obj.dato);
    }
    
    /*public Student(){
        System.out.println("Soy el constructor por dafault");
    }*/
    
    //this caso 3
    public Student(int matricula, String nombre,
              String universidad, int a){
        //this();
        this(matricula, nombre, universidad);
        System.out.println(a);
    }
    
    public Student(int matricula, String nombre,
              String universidad){
        //this caso 1
        this.matricula = matricula;
        this.nombre = nombre;
        this.universidad = universidad;
    }
    
    //this caso 2
    void mensaje(){
        System.out.println("Soy un mesajito");
        this.display();
    }
    
    void display(){
        String msg = "La matricula es: "+ matricula;
        msg+="\n el nombre es: "+nombre;
        msg+="\n la universidad es: "+universidad;
        
        System.out.println(msg);
    }
}



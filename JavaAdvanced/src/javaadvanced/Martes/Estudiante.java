
package javaadvanced.Martes;
/*
    La palabra reservada estatic es usada para la
la administracion de memoria principalmente. 
Es aplicada a variables, metodos, bloques 
y clases anidadas.
 La palabra static pertenece a la clase que la 
instancia.

Para variable: Se puede utilizar para referir una
propiedad comun en todos los objetos.
La variable estaqtica obtiene memoria solo una vez
en el area de la clase en el momento que se crea.

Promueve la eficiencia en el rendimiento del programas

*/
public class Estudiante {
    int matricula;
    String nombre;
    static String universisdad = "LAQUESEA";
    
    Estudiante(int m, String n){
        matricula = m;
        nombre = n;
    }
    
    void show(){
        System.out.println(matricula +" "+nombre
        +" "+universisdad);
    }
            
    public static void main(String[] args) {
        Estudiante s1 = new Estudiante(111, "Fer");
        Estudiante s2 = new Estudiante(112, "Emmanuel");
        
        s1.show();
        s2.show();
    }
}

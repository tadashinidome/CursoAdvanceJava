
package javaadvanced.Lunes;

/**
 * 
 * @author CC-06
 * 
 * 
 */
public class JavaAdvanced {
    static int edad = 20;
    public static void main(String args) {
        
        if(edad > 18){ 
            System.out.println("Es mayo de edad");           
        }else{
            System.out.println("Es menor de edad");
        }
        
        String nombre;
        nombre = "Fernanda";
        
        if (!nombre.isEmpty()) {
            System.out.println(nombre);            
        }else{
            System.out.println("Esta vacio!");
        }
            
    }
 
    public static void main(String[] args) {
        int calif = 65;
        
        if (calif < 70) {
            System.out.println("Recursa");
        }else if (calif >= 70 && calif <= 75) {
            System.out.println("Panzo");
        }else if (calif >= 76 && calif <=80) {
            System.out.println("OK");
        }
        
    }
}

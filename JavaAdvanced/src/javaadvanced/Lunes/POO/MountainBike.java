
package javaadvanced.Lunes.POO;


public class MountainBike {
    int velocidad;
    String color;

    public int getVelocidad() {
        return velocidad;
    }

    protected boolean setVelocidad(int velocidad) {
        if (velocidad > 0) {
          this.velocidad = velocidad;    
          return true;
        }else{
            return false;
        }
        
    }

    public String getColor() {
        return color;
    }

    public boolean setColor(String color) {
        if (!color.isEmpty()) {
            this.color = color;
            return true;
        }else{
            return false;
        }
        
    }


}

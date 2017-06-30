
package javaadvanced.Martes.miercoles.banco3;

public interface Drawable {
    void draw();
}

class SuperHeroe implements Drawable{
    public void draw(){
        System.out.println("Dibujando acuaman");
    }
}

class SupeVillano implements Drawable{
    public void draw(){
        System.out.println("Dibujando villano");
    }
}

class Historia{
    public static void main(String[] args) {
        Drawable d, e;
        d = new SuperHeroe();
        e = new SupeVillano();
        
        d.draw();
        e.draw();
        
    }
}

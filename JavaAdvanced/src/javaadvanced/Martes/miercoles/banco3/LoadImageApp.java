/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes.miercoles.banco3;

/**
 *
 * @author CC-06
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class LoadImageApp  extends Component{
    BufferedImage img;
 
    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }
 
     public LoadImageApp() {
         
     }
    
    public LoadImageApp(String nom) {
       try {
           //img = ImageIO.read(new File("strawberry.jpg"));
           //img = ImageIO.read(new File("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\track1.jpg"));
           img = ImageIO.read(new File(nom));
           
       } catch (IOException e) {
       }
 
    }
 
    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }
 
    public void ShowImagen(String nom){
        JFrame f = new JFrame("Load Image Sample");
             
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
 
        
        f.add(new LoadImageApp(nom));
        f.pack();
        f.setVisible(true);
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(e);
        }    
        
        f.setVisible(false);       
        
        
    }
    
    public static void main(String[] args) {
 
       /* JFrame f = new JFrame("Load Image Sample");
             
        f.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
 
        f.add(new LoadImageApp());
        f.pack();
        f.setVisible(true);
        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    
        
        f.setVisible(false);*/
       LoadImageApp img = new LoadImageApp();
       img.ShowImagen("C:\\Users\\CC-06\\Desktop\\curso java\\curso java\\track1.jpg");
    }
}

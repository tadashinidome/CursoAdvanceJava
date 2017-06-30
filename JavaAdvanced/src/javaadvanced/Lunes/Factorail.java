/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Lunes;
import java.util.Scanner;

/**
 *
 * @author CC-06
 */
public class Factorail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Intrdusca un numero:");
        num = input.nextInt();
        for(int i= num; i>=0; i--)
        {
            System.out.println(i);
        }
        
        
        
    }
}

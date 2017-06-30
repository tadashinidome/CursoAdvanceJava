/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Lunes;

/**
 *
 * @author CC-06
 */
public class Ordenamiento {
    public static void main(String[] args) {
        int arr[] = { 35, 46, 34, 45, 56, 67};
        int aux=0;
        //int may= arr[0];
        for(int i= 0; i<arr.length; i ++)
        {            
            for(int j= 1; j<(arr.length-i); j ++){
                if(arr[j-1] > arr[j])
                {                    
                    aux = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = aux;
                }
              
            }       
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}

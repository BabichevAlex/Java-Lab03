/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;

/**
 *
 * @author 1710502
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Random r = new Random();
        System.out.println("");
        int size = 10;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(10);
        }
        for (int i = 0; i < size; i++)
            if (arr[i] >5 )
                System.out.print(arr[i] + " ");
        
            
        
        System.out.println("\n Числа >5");
       
    }
}
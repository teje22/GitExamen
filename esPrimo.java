/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author PabloTejedorRivadull
 */
public class esPrimo {
    public static boolean esPrimo(int n){
        int i=2;
        while(i<n){
            if(n%i==0)
                return false;
            i++;
        }
        return true;
    }
    
}

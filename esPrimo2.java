/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PabloTejedorRivadull
 */
public class esPrimo2 {
    public static boolean esPrimo(int n){
        int i=2;
        if(n<1){
            return false;
        }
        while(i<n){
            if(n%i==0)
                return false;
            i++;
        }
        return true;
    }
}

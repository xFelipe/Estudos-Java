/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author felipe
 */
public class Vetor04 {

    public static void main(String[] args) {
        int vet[] = {1,2,3,4,5,6,7,8,9};
        for(int n:vet){
            System.out.println(n);
        }
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição "+p);        
    }
    
}

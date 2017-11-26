/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author felipe
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double x[] = {2.5, 3.3, 5.8, 5.1, 0.98};
    Arrays.sort(x);//organiza por valor
    
    for(double valor:x){
        System.out.println(valor);
    }
    }
    
}

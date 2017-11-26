/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int p = tec.nextInt();
        String tipo;
        
        switch (p){
            case 1: tipo = "Saci";
                    break;
            case 2: tipo = "Bipede";
                    break;
            case 3: tipo = "Tripé";
                    break;
            case 4: tipo = "Quadrupede";
                    break;
            case 6: tipo = "Aranha";
                    break;
            case 8: tipo = "Aranha";
                    break;
            default: tipo = "ET";
                    break;
        }
        System.out.println("Isso é um(a): "+tipo);
        
    }
    
}

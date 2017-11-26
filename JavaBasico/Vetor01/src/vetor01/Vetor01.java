/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author felipe
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int n[] =  new int[4]; Fazer atribuições 1 por 1
        int n[] = {03,14,25,36,47,58};
        System.out.println("O total de casas de n é "+n.length);
        for(int c=0;c<n.length;c++){
            System.out.println("Na posição "+c+" temos o Valor: "+n[c]);
        }
        
    }
    
}

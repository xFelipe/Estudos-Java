/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int idade = 2017-(i.nextInt());
        if(idade>=18){
            System.out.println("Você tem "+idade+" anos e é MAIOR de idade!");
        }
        else{
            System.out.println("Você tem"+idade+"anos e é MENOR de idade!");
        }
    
    }
}

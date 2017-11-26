/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02proposta;

/**
 *
 * @author felipe
 */
public class Aula02proposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aula a1 = new Aula();
        a1.curso = "Java";
        a1.duracao = 200;
        a1.nAula = 2;
        a1.materia = "Funções";
        a1.programaAula();
        a1.status();
        System.out.println("Idade: "+CalcIdade.calcIdade(27,01,1995)+" anos");// É UM TESTE
    }
    
}

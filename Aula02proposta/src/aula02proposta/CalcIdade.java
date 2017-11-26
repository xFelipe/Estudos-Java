/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula02proposta;

import java.util.Calendar;


/**
 *
 * @author felipe
 */
public class CalcIdade {
    public static int calcIdade(int dia, int mes, int ano){
        Calendar hoje = Calendar.getInstance();
        int idade;
        int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);
        int mesHoje = hoje.get(Calendar.MONTH);
        int anoHoje = hoje.get(Calendar.YEAR);
        //calcula idade
        idade = anoHoje-ano;
        if(mesHoje<mes || (mesHoje == mes && diaHoje<dia)){
            idade-=1;
        }
        return idade;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02proposta;


public class Aula {
    String curso;
    String materia;
    int nAula;
    int duracao;
    private int min, seg;
    private String status; 
    
    void anulaAula(){
        this.status = "Anulada";
    }
    void ativaAula(){
        this.status = "Aula no ar";
    }
    void programaAula(){
        this.status = "Aula programada";
    }
    void status(){
        System.out.println("Curso: "+this.curso);
        System.out.println("Matéria: "+this.materia);
        System.out.println("Aula número: "+this.nAula);
        this.min = duracao/60;
        this.seg = duracao%60;
        System.out.println("Duração: "+this.min+":"+this.seg);
        System.out.println("Estado: "+this.status);
    }
}

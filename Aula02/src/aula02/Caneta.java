/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta "+this.ponta);
        System.out.println("Carga: "+this.carga+"%");
        if (this.tampada){
            System.out.println("Estado: tampada");
        }
        else{
            System.out.println("Estado: Destampada");
        }
    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso rabiscar!");
        }
        else{
            System.out.println("Eu estou rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}

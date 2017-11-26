/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;


public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
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
    private void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Não posso rabiscar!");
        }
        else{
            System.out.println("Eu estou rabiscando!");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}

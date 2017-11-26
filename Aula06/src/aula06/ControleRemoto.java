/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author felipe
 */
public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos especiais
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setLigado(false);
    }
    private int getVolume(){
        return this.volume;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
        System.out.println("-----MENU-----");
        System.out.println("Está ligado:? "+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.print("Volume: ");
        for(int c=0;c<this.volume;c+=5){
            System.out.print("[]");
        }
        } else{
            System.out.println("Impossível exibir menu.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() && this.getVolume()<100){
            this.setVolume(this.getVolume()+5);
        } else{
            System.out.println("Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(this.getVolume()-5);
        } else{
            System.out.println("Impossível diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}

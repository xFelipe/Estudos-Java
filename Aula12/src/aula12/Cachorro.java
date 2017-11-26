/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author felipe
 */
public class Cachorro extends Mamifero {
    //Métodos
    public void enterrarOsso(){
        System.out.println("Osso enterrado!");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabinho.");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo!");
    }
}

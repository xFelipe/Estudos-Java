/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author felipe
 */
public class Mamifero extends Animal {
    protected String corPelo;
    
    @Override
    protected void emitirSom(){
        System.out.println("Som de mamífero.");
    }
}

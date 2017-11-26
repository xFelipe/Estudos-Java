
package aula12;


public class Canguru extends Mamifero {
    //Métodos
    public void usarBolsa(){
        System.out.println("Filho sendo protegido!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Canguru saltando!");
    }
}

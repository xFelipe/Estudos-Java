
package aula12;


public class Reptil extends Animal {
    //Atributos
    protected String corEscama;

    //Métodos
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    @Override
    public void locomover() {
        System.out.println("Réptil de locomove.");
    }

    @Override
    public void alimentar() {
        System.out.println("Réptil se alimenta.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil.");
    }
    
}


package aula12;

public class Mamifero extends Animal {
    protected String corPelo;
    
    
    @Override
    public void locomover() {
        System.out.println("Mamífero se movendo.");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Mamífero emitindo som.");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}

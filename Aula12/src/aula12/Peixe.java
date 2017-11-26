
package aula12;

public class Peixe extends Animal {
    protected String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Peixe nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe se alimenta.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som.");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolha...  o O ");
    }
    
    
    
}

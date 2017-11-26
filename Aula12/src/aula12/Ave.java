
package aula12;

public class Ave extends Animal {
    //Atributo
    private String corPena;

    //Métodos
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Ave voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Ave comendo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ave piando.");
    }
    
    public void fazerNinho(){
        System.out.println("Ninho feito.");
    }
    
}

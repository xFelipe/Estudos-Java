
package aula11;

public final class Bolsista extends Aluno {
    //Atributos
    private float bolsa;
    
    //Métodos
    
    public void renovarBolsa(){
        System.out.println("Bolsa de "+this.getNome()+" renovada.");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("R$"+(400-(400*(this.getBolsa()/100f)))+" Pagos!");
    }
    
    
    public float getBolsa(){
        return this.bolsa;
    }
    
    public void setBolsa(float b){
        this.bolsa = b;
    }

    @Override
    public String toString() {
        return "Bolsista{"  + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", matricula=" + matricula + ", curso=" + curso +  "bolsa=" + bolsa + '}';
    }
    
    
}

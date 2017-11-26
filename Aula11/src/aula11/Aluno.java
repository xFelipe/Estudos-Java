
package aula11;

public class Aluno extends Pessoa {
    //Atributos
    protected int matricula;
    protected String curso;

    //Métodos
    public void pagarMensalidade(){
        System.out.println("R$400,00 Pagos!");
    }
    
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", matricula=" + matricula + ", curso=" + curso + '}';
    }

    
    
    
    
    
}

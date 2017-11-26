package aula11;

public final class Tecnico extends Aluno {
    private int registroProfissional;

    public void praticar(){
        System.out.println("Praticando...");
    }
    
    
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "Tecnico{"+ this.getNome() + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", matricula=" + matricula + ", curso=" + curso + "registroProfissional=" + registroProfissional + '}';
    }
    
    
    
}

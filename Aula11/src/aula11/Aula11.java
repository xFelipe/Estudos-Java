package aula11;


public class Aula11 {

    public static void main(String[] args) {
        Visitante vit = new Visitante();
        Aluno a = new Aluno();
        a.setCurso("Avalala");
        a.setNome("telele");
        a.setIdade(20);
        a.setSexo("M");
        System.out.println(a.toString());
        a.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.curso = "Informática Básica";
        b1.setBolsa(1);
        b1.setNome("Bárbara");
        b1.renovarBolsa();
        b1.setBolsa(50f);
        b1.pagarMensalidade();
    }
    
    
    
    
}

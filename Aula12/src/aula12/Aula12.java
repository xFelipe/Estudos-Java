
package aula12;


public class Aula12 {


    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        
        m1.setCorPelo("Azul");
        m1.setIdade(3);
        m1.setMembros(4);
        m1.setPeso(10);
        
        System.out.println(m1.getCorPelo());
        System.out.println(m1.getIdade());
        System.out.println(m1.getMembros());
        System.out.println(m1.getPeso());
        m1.alimentar();
        m1.emitirSom();
        m1.locomover();
        System.out.println("\n");
        
        Ave a1 = new Ave();
        a1.setCorPena("Azul");
        System.out.println(a1.getCorPena());
        a1.alimentar();
        a1.emitirSom();
        a1.fazerNinho();
        a1.locomover();
        
        System.out.println("\n");
        Canguru c1 = new Canguru();
        c1.locomover();
        
        System.out.println("\n");
        Cachorro k1 = new Cachorro();
        k1.emitirSom();
    }
    
}

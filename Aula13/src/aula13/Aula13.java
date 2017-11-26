
package aula13;


public class Aula13 {

    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        m1.emitirSom();
        
        Lobo l1 = new Lobo();
        l1.emitirSom();
        
        Cachorro c1 = new Cachorro();
        c1.reagir("oLÁ");
        c1.reagir(20, 0);
        c1.reagir(false);
        c1.reagir(2, 5f);
    }
    
}

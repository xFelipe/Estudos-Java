
package projetolivro;

import java.util.Calendar;


public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", "M", 27, 02, 1996);
        p[1] = new Pessoa("Maria", "F", 10, 7, 1995);
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 250,p[1]);
        l[2] = new Livro("Java Avançado", "Maria Cândido", 268, p[0]);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        
        
        l[0].abrir();
        l[0].folhear(200);
        System.out.println(l[0].detalhes());
    }
    
}

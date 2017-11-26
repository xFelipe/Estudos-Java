
package aula14;

public class Aula14 {

    public static void main(String[] args) {
        //Implementação dos vídeos
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString()+"\n \n");
        
        //implementação dos gafanhotos
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Felipe", 22, "M", "Xumbo");
        System.out.println(g[0].toString());
        
        g[1] = new Gafanhoto("Creuza", 17, "F", "Crecrê");
        System.out.println(g[1].toString()+"\n\n");
        
        
        //implementação das visualizações
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[2]);
        vis[0].avaliar(5f);
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[1].avaliar(1);
        vis[1].avaliar(5f);
        vis[1].avaliar(7);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        
    }
    
}

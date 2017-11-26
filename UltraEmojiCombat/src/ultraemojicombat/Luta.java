package ultraemojicombat;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos especiais
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }
        else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Impossível marcar luta");
        }
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("###DESAFIADO###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("==== RESULTADO DA LUTA ====");
            switch(vencedor){
                case 0://empate
                    System.out.println("A luta empatou!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1://desafiante ganha
                    System.out.println(this.desafiante.getNome().toUpperCase()+"(desafiante) É O VENCEDOR!!!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2://desafiado ganha
                    System.out.println(this.desafiado.getNome().toUpperCase()+"(desafiado) É O VENCEDOR!!!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            }
            System.out.println("===========================");
        }else{
            System.out.println("A luta não pode acontecer");
        }
    }
    
    

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}

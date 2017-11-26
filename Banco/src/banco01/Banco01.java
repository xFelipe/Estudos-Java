package banco01;
public class Banco01 {

    public static void main(String[] args) {
        Conta c = new Conta();
        
        c.setnumConta(1);
        c.abrirConta("CP");
        c.abrirConta("CC");
        c.setDono("Adoniram Barbosa");
        c.depositar(500);
        c.fecharConta();
        c.estadoAtual();
        
        
        Conta c2 = new Conta();
        
        c2.abrirConta("CC");
        c2.setnumConta(2);
        c2.setDono("Elvira Trindade");
        c2.sacar(50);
        c2.fecharConta();
        c2.estadoAtual();
        
    }
    
}

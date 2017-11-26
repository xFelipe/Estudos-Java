package banco01;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;     //true aberta, false fechada

    public void estadoAtual(){
        System.out.println(" --------------------------- ");
        System.out.println("Conta: "+this.getnumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.printf("Saldo: R$%.2f\n",this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println(" --------------------------- ");
    }
    public Conta() {
        this.status = false;
        this.saldo = 0;
    }
    

    
    //Abertura e fechamento
    public void abrirConta(String t){
        if(t.equals("CC") && !this.status){
            this.setTipo(t);
            this.setStatus(true);
            this.saldo = 50;
            System.out.println("Conta corrente aberta com sucesso!");
        }
        else if(t.equals("CP") && !this.status){
            this.setTipo(t);
            this.setStatus(true);
            this.saldo = 150;
            System.out.println("Conta poupança aberta com sucesso!");
        }
        else{
            System.out.println("Operação cancelada. Conta aberta ou comando inválido");
        }
        
    }
    public void fecharConta(){
        if(this.saldo == 0 && this.status){
            this.status = false;
        }
        else{
            System.out.println("A conta precisa estar com o saldo zerado e estar aberta para ser fechada.");}
    }
    //Transações
    public void depositar(double d){
        if (this.status){
            this.saldo+=d;
            System.out.println("Depósito realizado com sucesso na conta de: "+this.getDono());
        }
        else{
            System.out.println("Impossível depositar em conta fechada!");}
    }
    public void sacar(double s){
        if (this.status){
            if(this.saldo>=s){
                this.saldo-=s;
                System.out.println("Saque realizado na conta de "+this.getDono());
            }
            else
                System.out.println("Saldo insuficiente.");
        }
        else
            System.out.println("Não é possível realizar esta transação em contas fechadas");
    }
    
    public void pagarMensalidade(){
        if(this.tipo.equals("CC") && this.status){
            this.setSaldo(this.getSaldo()-12);
        }
        else if(this.tipo.equals("CP") && this.status){
            this.saldo -= 20;
        }
        else{
            System.out.println("Conta não especificada ou conta não encontra-se aberta.");
        }
    }

    //Getters e setters
    public int getnumConta(){
        return this.numConta;
    }
    public void setnumConta(int nc){
        this.numConta = nc;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        if(t.equals("CC") || t.equals("CP")){
            this.tipo = t;}
        else{
            System.out.println("Tipo de conta inválido");}
    }
    
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    
    public double getSaldo(){
       return this.saldo;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    
}

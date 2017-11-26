package ultraemojicombat;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates, invicto;
    
    //Métodos públicos
    public void apresentar(){
        System.out.println("CHEGOU A HORA!!! COM VOCÊS, "+this.getNome().toUpperCase());
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println(this.getIdade()+" anos");
        System.out.println(this.getAltura()+"m de altura");
        System.out.println("Pesando "+this.getPeso()+"Kg");
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates:"+this.getEmpates());
        if(this.getInvicto()>3){
            System.out.println("Invicto a "+this.getInvicto()+" partidas");
        }
        System.out.println("\n--------------\n");
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso "+this.getCategoria());
        System.out.println(this.getVitorias()+" vitórias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
        if(this.getInvicto()>3){
            System.out.println("Está a "+this.getInvicto()+" lutas invicto");
        }
        System.out.println("\n--------------\n");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
        this.setInvicto(this.getInvicto()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
        this.setInvicto(0);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    
    //Métodos especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    private void setInvicto(int invicto) {
        this.invicto = invicto;
    }
    
    

    public String getNome() {
        return nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private float getAltura() {
        return altura;
    }

    private float getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    private int getVitorias() {
        return vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private int getInvicto() {
        return invicto;
    }
    
    
    
}

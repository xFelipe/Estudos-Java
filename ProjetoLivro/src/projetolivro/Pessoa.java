package projetolivro;

import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    //Atributos
    private String nome;
    public int nascDia, nascMes, nascAno;
    public Calendar hoje = Calendar.getInstance();
    private String sexo;

    public Pessoa(String nome, String sexo,int dia, int mes, int ano) {
        this.nome = nome;
        this.sexo = sexo;
        this.setNascimento(dia, mes, ano);
    }

    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaNascimento() {
        return this.nascDia;
    }
    public int getMesNascimento(){
        return this.nascMes;
    }
    public int getAnoNascimento(){
        return this.nascAno;
    }

    public void setNascimento(int dia, int mes, int ano) {
        if((dia <= 31 && dia>0) && (mes<=12 && mes>0) && ano<=hoje.get(Calendar.YEAR))
        {
        this.nascDia=dia;
        this.nascMes=mes;
        this.nascAno=ano;
        }else{System.out.println("Data inválida");}
        }

    private Calendar getHoje() {
        return hoje;
    }

    public String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNascDia() {
        return nascDia;
    }
    

    public int getNascMes() {
        return nascMes;
    }

    public int getNascAno() {
        return nascAno;
    }

    
    
    
    
    public int getIdade(){
        int idade = hoje.get(Calendar.YEAR)-this.getNascAno();
        if(this.hoje.get(Calendar.MONTH)+1 < this.nascMes){
            idade -= 1;
        }else if(this.hoje.get(Calendar.MONTH)+1==this.getNascMes() && this.hoje.get(Calendar.DATE) < this.getDiaNascimento()){
            idade -= 1;
        }
        return idade;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author felipe
 */
public class Video implements AcoesVideo {
    //Atributos
    private String titulo;
    private int avaliacao;
    private long views;
    private long curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo=false;
    }

    
    
    //Métodos
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova = 0;
        nova =(int) (this.getAvaliacao() * (this.getViews()-1));
        nova = nova + avaliacao;
        nova = (int) (nova / this.getViews());
        this.avaliacao = nova;
        System.out.println(this.titulo+"getAva:"+this.getAvaliacao());
        //this.avaliacao = avaliacao;
    }

    

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public long getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(long curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo="+ titulo + ","
                + "avaliacao=" + avaliacao + ", views=" + views
                + ", curtidas=" + curtidas + ", reproduzindo="
                + reproduzindo + '}';
    }
    
    
    
    
}

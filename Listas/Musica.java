import java.util.ArrayList;

public class Musica{
    private String nome;
    private int duracaoEmSegundo;
    private int popularidade;
    private String genero;
    

    public Musica(String nome, int duracaoEmSegundo, int popularidade, String genero)){ //Construtor da música;
        this.nome = nome;
        this.duracaoEmSegundo = duracaoEmSegundo;
        this.popularidade = popularidade;
        this.genero = genero;
    }
    public Musica(){ //Construtor vazio;

    }
    public void getMusica(){
        return this.nome;
    }
}
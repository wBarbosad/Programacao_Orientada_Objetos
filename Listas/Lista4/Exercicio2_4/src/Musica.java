public class Musica {
    private String nome;
    private int duracaoEmSegundo;
    private int popularidade;
    private String genero;


    public Musica(String nome, int duracaoEmSegundo, int popularidade, String genero){ //Construtor da música;
        this.nome = nome;
        this.duracaoEmSegundo = duracaoEmSegundo;
        this.popularidade = popularidade;
        this.genero = genero;
    }
    public Musica(){ //Construtor vazio;

    }
    public String getNomeMusica(){
        return nome;
    }
    public int getPopularidade(){
        return popularidade;
    }
    public int getDuracaoEmSegundo(){
        return duracaoEmSegundo;
    }
    public void setPopularidade(int popularidade){
        this.popularidade = popularidade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
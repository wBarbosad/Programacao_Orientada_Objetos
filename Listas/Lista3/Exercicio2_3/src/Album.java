import java.util.ArrayList;

public class Album {
    String nome;
    String nomeArtista;
    ArrayList<Musica> musicas = new ArrayList<>();

    public Musica getMusicaMaiorPopularidade(){
        int maiorPopularidade = 0;
        int posicao = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if(musicas.get(i).popularidade>maiorPopularidade){
                maiorPopularidade = musicas.get(i).popularidade;
                posicao = i;
            }
        }
        return musicas.get(posicao);
    }
    public  Musica getMusicaMenorDuracao(){
        int menorDuracao = 0;
        int posicao = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if(musicas.get(i).duracaoEmSegundos>menorDuracao){
                menorDuracao = musicas.get(i).duracaoEmSegundos;
                posicao = i;
            }
        }
        return musicas.get(posicao);

    }

}

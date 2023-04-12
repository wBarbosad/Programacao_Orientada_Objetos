import java.util.ArrayList;

public class Album {
    String nome
    String nomeArtista
    ArrayList<Musica> musicas = new ArrayList<>()

    public Musica getMusicaMaiorPopularidade(){
        int maiorPopularidade = 0;
        int posicao = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if(musicas[i]>maiorPopularidade){
                maiorPopularidade=musicas[i];
                posicao = i;
            }
        }
        return musica[posicao];
    }
    public  Musica getMusicaMenorDuracao(){
        int menorDuracao = 0;
        int posicao = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if(musicas[i]>menorDuracao){
                menorDuracao=musicas[i];
                posicao = i;
            }
        }
        return musica[posicao];

    }

}

import java.util.ArrayList;

public class Album {
    private String nomeAlbum;
    private String nomeArtista;
    ArrayList<Musica> musicas = new ArrayList();

    public Album(String nomeAlbum) { // Construtor album;
        this.nomeAlbum = nomeAlbum;
    }

    public Musica getMusicaMaiorPopularidade() {
        int maiorPopularidade = 0;
        int posicao = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getPopularidade() > maiorPopularidade) {
                maiorPopularidade = musicas.get(i).getPopularidade();
                posicao = i;
            }
        }
        return musicas.get(posicao);
    }

    public Musica getMusicaMenorDuracao() {
        int menorDuracao = 0;
        int posicao = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getDuracaoEmSegundo() > menorDuracao) {
                menorDuracao = musicas.get(i).getDuracaoEmSegundo();
                posicao = i;
            }
        }
        return musicas.get(posicao);
    }
}
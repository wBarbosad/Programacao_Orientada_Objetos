public class Main {
    public static void main(String[] args) {
        Album album = new Album();
        Musica musica1 = new Musica();
        Musica musica2 = new Musica();

        musica1.duracaoEmSegundos = 70;
        musica2.duracaoEmSegundos = 80;
        album.musicas.add(musica1);
        // album > musicas (lista) e adicionar cada uma das músicas que coloquei aqui na lista;
        album.musicas.add(musica2);

        int menorDuracao = album.getMusicaMenorDuracao();

    }
}
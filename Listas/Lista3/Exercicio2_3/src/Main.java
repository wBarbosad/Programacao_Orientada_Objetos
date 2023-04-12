public class Main {
    public static void main(String[] args) {

        Album album = new Album();
        Musica musica1 = new Musica();
        musica1.duracaoEmSegundos = 70;
        musica1.popularidade = 500000;

        Musica musica2 = new Musica();
        musica2.duracaoEmSegundos = 80;
        musica2.popularidade = 6000000;

        album.musicas.add(musica1);
        // album > musicas (lista) e adicionar cada uma das músicas que coloquei aqui na lista;
        album.musicas.add(musica2);

        Musica menorDuracao = album.getMusicaMenorDuracao();
        Musica popularidade = album.getMusicaMaiorPopularidade();

        System.out.println(menorDuracao.duracaoEmSegundos);
        System.out.println(popularidade.popularidade);



    }
}
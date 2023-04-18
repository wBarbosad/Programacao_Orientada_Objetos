public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Balada a noite", 80, 10000, "Pagode");
        Musica musica2 = new Musica("A arte do fogo", 90, 150000, "Sertaneko");
        Album album1 = new Album("Embalada");
        album1.musicas.add(musica1);
        album1.musicas.add(musica2);

        Musica menorDuracao = album1.getMusicaMenorDuracao();
        Musica popularidade = album1.getMusicaMaiorPopularidade();

        System.out.println(menorDuracao.getDuracaoEmSegundo());
        System.out.println(popularidade.getPopularidade());
    }
}
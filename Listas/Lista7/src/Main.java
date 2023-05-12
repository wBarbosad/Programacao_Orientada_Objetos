public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        fabrica.adicionarOperario(new OperadorDeCorte());
        fabrica.adicionarOperario(new OperadorDeDobra());
        fabrica.adicionarOperario(new OperadorDePrensa());
        fabrica.iniciarExpediente();
    }
}
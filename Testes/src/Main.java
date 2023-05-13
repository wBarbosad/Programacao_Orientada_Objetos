public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        fabrica.adicionarOperarios(new Cortador());
        fabrica.iniciarExpediente();
    }
}
public class Lutas {
    String transmissoes;
    String data;
    String organizador;
    String premiacoes;

    Lutadores lutador1 = new Lutadores();
    Lutadores lutador2 = new Lutadores();

    public void apresentar(){
        System.out.println("De um lado, pesando " + lutador1.peso + "Kg, temos " + lutador1.nome);
        System.out.println("De um lado, pesando " + lutador2.peso + "Kg, temos " + lutador2.nome);
    }
    public void iniciarLuta(){
        System.out.println("Lutador 1, golpeou: ");
        lutador1.golepar();

        System.out.println("Lutador 2, golpeou: ");
        lutador2.golepar();

    }
}

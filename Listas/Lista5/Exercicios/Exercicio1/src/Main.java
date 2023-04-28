public class Main {
    public static void main(String[] args) {
        int somaMoedas = 0;
        Heroi heroi1 = new Heroi(1, "TremBala", 10);
        Heroi heroi2 = new Heroi(2, "BalaTensa", 20);
        Heroi heroi3 = new Heroi(3, "SrSalazar", 50);
        Heroi heroi4 = new Heroi(3, "Masa", 100);
        Grupo grupo = new Grupo();

        System.out.println("\n");
        grupo.adicionarHeroi(heroi1);
        grupo.adicionarHeroi(heroi2);
        grupo.adicionarHeroi(heroi3);
        grupo.adicionarHeroi(heroi4);

        grupo.removerHeroi(1);

        System.out.println("\nO grupo tem = " + grupo.getTotalMoedasDeOuro() + " moedas!");



    }
}
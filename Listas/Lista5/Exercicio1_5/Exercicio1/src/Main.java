public class Main {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi(1, "TremBala", 10);
        Heroi heroi2 = new Heroi(2, "BalaTensa", 20);
        Grupo grupo = new Grupo();

        grupo.adicionarHeroi(heroi1);
        grupo.adicionarHeroi(heroi2);

        for (int i = 0; i < grupo.getHerois().size(); i++) { //Fazer isso com as moedas.
            System.out.println(grupo.getHerois().get(i).getNome());
        }
    }
}
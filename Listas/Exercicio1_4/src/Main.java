public class Main {
    public static void main(String[] args) {
        Inimigo inimigo1 = new Inimigo(10, 5, 30, "Goblin");
        Inimigo inimigo2 = new Inimigo(50, 60, 70, "Bipilim");

        Mapa mapa1 = new Mapa("Colina da morte", 700, 800);
        mapa1.inimigos.add(inimigo1);
        mapa1.inimigos.add(inimigo2);

        mapa1.inimigos.add(inimigo2);
        System.out.println(inimigo1.getAtaque());
        inimigo1.setAtaque(5);
        System.out.println(inimigo1.getAtaque());
        System.out.println("Defesa do " + inimigo1.nome + " é " + inimigo1.getDefesa());
        Inimigo maiorAtaque = mapa1.getInimigoMaiorAtaque();
        System.out.println(maiorAtaque.getAtaque());

    }
}
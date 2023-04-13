public class Main {
    public static void main(String[] args) {
        Inimigo inimigo1 = new Inimigo();
        Inimigo inimigo2 = new Inimigo();

        inimigo1.ataque = 4500;
        inimigo2.ataque = 5000;

        Mapa mapa = new Mapa();
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);


        Inimigo maiorAtaque = mapa.getInimigoMaiorAtaque();
        System.out.println(maiorAtaque.ataque);
    }
}
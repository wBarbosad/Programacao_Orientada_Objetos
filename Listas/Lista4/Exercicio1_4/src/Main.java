public class Main {
    public static <String> void main(String[] args) {
        Inimigo inimigo1 = new Inimigo(45, 60, 700);
        Inimigo inimigo2 = new Inimigo();



        //inimigo1.ataque = 4500; [Quando não tinha construtor]
        //inimigo2.ataque = 5000; [Quando não tinha construtor]

        Mapa mapa = new Mapa();
       // mapa.inimigos.add(inimigo1);
        // mapa.inimigos.add(inimigo2);


        //Inimigo maiorAtaque = mapa.getInimigoMaiorAtaque();
        //System.out.println(maiorAtaque.ataque);
    }
}
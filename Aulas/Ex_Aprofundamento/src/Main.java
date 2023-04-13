public class Main {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi();
        Ferreiro loja = new Ferreiro();
        Mapa mapa = new Mapa();
        Inimigo inimigo1 = new Inimigo();
        int danos;

        mapa.nome = "Colinas da morte";

        inimigo1.ataque = 1000;
        inimigo1.defesa = 3000;
        inimigo1.pontos = 2000;
        inimigo1.nome = "Goblin";
        mapa.inimigos.add(inimigo1);

        heroi1.nome = "Cavaleiro da esperança";
        heroi1.ataque = 4500;
        heroi1.defesa = 6000;
        heroi1.pontos = 50;
        mapa.herois.add(heroi1);
        heroi1.vida = 10000;

        if (heroi1.pontos>=loja.espada) {
            System.out.println("É possível comprar uma espada");
        } else{
            System.out.println("\nLute com um " + inimigo1.nome + " e ganhe mais pontos!");
            System.out.println("Teletransportado para " + mapa.nome);
            danos = mapa.danosInimigo();
            heroi1.vida = (heroi1.vida-danos);
            System.out.println("\n" + heroi1.nome + " recebeu " + danos + " pontos de danos, sua vida atual = " + heroi1.vida);
            System.out.println("Pontos conquistados pela derrota do inimigo = " + inimigo1.pontos + "\nTotal de pontos "
                                + (heroi1.pontos+inimigo1.pontos));

        }
    }
}
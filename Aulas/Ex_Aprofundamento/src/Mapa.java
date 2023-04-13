import java.util.ArrayList;
public class Mapa {
    String nome;
   // int altura;
   // int largura;
    ArrayList<Inimigo> inimigos = new ArrayList<>(); // Inimigos(classe) lista == nome da lista inimigos []
    ArrayList<Heroi> herois = new ArrayList<>();


    public int danosInimigo(){
        System.out.println("\n" + inimigos.get(0).nome + ": Atacou com um arranhão\n");

        return inimigos.get(0).ataque;
    }
}

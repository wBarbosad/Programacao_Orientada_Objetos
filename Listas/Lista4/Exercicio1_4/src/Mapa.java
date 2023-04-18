import java.util.ArrayList;

public class Mapa {
    private String nome;
    private int altura;
    private int largura;
    private ArrayList<Inimigo> inimigos = new ArrayList<>();
    private ArrayList<Heroi> herois = new ArrayList<>();

    public Mapa(){

    }
    public Mapa(String nome, int altura, int largura){

    }
    public Inimigo getInimigoMaiorAtaque(){
        int maiorAtaque = 0;
        int index = 0;
        for (int i = 0; i < inimigos.size() ; i++) {
            if(inimigos.get(i).ataque > maiorAtaque){
                maiorAtaque = inimigos.get(i).ataque;
                index = i;
            }
        }
        return inimigos.get(index);
    }

}

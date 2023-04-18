import java.util.ArrayList;

public class Mapa {
    private  String nome;
    private int altura;
    private int largura;
    ArrayList<Inimigo> inimigos = new ArrayList<>();
    ArrayList<Heroi> herois = new ArrayList<>();

    public Mapa(String nome, int alturaMapa, int larguraMapa){
        this.nome = nome;
        this.altura = alturaMapa;
        this.largura = larguraMapa;
    }
    public Inimigo getInimigoMaiorAtaque(){
        int maiorAtaque = 0;
        int index = 0;
        for (int i = 0; i < inimigos.size() ; i++) {
            if(inimigos.get(i).getAtaque() > maiorAtaque){
                maiorAtaque = inimigos.get(i).getAtaque();
                index = i;
            }
        }
        return inimigos.get(index);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String name){
        this.nome = name;
    }
}

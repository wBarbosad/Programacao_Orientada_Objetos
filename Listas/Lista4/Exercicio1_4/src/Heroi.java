public class Heroi {
    private int defesa;
    private int ataque;
    private int pontos;

    public Heroi(int defesa, int ataque, int pontos){ //Construtor
        this.defesa = defesa;
        this.ataque = ataque;
        this.pontos = pontos;
    }
    public int getPontos(){
        return pontos;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }

}

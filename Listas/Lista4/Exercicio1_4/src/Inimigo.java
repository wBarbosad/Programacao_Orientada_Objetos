public class Inimigo {
    private int ataque;
    private int defesa;
    private int pontos;

    public Inimigo(){

    }
    public Inimigo(int ataque, int defesa, int pontos){

    }

    public int getAtaque(){
        return this.ataque;
    }
    public int setAtaque(int ataque){
        this.ataque = ataque;
        return this.ataque;
    }
    public int getDefesa(){
        return this.defesa;
    }
    public void setDefesa(int defesa){
        this.defesa = defesa;
    }
    public int getPontos(){
        return this.pontos;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }


}
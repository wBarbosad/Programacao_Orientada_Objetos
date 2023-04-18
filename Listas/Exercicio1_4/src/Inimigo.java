public class Inimigo {
    private int ataque;
    private int pontos;
    private int defesa;
    public String nome;

    public Inimigo(){ //Construtor vazio;

    }
    public Inimigo(int ataque, int pontos, int defesa, String nome){
        this.ataque = ataque;
        this.pontos = pontos;
        this.defesa = defesa;
        this.nome = nome;
    }
    public int getAtaque(){
         return this.ataque;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
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

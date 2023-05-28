public class Heroi {

    private int id;
    private String nome;
    private Arma arma;

    public Heroi() {
    }

    public Heroi(int id, String nome, Arma arma) {
        this.id = id;
        this.nome = nome;
        this.arma = arma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}

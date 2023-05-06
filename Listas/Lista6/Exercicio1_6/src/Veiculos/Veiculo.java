package Veiculos;

public abstract class  Veiculo {
    protected int id;
    protected int velocidadeAtual;
    protected int velocidadeMaxima;
    protected int precisaoEmCurvas;
    protected boolean estaComFarolLigado;

    public Veiculo(){

    }
    public Veiculo(int id, int velocidadeMaxima, int precisaoEmCurvas){
        this.id = id;
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public void acelerar(){

    }
    public void desacelerar(){

    }
    public void ligarFarol(){

    }

    public abstract void utilizarHabilidadesEspeciais();
}

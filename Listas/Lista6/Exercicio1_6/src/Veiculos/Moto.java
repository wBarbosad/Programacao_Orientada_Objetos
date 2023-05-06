package Veiculos;

public class Moto extends Veiculo{
    public Moto(){

    }
    public Moto(int id, int velocidadeMaxima, int precisaoEmCurvas){
        super(id, velocidadeMaxima, precisaoEmCurvas);
    }

    @Override
    public void utilizarHabilidadesEspeciais() {
        System.out.println("Moto ultrapassou o adversário à frente");

    }

}


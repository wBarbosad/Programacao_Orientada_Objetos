import Veiculos.Carro;
import Veiculos.Moto;

public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto(1, 50, 70);
        Carro carro = new Carro(2, 60, 100);
        System.out.println("\n");
        moto.utilizarHabilidadesEspeciais();
        carro.utilizarHabilidadesEspeciais();
    }

}
import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] habitantes = new int[5]; //Declaracao do vetor habitantes
        int controlador = 0, somaSalario = 0, salario, filhos, MaiorSalario = 0, populacao;
        double MediaSalario = 0.0, MediaFilhos = 0.0, somaFilhos = 0;

        System.out.println("Número de participantes da pesquisa: ");
        populacao = scanner.nextInt();

        while(controlador<populacao){
            System.out.println("Informe o seu salário: ");
            salario = scanner.nextInt();
            somaSalario = somaSalario+salario;
            System.out.println("Informe o número de filhos: ");
            filhos = scanner.nextInt();
            somaFilhos = somaFilhos + filhos;

            if (salario>MaiorSalario){
                MaiorSalario = salario;
            }
            controlador+=1;
        }
        MediaSalario = somaSalario/controlador;
        MediaFilhos = somaFilhos/controlador;
        System.out.println("Media salarial = R$ " + MediaSalario);
        System.out.println("Media filhos = " + MediaFilhos);
        System.out.println("Maior salario = R$ " + MaiorSalario);
    }
}
import java.util.Scanner;

public class Main {

    public static String categoria (int idade){
        if (idade>=5 && idade<=7){
            return "Categoria Infantil A";
        }
        if (idade>7 && idade<=10) {
            return "Categoria Infantil B";
        }
        if (idade>10 && idade<=13) {
            return "Categoria Juvenil A";
        }
        if (idade>13 && idade<=17) {
            return "Categoria Juvenil B";
        }
        if (idade>17){
            return "Adulto";
        }
        return "A crinça não pode entrar em nenhuma das categorias até a idade limite de 5 anos!";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();

        String resultado = categoria(idade);
        System.out.println(resultado);

    }
}
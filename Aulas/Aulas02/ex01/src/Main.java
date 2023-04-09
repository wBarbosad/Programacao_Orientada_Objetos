import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();
        int senha = scanner.nextInt();
        //Não usa ==, mas Usuario.equals("<comparar>") quando a variavel é string! (equals)
        if (usuario.equals("admin") && senha==123){
            System.out.println("Realizou o login com sucesso!");
        } else{
            System.out.println("Login ou senha incorreta!");
        }

    }
     /* Modelo:
      Scanner leitor = new Scanner(System.in);
      String nome = leitor.nextLine();
      double peso = leitor.nextDouble();
      boolean estahEmpregado = leitor.nextBoolean();

      System.out.println("Olá!"); //Saida de dados
        if(estahEmpregado){
            System.out.println("Não precisa buscar emprego");
        } else{
            System.out.println("Precisa buscar emprego");
        }
      * */
}
import java.util.Scanner;

public class Main {
    //Sempre que vamos criar uma função vamos usar public static <tipo de retorno da função> <nome da função> { }
    public static int soma(int A, int B){

        return A+B;
    }
    public static double hipotenusa (double catetoAdj, double catetoOp){
        double quadradoCateto1 = Math.pow(catetoAdj, 2); //Math - Biblioteca matemática, Pow = Potencia
        double quadradoCateto2 = Math.pow(catetoOp, 2);
        return Math.sqrt(quadradoCateto1+quadradoCateto2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resultado = soma(2,3);
        System.out.println(resultado);
        double calculoHipotenusa = hipotenusa(3, 4);
        System.out.println(calculoHipotenusa);

    }
     /*int contador = 0;
        int contador1 = 0


        while(contador<10){ //enquanto
            System.out.println(contador);
            contador++;
        }
        for(int i=0; i<10; i++){ //para
            System.out.println("Olá");
        }
        do{ //Faça enquanto
            System.out.println(contador);
            contador1++;
        } while(contador1<10);
        //Vetor em java

        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length ; i++) { // length = tamanho do vetor. numeros. (vetor)
            numeros[i] = i*2;
        }
        for (int i = 0; i < numeros.length ; i++) { //Imprimir os valores do vetor na tela.
            System.out.println(numeros[i]);
        }*/
}
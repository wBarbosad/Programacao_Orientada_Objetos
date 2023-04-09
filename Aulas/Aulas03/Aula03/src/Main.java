public class Main {
    public static void main(String[] args) {
       //Classe é o conceito geral de algo e objeto a concretização da classe, ou seja, as especificações detalhadas
        Caneta canetaVermelha = new Caneta();
        Estudante alunoMatriculado = new Estudante();
        Professor professorDaEscola = new Professor();

        /*
         O arquivo Caneta, antes do Main, é a classe Caneta que permite acessar o que tem dentro, por exemplo, fazendo
         canetaVermelha.<algo dentro da classe Caneta>
         Criou um objeto canetaVermelha do tipo Caneta  = new (Disponibilizar um espaço na JVM atrás do new) Caneta ()

         */
        //canetaVermelha.cor = "Vermelho";
      //  canetaVermelha.porcentagemCarga = 25;
       // canetaVermelha.estaTamapda = false;

        System.out.println(canetaVermelha.cor);

    }
}
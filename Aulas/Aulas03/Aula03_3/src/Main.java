import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lutas luta = new Lutas();
        Lutadores lutadores = new Lutadores(); //new Lutadores() - Criando um espaço de memórida na JVM

        luta.data = "25 de Março de 2024";
        luta.organizador = "UFC";
        luta.premiacoes = "Cinturão peso-pena";
        luta.transmissoes = "Transmissoes ao vivo no canal do UFC e Globo";
        
        luta.lutador1.nome = "Anderson Silva";
        luta.lutador2.nome = "Myke Tyson"
    }
}
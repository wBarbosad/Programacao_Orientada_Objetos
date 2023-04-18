import Jogo.Arma;

import java.util.ArrayList;

public class Heroi {

    int forca;
    int quantidadeHabilidades;
    //ArrayList<Arma> armas = new ArrayList<>(); //Lista do tipo <arma> nome da lista
    int pontosDeVida;
    String categoria;

    // Declaramos um construtor parecido com uma função, mas ele retorna um objeto dessa classe neste casso Heroi.
    // enquanto uma função pede retorno, p. exemplo, public int heroi1 (){<comandos>}
    public Heroi(String categoria, int pontosDeVida, int forca, int quantidadeHabilidades) { //O construtor tem o nome da classe
        this.categoria = categoria; //Quando o nome do atributo tem o mesmo nome do parâmetro "classe", usamos o this
        //classe = classe. O primeiro classe é o atributo e classe é o que ele recebeu de parâmetro
        this.forca = forca; //this estamos nos referindo ao atributo na classe heroi
        this.pontosDeVida = pontosDeVida;
        this.quantidadeHabilidades = quantidadeHabilidades;
        // uma lista como parâmetros = ArrayList<tipo(no caso o nome da classe)> <nome da lista>
    }

}
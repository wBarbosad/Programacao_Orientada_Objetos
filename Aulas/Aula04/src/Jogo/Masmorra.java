package Jogo;

public class Masmorra {

    public void abrirPorta (){
        Monstro monstro = sortearMonstro();
        if (monstro == null){
            System.out.println("Não havia monstros na sala");
        } else {
            System.out.println();
        }
    }
}


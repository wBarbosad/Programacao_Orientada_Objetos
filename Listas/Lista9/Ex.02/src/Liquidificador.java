public class Liquidificador <T extends Alimentos>{ //Liquidificador é uma classe genérica do elemento do tipo T;

    private T elementos;

    public void bater(){
        System.out.println("\nVRUWDWJNDAJJDWDAWWDA, WDUAWDAWUD, ZIMMMMMM\n\nO alimento foi batido");

    }
    public void setElementos(T elemento){
        this.elementos = elemento;
    }
    public T getElementos(){
        return this.elementos;
    }

}

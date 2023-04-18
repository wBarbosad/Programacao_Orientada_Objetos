public class Main {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Ladino", 10, 7, 5); //Enviando como parâmetro os dados digitados;
        System.out.println("Categoria: " + heroi1.categoria);

        //Pacotes organizam as classes; [Deve ter apenas classes dentro de pacotes]
        // Colocou os atributos visiveis, aqueles em que for usado no main, quando coloco as classes dentro de pacotes
        // específicos.
        //get = pegar informações == faço uma função na classe.
        //set uso para definir valores aos atributos não acessíveis faço uma função na classe
    }
}
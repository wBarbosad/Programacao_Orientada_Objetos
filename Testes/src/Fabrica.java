import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private List<Operario> trabalhadores;

    public Fabrica(){
        this.trabalhadores = new ArrayList<>();
    }
    public void iniciarExpediente(){
        for(Operario trabalhadores : this.trabalhadores){
            trabalhadores.trabalhar();
        }
    }

    public void adicionarOperarios(Operario trabalhadores) {
        this.trabalhadores.add(trabalhadores);
    }
}

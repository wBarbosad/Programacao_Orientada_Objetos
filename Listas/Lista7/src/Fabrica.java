import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private List<Operario> operarios;

    public Fabrica(){
        this.operarios = new ArrayList<>();
    }
    public void adicionarOperario (Operario operarios){
        this.operarios.add(operarios);
    }

    public void iniciarExpediente(){
        for(Operario operarios : this.operarios){
            operarios.trabalhar();
        }
    }
}

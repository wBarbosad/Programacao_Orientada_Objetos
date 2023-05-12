import java.util.ArrayList;
import java.util.List;

public class Banda {
    private List<Musico> musicos;

    public Banda(){
        this.musicos = new ArrayList<>();
}
    public void realizarSolos(){
        for(Musico musico : this.musicos){
            musico.tocar();
        }
    }
    public void adicionarMusicos (Musico musico){
        this.musicos.add(musico);
    }


}




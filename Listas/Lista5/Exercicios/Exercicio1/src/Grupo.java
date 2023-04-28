import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro;
    public Grupo(){
        this.herois = new ArrayList<>();
    }

    public void adicionarHeroi(Heroi heroi){
        for (int i = 0; i < herois.size(); i++) {
            if(getHerois().get(i).getId()==heroi.getId()){
                System.out.println("O heroi de Id = " + herois.get(i).getId() + " já está incluso no grupo!");
                return;
            }
        }
        this.herois.add(heroi);
        System.out.println("O heroi " + heroi.getNome() + " foi adicionado ao grupo;");

        int somaMoedas = 0;
        for (int i = 0; i < herois.size(); i++) { //Fazer isso com as moedas.
            somaMoedas=somaMoedas+herois.get(i).getQuantidadeDeMoedasDeOuro();
            setTotalMoedasDeOuro(somaMoedas);
        }
    }
    public void removerHeroi(int idHeroi){
       int subtrairMoedas = getTotalMoedasDeOuro();
        for (int i = 0; i < herois.size(); i++) {
            if (herois.get(i)==herois.get(idHeroi)) {
                System.out.println("\nO heroi " + herois.get(i).getNome()+ " foi removido do grupo");
                subtrairMoedas = subtrairMoedas-herois.get(i).getQuantidadeDeMoedasDeOuro();
                this.herois.remove(idHeroi);
            }
        }
        setTotalMoedasDeOuro(subtrairMoedas);
    }

    public int getTotalMoedasDeOuro() {
        return totalMoedasDeOuro;
    }

    public void setTotalMoedasDeOuro(int totalMoedasDeOuro) {
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }
}

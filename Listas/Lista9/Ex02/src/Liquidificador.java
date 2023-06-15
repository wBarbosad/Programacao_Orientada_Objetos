public class Liquidificador<T extends Alimento>{

    private T alimento;

    public T getAlimento() {
        return alimento;
    }

    public void setAlimento(T alimento) {
        this.alimento = alimento;
    }
    public void bater(){
        System.out.println("O alimento foi batido");
    }
}

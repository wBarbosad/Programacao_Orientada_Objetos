public class Pokemon {
    private String codigoIdentificador;
    private String nome;
    private String tipo;

    public Pokemon(){

    }
    public Pokemon(String codigoIdentificador, String nome, String tipo){
        this.codigoIdentificador = codigoIdentificador;
        this.nome = nome;
        this.tipo = tipo;
    }

   public String getNome(){
        return this.nome;
    }
   public String getCodigoIdentificador(){
        return this.codigoIdentificador;
   }
   public String getTipo(){
        return this.tipo;
   }

   public void setCodigoIdentificador(String codigoIdentificador){
        this.codigoIdentificador = codigoIdentificador;
   }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}

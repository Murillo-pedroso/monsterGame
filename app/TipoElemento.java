public class TipoElemento {
  
    private int valor;
    private String tipo;

    public TipoElemento(int valor,String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public int compareTo(String string) {
        return 0;
    }
    public String getTipo(){
        return this.tipo;
    }


}

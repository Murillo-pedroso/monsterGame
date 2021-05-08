public enum TipoElemento {
    AGUA(1,"AGUA"),
    FOGO(2,"FOGO"),
    TERRA(3,"TERRA"),
    LUTADOR(4,"LUTADOR"),
    SOMBRIO(5,"SOMBRIO"),
    FANTASMA(6,"FANTASMA"),
    DRAGAO(7,"DRAGAO"),
    FADA(8,"FADA"),
    PLANTA(9,"PLANTA"),
    PSIQUICO(10,"PSIQUICO"),
    NORMAL(11,"NORMAL"),
    PEDRA(12,"PEDRA"),
    NULO(13,"");

    public int valor;
    public String tipo;

    private TipoElemento(int valor,String tipo) {
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

public enum TipoElemento {
    AGUA(1,"Agua"),
    FOGO(2,"Fogo"),
    TERRA(3,"Terra"),
    LUTADOR(4,"Lutador"),
    ELETRICO(5,"Eletrico"),
    GELO(6,"Gelo");

    public int valor;
    public String descricao;

private TipoElemento(int valor,String descricao) {
    this.valor = valor;
    this.descricao = descricao;
}

public int compareTo(String string) {
    return 0;
}


}

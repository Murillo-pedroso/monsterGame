public class MonstroNew {
    private int id;
    private String nome;
    private TipoElemento tipo;
    private TipoElemento tipoSecundario;
    private double vida;
    private double forca;
    private double defesa;
    private double velocidade;
    private Ataque ataques1;
    private Ataque ataques2;
    private Ataque ataques3;
    private AtaqueCarregado ataqueCarregado;
    private double vidaMax;

    public MonstroNew(int id, String nome, TipoElemento tipo, TipoElemento tipoSecundario, double vida, double forca,
            double defesa, double velocidade, Ataque ataques1, Ataque ataques2, Ataque ataques3,
            AtaqueCarregado ataqueCarregado) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.tipoSecundario = tipoSecundario;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.ataques1 = ataques1;
        this.ataques2 = ataques2;
        this.ataques3 = ataques3;
        this.ataqueCarregado = ataqueCarregado;
        this.vidaMax = vida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoElemento getTipo() {
        return tipo;
    }

    public void setTipo(TipoElemento tipo) {
        this.tipo = tipo;
    }

    public TipoElemento getTipoSecundario() {
        return tipoSecundario;
    }

    public void setTipoSecundario(TipoElemento tipoSecundario) {
        this.tipoSecundario = tipoSecundario;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public double getDefesa() {
        return defesa;
    }

    public void setDefesa(double defesa) {
        this.defesa = defesa;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Ataque getAtaques1() {
        return ataques1;
    }

    public void setAtaques1(Ataque ataques1) {
        this.ataques1 = ataques1;
    }

    public Ataque getAtaques2() {
        return ataques2;
    }

    public void setAtaques2(Ataque ataques2) {
        this.ataques2 = ataques2;
    }

    public Ataque getAtaques3() {
        return ataques3;
    }

    public void setAtaques3(Ataque ataques3) {
        this.ataques3 = ataques3;
    }

    public AtaqueCarregado getAtaqueCarregado() {
        return ataqueCarregado;
    }

    public void setAtaqueCarregado(AtaqueCarregado ataqueCarregado) {
        this.ataqueCarregado = ataqueCarregado;
    }

    public double getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(double vidaMax) {
        this.vidaMax = vidaMax;
    }

    public void imprimeAtaques(int i) {
        System.out.println("1 - " + this.ataques1.getNome() + "\t2 - " + this.ataques2.getNome() + "3 - "
                + this.ataques3.getNome() + "\t4 - " + this.ataqueCarregado.getNome());

    }

    public void imprime() {
        System.out.println(String.format("%3s  %1s  %21s %1s %10s %1s %10s", this.id, "|", this.nome,"|",this.tipo.getTipo(),"|",this.tipoSecundario.getTipo()));
    }
}
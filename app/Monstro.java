public class Monstro{
    private int id;
    private String nome;
    private TipoElemento tipo;
    private TipoElemento tipoSecundario;
    private int vida;
    private int forca;
    private int defesa;
    private int velocidade;
    private Ataque[] ataques;
    private AtaqueCarregado ataqueCarregado;
    private int vidaMax;
    

    public Monstro(int id, String nome, TipoElemento tipo,TipoElemento tipoSecundario, int vida, int forca,int defesa, int velocidade, Ataque[] listaAtaques,AtaqueCarregado ataqueCarregado){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.tipoSecundario = tipoSecundario;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.ataques = listaAtaques;
        this.vidaMax = vida;
        this.ataqueCarregado = ataqueCarregado;
      
    }
    public Monstro(int i, String string, TipoElemento fogo, TipoElemento nulo, int j, int k, int l, int m, Ataque fireBlast, Ataque overheat, Ataque mordida, AtaqueCarregado erupcaoDeFogo) {
    }
    public int getId() {
        return id;
    }
    public String getNome(){
		return nome;
	}
	public TipoElemento getTipo(){
		return tipo;
	}
    public int getForca() {
        return forca;
    }
    public int getDefesa() {
        return defesa;
    }
    public int getVelocidade() {
        return velocidade;
    }

    //Métodos relacionados ao estado do pokémon
	public int getVida() {
		return vida;
	}
	public int getVidaMax() {
		return vidaMax;
	}
	public void diminuiVida(double dano){
		int intDano = (int) dano;
		if (this.estaVivo()) {
			vida -= intDano;
		}
	}
	public void aumentaVida(int ganho){
		int auxVida = vida + ganho;
		if (auxVida <= vidaMax)
            vida = auxVida;
		else
            vida = vidaMax;
	} 
	public boolean estaVivo() {
		if (vida > 0)
			return true;
		return false;
	}

    //Métodos relacionados aos ataques do pokémon
	public String getAtaque(int num){
		return ataques[num].getNome();
	}
	public Ataque[] getListaAtk() {
		return ataques;
	}
	public int getDanoAtual(int num) {
		return ataques[num].getDano();
	}
	public void imprimeAtaques() {
		System.out.println("1 - " + this.ataques[1].getNome() +  "		 2 - " + this.ataques[2].getNome() );

    }
    public int associaTipo(TipoElemento tipo2){
		if(tipo2.compareTo("Agua") == 0) return 0;
		else if(tipo2.compareTo("Fogo") == 0) return 1;
		else if(tipo2.compareTo("Terra") == 0) return 2;
		else if(tipo2.compareTo("Lutador") == 0) return 3;
		else if(tipo2.compareTo("Eletrico") == 0) return 4;
		else if(tipo2.compareTo("Gelo") == 0) return 5;
        else return -1;
    }
    
    public void Imprime() {
    }
                            


//    public void Imprime(){
//       System.out.println("ID: " + this.ID +
//                            "\nNome: " + this.nome +
//                            "\nTipo: " + this.tipo.descricao +
//                            "\nVida: " + this.vida +
//                            "\nForça: " + this.forca +
//                            "\nDefesa: " + this.defesa +
//                            "\nVelocidade: " + this.velocidade + 
//                            "\nAtaque Principal: " + this.ataquePrincipal.getNome() +
//                            "\nAtaque Secundario: " + this.ataqueSecundario.getNome() +"\n");
//
//
//    }

}
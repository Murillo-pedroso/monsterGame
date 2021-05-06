public class Monstro{
    private int[] id;
    private String[] nome;
    private TipoElemento[] tipo;
    private TipoElemento[] tipoSecundario;
    private double[] vida;
    private double[] forca;
    private double[] defesa;
    private double[] velocidade;
    private Ataque[][] ataques;
    private AtaqueCarregado[] ataqueCarregado;
    private double[] vidaMax;
    private int pos = 0 ;
    private int limiteMonstro = 18;
    

    public Monstro(){
        this.id = new int[this.limiteMonstro];
        this.nome = new String[this.limiteMonstro];
        this.tipo = new TipoElemento[this.limiteMonstro];
        this.tipoSecundario = new TipoElemento[this.limiteMonstro];
        this.vida = new double[this.limiteMonstro];
        this.forca = new double[this.limiteMonstro];
        this.defesa = new double[this.limiteMonstro];
        this.velocidade = new double[this.limiteMonstro];
        this.ataques= new Ataque[this.limiteMonstro][];
        this.vidaMax = new double[this.limiteMonstro];
        this.ataqueCarregado = new AtaqueCarregado[this.limiteMonstro];
      
    }
    public void add(int id, String nome, TipoElemento tipo,TipoElemento tipoSecundario, double vida, double forca,double defesa, double velocidade, Ataque ataqueZero,Ataque ataqueUm,Ataque ataqueDois,AtaqueCarregado ataqueCarregado){
        this.id[this.pos] = id;
        this.nome[this.pos] = nome;
        this.tipo[this.pos] = tipo;
        this.tipoSecundario[this.pos] = tipoSecundario;
        this.vida[this.pos] = vida;
        this.forca[this.pos] = forca;
        this.defesa[this.pos] = defesa;
        this.velocidade[this.pos] = velocidade;
        this.ataques[this.pos][0] = ataqueZero;
        this.ataques[this.pos][1] = ataqueUm;
        this.ataques[this.pos][2] = ataqueDois;
        this.vidaMax[this.pos] = vida;
        this.ataqueCarregado[this.pos] = ataqueCarregado;
        this.pos++;
    } 
    public int getId(int i) {
        return id[i];
    }
    public String getNome(int i){
		return nome[i];
	}
	public TipoElemento getTipo(int i){
		return tipo[i];
	}
    public double getForca(int i) {
        return forca[i];
    }
    public double getDefesa(int i) {
        return defesa[i];
    }
    public double getVelocidade(int i) {
        return velocidade[i];
    }

    //Métodos relacionados ao estado do pokémon
	public double getVida(int i) {
		return vida[i];
	}
	public double getVidaMax(int i) {
		return vidaMax[i];
	}
    /* esses metodos devem ser feitos no treinador eu acho
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
*/
    //Métodos relacionados aos ataques do pokémon
	public String getAtaque(int i,int num){
		return ataques[i][num].getNome();
	}
	public Ataque[] getListaAtk(int i) {
		return ataques[i];
	}
	public double getDanoAtual(int i,int num) {
		return ataques[i][num].getDano();
	}
	public void imprimeAtaques(int i) {
		System.out.println("1 - " + this.ataques[i][0].getNome() +  "\t2 - " + this.ataques[i][1].getNome()+"3 - " + this.ataques[i][2].getNome() +  "\t4 - " + this.ataqueCarregado[i].getNome());

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
    
    public void imprime() {
        for (int i = 0; i < this.pos; i++) {
            System.out.println(String.format("%3s , %1s , %12s", this.id[i],"|",this.nome[i]));
        }
       
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
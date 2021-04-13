public class Ataque {
    private String nome;
    private TipoElemento tipo;
	private int forca;
    private int energia;
	
	public Ataque(String nome,TipoElemento tipo, int dano, int energia){
		this.nome = nome;
        this.tipo = tipo;
		this.forca = dano;
	}
	public String getNome(){
		return nome;
    }
    public TipoElemento getTipo(){
        return tipo;
    }
    public int getDano(){
        return forca;
    }
    public int getEnergia(){
        return energia;
    }
  
}

public class Treinador {
    private String nome;
	private Monstro[] monstro = new Monstro[6];
	private Monstro mostroAtual;
	private boolean correu;
	private boolean derrotado;

	public Treinador (String nome, Monstro[] listaDeMonstros){
		this.nome = nome;
		monstro = listaDeMonstros;
		mostroAtual = monstro[0];
		correu = false;
		derrotado = false;
	}
	public String getNome(){
		return nome;
	}

	
}

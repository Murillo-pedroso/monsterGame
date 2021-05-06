public class Treinador {
	private String nome;
	private Monstro[] monstro = new Monstro[3];
	private Monstro monstroAtual;
	private boolean correu;
	private boolean derrotado;

	public Treinador() {

		this.correu = false;
		this.derrotado = false;
	}

	public Treinador(String nome, Monstro[] listaDeMonstros) {
		this.nome = nome;
		this.monstro = listaDeMonstros;
		this.monstroAtual = monstro[0];
		this.correu = false;
		this.derrotado = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Métodos relacionados aos monstros do treinador
	public Monstro getMonstro(int i) {
		return monstro[i];
	}

	public void setMonstro(int i, Monstro monstro) {
		this.monstro[i] = monstro;
		this.monstroAtual = this.monstro[0];
	}

	public Monstro getMonstroAtual() {
		return monstroAtual;
	}

	public String getAtaqueAtual(int num) {
		return monstroAtual.getAtaque(num);
	}

	public int getDanoAtual(int num) {
		return monstroAtual.getDanoAtual(num);
	}

	public void recebeAtaque(int dano) {
		monstroAtual.diminuiVida(dano);
	}

	public void cura() {
		if (monstroAtual.estaVivo()) {
			monstroAtual.aumentaVida(100);
		}
	}

	public int quantosMonstros() {
		return monstro.length;
	}

	public void mudaMonstroAtual(int i) {
		if (monstro[i].estaVivo()) {
			monstroAtual = monstro[i];
		}
	}

	public boolean temMonstroVivo() {
		boolean tem = false;
		int size = monstro.length;
		for (int i = 0; i < size; i++)
			if (monstro[i].estaVivo())
				tem = true;
		return tem;
	}

	public void imprimeMonstro() {
		int aux = monstro.length;
		for (int i = 0; i < aux; i++) {
			if (monstro[i].estaVivo())
				System.out.println(i + " - " + monstro[i].getNome());
		}
	}

	public void adicionaMonstro(Monstro novo) {
		int qtd = monstro.length;

		boolean trocou = false;

		// verifica se tem algum espaço vazio
		for (int i = 0; i < qtd; i++) {
			if (!monstro[i].estaVivo()) {
				monstro[i] = novo;
				trocou = true;
			}
		}
		if (!trocou && qtd < 3) {
			// cria uma lista auxiliar
			Monstro[] novaLista = new Monstro[qtd + 1];
			for (int i = 0; i < qtd; i++)
				novaLista[i] = monstro[i];
			novaLista[qtd] = novo;
			monstro = novaLista;
			System.out.println("Monstro " + novo.getNome() + "foi adicionado à sua lista!");
		} else
			System.out.println("Sua lista de monstros está cheia!");
	}

	// Métodos relacionados a fuga ou derrota do treinador
	public boolean perdeu() {
		return derrotado;
	}

	public void foiDerrotado() {
		derrotado = true;
	}

	public void corre() {
		correu = true;
	}

	public boolean fugiu() {
		return correu;
	}

	public void voltaCorreu() {
		correu = false;
	}

}

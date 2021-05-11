import java.util.Scanner;

public class Treinador {
	private String nome;
	private Monstro monstro;
	// private MonstroNew m1;
	// private MonstroNew m2;
	// private MonstroNew m3;
	private int monstroAtualId; //indice da lista de monstros do treinador
	private boolean correu;
	private boolean derrotado;

	public Treinador() {

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
	public Monstro getMonstro() {
		return monstro;
	}

	public void setMonstro(Monstro monstro) {
		this.monstro = monstro;
		this.monstroAtualId = 0;
	}

	public int getMonstroAtualId() {
		return monstroAtualId;
	}

	// public String getAtaqueAtual(int num) {
	// 	return monstroAtual.getAtaque(num);
	// }

	// public int getDanoAtual(int num) {
	// 	return monstroAtual.getDanoAtual(num);
	// }

	// public void recebeAtaque(int dano) {
	// 	monstroAtual.diminuiVida(dano);
	// }

	// public void cura() {
	// 	if (monstroAtual.estaVivo()) {
	// 		monstroAtual.aumentaVida(100);
	// 	}
	// }

	// public int quantosMonstros() {
	// 	return monstro.length;
	// }

	public void mudaMonstroAtual() {
		if(!imprimeMonstro())
			return;

		System.out.println("Escolhe monstro da lista");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if(i >= 3 || i < 0){
			System.out.println("Escolha invalida");
			return;
		}
		if (monstro.getVida(i) <= 0) {
			System.out.println("Monstro Derrotado [" + monstro.getNome(i)+"]");
			return;
		}

		System.out.println("Monstro escolhido :" + monstro.getNome(i));
		this.monstroAtualId = i;
	}

	public boolean temMonstroVivo() {
		boolean tem = false;
		for (int i = 0; i < 3; i++){
			if (monstro.getVida(i) > 0)
				tem = true;
		}
		return tem;
	}

	public boolean imprimeMonstro() {
		if(!temMonstroVivo())
			return false;

		for (int i = 0; i < 3; i++) {
			if (this.monstroAtualId == i)
				continue;
			
			this.monstro.imprimeByIndice(i);
		}

		return true;
	}

	// public void adicionaMonstro(Monstro novo) {
	// 	int qtd = monstro.length;

	// 	boolean trocou = false;

	// 	// verifica se tem algum espaço vazio
	// 	for (int i = 0; i < qtd; i++) {
	// 		if (!monstro[i].estaVivo()) {
	// 			monstro[i] = novo;
	// 			trocou = true;
	// 		}
	// 	}
	// 	if (!trocou && qtd < 3) {
	// 		// cria uma lista auxiliar
	// 		Monstro[] novaLista = new Monstro[qtd + 1];
	// 		for (int i = 0; i < qtd; i++)
	// 			novaLista[i] = monstro[i];
	// 		novaLista[qtd] = novo;
	// 		monstro = novaLista;
	// 		System.out.println("Monstro " + novo.getNome() + "foi adicionado à sua lista!");
	// 	} else
	// 		System.out.println("Sua lista de monstros está cheia!");
	// }

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

	public boolean ativo() {
		return !correu && !derrotado ? true:false ;
	}
	public void ataques(){
		
		System.out.println("\n");

		System.out.println("|------------------------------------------------------------------------------------------------------------|");
		System.out.printf(String.format("%5s %-22s %-7s %-9s %5s %4s %-22s %-7s %-9s %11s", "|1 - ",this.getMonstro().getAtaque(this.getMonstroAtualId(), 0).getNome()
		," Tipo: ",this.getMonstro().getAtaque(this.getMonstroAtualId(), 0).getTipo().getTipo(),"  |  "
		,"2 - ",this.getMonstro().getAtaque(this.getMonstroAtualId(), 1).getNome()	
		," Tipo: ",this.getMonstro().getAtaque(this.getMonstroAtualId(), 1).getTipo().getTipo(),"|"));
		System.out.printf("\n");
		System.out.printf(String.format("%5s %-22s %-7s %-9s %5s %4s %-22s %-7s %-9s %6s %2d %1s","|3 - ",this.getMonstro().getAtaque(this.getMonstroAtualId(), 2).getNome()
		," Tipo: ",this.getMonstro().getAtaque(this.getMonstroAtualId(), 2).getTipo().getTipo(),"  |  "
		,"4 - ",this.getMonstro().getAtaqueCarregado(this.getMonstroAtualId()).getNome()
		," Tipo: ",this.getMonstro().getAtaqueCarregado(this.getMonstroAtualId()).getTipo().getTipo()
		," PP: ",this.getMonstro().getAtaqueCarregado(this.getMonstroAtualId()).getEnergia(),"|"));
		System.out.println("\n|------------------------------------------------------------------------------------------------------------|");
				
		
	}
}

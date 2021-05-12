import java.util.Scanner;

public class Treinador {
	private String nome;
	private Monstro monstro;
	private int monstroAtualId; // indice da lista de monstros do treinador
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
		return this.monstro;
	}

	public void setMonstro(Monstro monstro) {
		this.monstro = monstro;
		this.monstroAtualId = 0;
	}

	public int getMonstroAtualId() {
		return this.monstroAtualId;
	}
	public boolean getCorreu(){
		return this.correu;
	}
	public boolean getDerrotado(){
		return this.derrotado;
	}

	public void mudaMonstroAtual() {
		if (!imprimeMonstro())
			return;
		int erro = 0;
		int i = 0;
		if(temMonstroVivo()){
		do {
			erro = 0;
			System.out.println("Escolhe monstro da lista");
			Scanner sc = new Scanner(System.in);
			 i = sc.nextInt();

			if (i >= 3 || i < 0) {
				System.out.println("Escolha invalida");
				erro = 1;
			}
			if (monstro.getVida(i) <= 0) {
				System.out.println("Monstro Derrotado [" + this.monstro.getNome(i) + "]");
				erro = 1;
			}
		} while (erro != 0);
		System.out.println("Monstro escolhido :" + this.monstro.getNome(i));
		this.monstroAtualId = i;
	}
	}

	public boolean temMonstroVivo() {
		boolean tem = false;
		for (int i = 0; i < 3; i++) {
			if (this.getMonstro().getVida(i) > 0)
				tem = true;
		}
		if(tem==false)this.derrotado=true;

		return tem;
	}

	public boolean imprimeMonstro() {
		if (!temMonstroVivo())
			return false;

		for (int i = 0; i < 3; i++) {
			if (this.monstroAtualId == i)
				continue;

			this.monstro.imprimeByIndice(i);
		}

		return true;
	}
	public void diminuiEnergia(){
		
		
		this.getMonstro().setAtaqueCarregadoEnergia(this.getMonstroAtualId(), this.getMonstro().getAtaqueCarregadoEnergia(this.getMonstroAtualId())-1);
	}
	public boolean diminuiVida(double dano) throws InterruptedException {
		boolean morreu = false;
		this.getMonstro().setVida(this.getMonstroAtualId(), this.getMonstro().getVida(this.getMonstroAtualId()) - dano);
		System.out.println("Dano causado: "+Math.round(dano));
		Thread.sleep(1000);
		if (this.getMonstro().getVida(this.getMonstroAtualId()) <= 0) {
			System.out.println(this.getMonstro().getNome(this.getMonstroAtualId())+ " foi desmaiado.Escolha outro para substitui-lo:");
			mudaMonstroAtual();
			morreu = true;
		}
		return morreu;
	}

	// Métodos relacionados a fuga ou derrota do treinador

	public void corre() {

		this.correu = true;
	}

	public boolean ativo() {
		return !this.correu && !this.derrotado ? true : false;
	}

	public void ataques() {

		System.out.println("\n");

		System.out.println(
				"|------------------------------------------------------------------------------------------------------------|");
		System.out.printf(String.format("%5s %-22s %-7s %-9s %5s %4s %-22s %-7s %-9s %11s", "|1 - ",
				this.getMonstro().getAtaque(this.getMonstroAtualId(), 0).getNome(), " Tipo: ",
				this.getMonstro().getAtaque(this.getMonstroAtualId(), 0).getTipo().getTipo(), "  |  ", "2 - ",
				this.getMonstro().getAtaque(this.getMonstroAtualId(), 1).getNome(), " Tipo: ",
				this.getMonstro().getAtaque(this.getMonstroAtualId(), 1).getTipo().getTipo(), "|"));
		System.out.printf("\n");
		System.out.printf(String.format("%5s %-22s %-7s %-9s %5s %4s %-22s %-7s %-9s %6s %2d %1s", "|3 - ",
				this.getMonstro().getAtaque(this.getMonstroAtualId(), 2).getNome(), " Tipo: ",
				this.getMonstro().getAtaque(this.getMonstroAtualId(), 2).getTipo().getTipo(), "  |  ", "4 - ",
				this.getMonstro().getAtaqueCarregado(this.getMonstroAtualId()).getNome(), " Tipo: ",
				this.getMonstro().getAtaqueCarregado(this.getMonstroAtualId()).getTipo().getTipo(), " PP: ",
				this.getMonstro().getAtaqueCarregadoEnergia(this.getMonstroAtualId()), "|"));
		System.out.println(
				"\n|------------------------------------------------------------------------------------------------------------|");

	}
}

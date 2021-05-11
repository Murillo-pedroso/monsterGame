
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws InterruptedException, IOException {
		int escolhaAtaque;
		int turno = 1;
		int escolha = 0;
		double modificadorDano;
		boolean vezTreinadorUm = true;
		double danoTreinadorUm = 0;
		double danoTreinadorDois = 0;
		int navegacaoMenu;

		Scanner leitura = new Scanner(System.in);
		Treinador treinadorUm = new Treinador();
		Treinador treinadorDois = new Treinador();
		Monstro listaMonstro = new Monstro();

		Menu menuInteracao = new Menu();
		Combate combate = new Combate();

		TipoElemento agua = new TipoElemento(1, "AGUA");
		TipoElemento fogo = new TipoElemento(2, "FOGO");
		TipoElemento terra = new TipoElemento(3, "TERRA");
		TipoElemento lutador = new TipoElemento(4, "LUTADOR");
		TipoElemento sombrio = new TipoElemento(5, "SOMBRIO");
		TipoElemento fantasma = new TipoElemento(6, "FANTASMA");
		TipoElemento dragao = new TipoElemento(7, "DRAGAO");
		TipoElemento fada = new TipoElemento(8, "FADA");
		TipoElemento planta = new TipoElemento(9, "PLANTA");
		TipoElemento psiquico = new TipoElemento(10, "PSIQUICO");
		TipoElemento normal = new TipoElemento(11, "NORMAL");
		TipoElemento pedra = new TipoElemento(12, "PEDRA");
		TipoElemento nulo = new TipoElemento(13, "");

		Ataque rajadaDeFogo = new Ataque("Rajada de Fogo", fogo, 5);
		Ataque esguichoDeAgua = new Ataque("Esguicho de Agua", agua, 4);
		Ataque tiroVenenoso = new Ataque("Tiro Venenoso", planta, 4);
		Ataque asasCortantes = new Ataque("Asas Cortantes", dragao, 5);
		Ataque raioPsiquico = new Ataque("Raio Psiquico", psiquico, 6);
		Ataque cantoMagico = new Ataque("Canto Magico", fada, 2);
		Ataque rosnado = new Ataque("Rosnado", sombrio, 6);
		Ataque garraFantasmagorica = new Ataque("Garra Fantasmagorica", fantasma, 4);
		Ataque voadora = new Ataque("Voadora", lutador, 7);
		Ataque arremecoDePedra = new Ataque("Arremaço de Pedra", pedra, 4);
		Ataque tapaDeLama = new Ataque("Tapa de Lama", terra, 6);
		Ataque ataqueMalandro = new Ataque("Ataque Malandro", normal, 4);
		Ataque mordida = new Ataque("Mordida", normal, 6);

		AtaqueCarregado erupcaoDeFogo = new AtaqueCarregado("Erupção de Fogo", fogo, 12, 3, Efeito.INCENDIADO);
		AtaqueCarregado alagamento = new AtaqueCarregado("Alagamento", agua, 9, 5, Efeito.NULO);
		AtaqueCarregado sementesVenenosas = new AtaqueCarregado("Sementes Venenosas", planta, 10, 4, Efeito.ENVENENADO);
		AtaqueCarregado pulsoDoDragao = new AtaqueCarregado("Pulso do Dragao", dragao, 12, 4, Efeito.NULO);
		AtaqueCarregado confusaoMental = new AtaqueCarregado("Confusao Mental", psiquico, 5, 4, Efeito.ATORDOADO);
		AtaqueCarregado bonsSonhos = new AtaqueCarregado("Bons Sonhos", fada, 0, 5, Efeito.DORMINDO);
		AtaqueCarregado escuridao = new AtaqueCarregado("Escuridao", sombrio, 8, 5, Efeito.NULO);
		AtaqueCarregado bolaSombria = new AtaqueCarregado("Bola Sombria", fantasma, 15, 2, Efeito.NULO);
		AtaqueCarregado antonioNunes = new AtaqueCarregado("Antonio Nunes", lutador, 12, 2, Efeito.NULO);
		AtaqueCarregado desmoronamento = new AtaqueCarregado("Desmoronamento", pedra, 8, 7, Efeito.NULO);
		AtaqueCarregado terremoto = new AtaqueCarregado("Terremoto", terra, 10, 4, Efeito.NULO);
		AtaqueCarregado barrigada = new AtaqueCarregado("Barrigada", normal, 12, 3, Efeito.ATORDOADO);
		AtaqueCarregado hiperFeixe = new AtaqueCarregado("Hiper Feixe", normal, 17, 1, Efeito.NULO);

		/*
		 * listaMonstrosNew.add(new MonstroNew(0, "Boitata", fogo, nulo, 50,30, 10, 10,
		 * rajadaDeFogo, rosnado, mordida, erupcaoDeFogo)); listaMonstrosNew.add(new
		 * MonstroNew(1, "Cuca", dragao, psiquico, 1, 1, 1, 1, asasCortantes,
		 * raioPsiquico, tapaDeLama, pulsoDoDragao));
		 * 
		 * for(MonstroNew m : listaMonstrosNew){ m.imprime(); }
		 * listaMonstrosNew.get(0).imprime();
		 */

		listaMonstro.add(0, "Boitata", fogo, nulo, 30, 35, 15, 20, rajadaDeFogo, rosnado, mordida, erupcaoDeFogo);
		listaMonstro.add(1, "Cuca", dragao, psiquico, 20, 20, 35, 25, asasCortantes, raioPsiquico, tapaDeLama,
				pulsoDoDragao);
		listaMonstro.add(2, "Boto", agua, fada, 20, 30, 30, 20, esguichoDeAgua, mordida, cantoMagico, bonsSonhos);
		listaMonstro.add(3, "Cabra Cabriola", sombrio, nulo, 30, 40, 10, 20, mordida, ataqueMalandro, rosnado,
				escuridao);
		listaMonstro.add(4, "Chibamba", planta, nulo, 20, 30, 15, 35, voadora, ataqueMalandro, tiroVenenoso,
				sementesVenenosas);
		listaMonstro.add(5, "Corpo Seco", fantasma, nulo, 35, 15, 15, 35, garraFantasmagorica, mordida, rosnado,
				bolaSombria);
		listaMonstro.add(6, "Curupira", lutador, nulo, 40, 25, 20, 15, rajadaDeFogo, voadora, ataqueMalandro,
				antonioNunes);
		listaMonstro.add(7, "Encantados", planta, fada, 25, 15, 35, 25, tiroVenenoso, cantoMagico, raioPsiquico,
				hiperFeixe);
		listaMonstro.add(8, "Gorjala", pedra, nulo, 45, 45, 9, 1, arremecoDePedra, rosnado, ataqueMalandro,
				desmoronamento);
		listaMonstro.add(9, "Homem do Saco", normal, nulo, 25, 25, 10, 40, ataqueMalandro, mordida, voadora, barrigada);
		listaMonstro.add(10, "Iara", agua, fada, 35, 15, 20, 30, esguichoDeAgua, cantoMagico, mordida, alagamento);
		listaMonstro.add(11, "Labatut", terra, nulo, 35, 10, 40, 15, tapaDeLama, arremecoDePedra, ataqueMalandro,
				terremoto);
		listaMonstro.add(12, "Lobisomem", sombrio, nulo, 25, 35, 5, 35, rosnado, mordida, garraFantasmagorica,
				escuridao);
		listaMonstro.add(13, "Loura do Banheiro", fantasma, nulo, 25, 25, 10, 40, raioPsiquico, garraFantasmagorica,
				ataqueMalandro, bolaSombria);
		listaMonstro.add(14, "Mula sem Cabeça", fogo, nulo, 30, 30, 20, 20, rajadaDeFogo, voadora, ataqueMalandro,
				erupcaoDeFogo);
		listaMonstro.add(15, "Negrinho do Pastoreio", fada, nulo, 35, 10, 35, 20, cantoMagico, raioPsiquico,
				ataqueMalandro, bonsSonhos);
		listaMonstro.add(16, "Saci", lutador, nulo, 30, 30, 20, 20, ataqueMalandro, voadora, raioPsiquico,
				antonioNunes);
		listaMonstro.add(17, "Alma de Gato", fogo, sombrio, 20, 50, 15, 15, rajadaDeFogo, rosnado, mordida, escuridao);

		do {
			navegacaoMenu = menuInteracao.menuInteracao(treinadorUm, treinadorDois, listaMonstro);
			if (navegacaoMenu == 1) {
				System.out.println("\n\n                       >>>> Que o combate comece <<<<");

				do {

					if (vezTreinadorUm)
						escolha = combate.combateMenu(treinadorUm, treinadorDois, turno);
					else
						escolha = combate.combateMenu(treinadorDois, treinadorUm, turno);

					switch (escolha) {
						case 1:
							for (int i = 0; i < 50; ++i)
								System.out.println();// https://qastack.com.br/programming/2979383/java-clear-the-console#:~:text=Tudo%20o%20que%20esse%20c%C3%B3digo,cls%22%20seguido%20da%20tecla%20Enter.
							if (vezTreinadorUm) {
								do {
									combate.imprimeCombateMenu(treinadorUm, treinadorDois, turno);
									treinadorUm.ataques();
									System.out.println("Escolha um ataque: ");
									escolhaAtaque = leitura.nextInt();
									if (escolhaAtaque < 1 || escolhaAtaque > 4) {
										System.out.println("Esse ataque não existe...");
									}
									if (treinadorUm.getMonstro().getAtaqueCarregado(treinadorUm.getMonstroAtualId())
											.getEnergia() < 1) {
										System.out.println("Ataque carregado sem energia. Use outro ataque.");
										escolhaAtaque = 5;

									}
								} while (escolhaAtaque < 1 || escolhaAtaque > 4);
								if (escolhaAtaque != 4) {
									modificadorDano = listaMonstro
											.getAtaque(treinadorUm.getMonstroAtualId(), (escolhaAtaque - 1)).getDano();
								} else {
									modificadorDano = listaMonstro.getAtaqueCarregado(treinadorUm.getMonstroAtualId())
											.getDano();

									treinadorUm.getMonstro().getAtaqueCarregado(treinadorUm.getMonstroAtualId())
											.setEnergia(treinadorUm.getMonstro()
													.getAtaqueCarregado(treinadorUm.getMonstroAtualId()).getEnergia()
													- 1);
								}
								danoTreinadorUm = combate.calculaAtaque(treinadorUm, treinadorDois, modificadorDano);
							} else {
								do {
									combate.imprimeCombateMenu(treinadorDois, treinadorUm, turno);
									treinadorDois.ataques();
									System.out.println("Escolha um ataque: ");
									escolhaAtaque = leitura.nextInt();
									if (escolhaAtaque < 1 || escolhaAtaque > 4) {
										System.out.println("Esse ataque não existe...");
									}
									if (treinadorDois.getMonstro().getAtaqueCarregado(treinadorDois.getMonstroAtualId())
											.getEnergia() < 1 && escolhaAtaque == 4) {
										System.out.println("Ataque carregado sem energia. Use outro ataque.");
										escolhaAtaque = 5;

									}
								} while (escolhaAtaque < 1 || escolhaAtaque > 4);
								if (escolhaAtaque != 4) {
									modificadorDano = listaMonstro
											.getAtaque(treinadorDois.getMonstroAtualId(), (escolhaAtaque - 1))
											.getDano();
								} else {
									modificadorDano = listaMonstro.getAtaqueCarregado(treinadorDois.getMonstroAtualId())
											.getDano();

									treinadorDois.getMonstro().getAtaqueCarregado(treinadorDois.getMonstroAtualId())
											.setEnergia(treinadorDois.getMonstro()
													.getAtaqueCarregado(treinadorDois.getMonstroAtualId()).getEnergia()
													- 1);
								}
								danoTreinadorDois = combate.calculaAtaque(treinadorDois, treinadorUm, modificadorDano);

							}
							break;
						case 2:
							break;
						case 3:
							if (vezTreinadorUm) {
								combate.imprimeCombateMenu(treinadorUm, treinadorDois, turno);
								treinadorUm.mudaMonstroAtual();
							} else {
								combate.imprimeCombateMenu(treinadorDois, treinadorUm, turno);
								treinadorDois.mudaMonstroAtual();
							}
							break;
						case 4:
							if (vezTreinadorUm) {
								treinadorUm.corre();
							} else {
								treinadorDois.corre();
							}
							break;
						default:
							break;
					}

					if (vezTreinadorUm) {
						vezTreinadorUm = false;
					} else {
						
						System.out.println("Calculou o dano: \nJogador 1 = " + danoTreinadorUm + "\nJogador 2 = "
								+ danoTreinadorDois);
						System.in.read();
						vezTreinadorUm = true;
						turno++;
					}

				} while (treinadorUm.ativo() || treinadorDois.ativo());
			}
		} while (navegacaoMenu != 3);

		leitura.close();
	}
}
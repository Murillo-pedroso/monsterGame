import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
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
         * /// ********IMPORTANTE: OS VALORES DE VIDA, DEFESA, ATAQUE E VELOCIDADE TAO
         * COM 1, SE ALGUEM TIVER COM TEMPO FAZ OS VALORES AI, LEMBRA Q A SOMA DE TODOS
         * OS QUATRO VALORES TEM Q DAR 100 EH NOIS, VAMO PRA CIMA GRUPO.*************
         * ///
         */

        listaMonstro.add(0, "Boitata", fogo, nulo, 50, 30, 10, 10, rajadaDeFogo, rosnado, mordida, erupcaoDeFogo);
        listaMonstro.add(1, "Cuca", dragao, psiquico, 1, 1, 1, 1, asasCortantes, raioPsiquico, tapaDeLama,
                pulsoDoDragao);
        listaMonstro.add(2, "Boto", agua, fada, 1, 1, 1, 1, esguichoDeAgua, mordida, cantoMagico, bonsSonhos);
        listaMonstro.add(3, "Cabra Cabriola", sombrio, nulo, 1, 1, 1, 1, mordida, ataqueMalandro, rosnado, escuridao);
        listaMonstro.add(4, "Chibamba", planta, nulo, 1, 1, 1, 1, voadora, ataqueMalandro, tiroVenenoso,
                sementesVenenosas);
        listaMonstro.add(5, "Corpo Seco", fantasma, nulo, 1, 1, 1, 1, garraFantasmagorica, mordida, rosnado,
                bolaSombria);
        listaMonstro.add(6, "Curupira", lutador, nulo, 1, 1, 1, 1, rajadaDeFogo, voadora, ataqueMalandro, antonioNunes);
        listaMonstro.add(7, "Encantados", planta, fada, 1, 1, 1, 1, tiroVenenoso, cantoMagico, raioPsiquico,
                hiperFeixe);
        listaMonstro.add(8, "Gorjala", pedra, nulo, 1, 1, 1, 1, arremecoDePedra, rosnado, ataqueMalandro,
                desmoronamento);
        listaMonstro.add(9, "Homem do Saco", normal, nulo, 25, 25, 10, 40, ataqueMalandro, mordida, voadora, barrigada);
        listaMonstro.add(10, "Iara", agua, fada, 1, 1, 1, 1, esguichoDeAgua, cantoMagico, mordida, alagamento);
        listaMonstro.add(11, "Labatut", terra, nulo, 1, 1, 1, 1, tapaDeLama, arremecoDePedra, ataqueMalandro,
                terremoto);
        listaMonstro.add(12, "Lobisomem", sombrio, nulo, 1, 1, 1, 1, rosnado, mordida, garraFantasmagorica, escuridao);
        listaMonstro.add(13, "Loura do Banheiro", fantasma, nulo, 1, 1, 1, 1, raioPsiquico, garraFantasmagorica,
                ataqueMalandro, bolaSombria);
        listaMonstro.add(14, "Mula sem Cabeça", fogo, nulo, 1, 1, 1, 1, rajadaDeFogo, voadora, ataqueMalandro,
                erupcaoDeFogo);
        listaMonstro.add(15, "Negrinho do Pastoreio", fada, nulo, 35, 10, 35, 20, cantoMagico, raioPsiquico, ataqueMalandro,
                bonsSonhos);
        listaMonstro.add(16, "Saci", lutador, nulo, 1, 1, 1, 1, ataqueMalandro, voadora, raioPsiquico, antonioNunes);
        listaMonstro.add(17, "Alma de Gato", fogo, sombrio, 1, 1, 1, 1, rajadaDeFogo, rosnado, mordida, escuridao);

        
        

        menuInteracao.menuInteracao(treinadorUm, treinadorDois, listaMonstro);
        System.out.println("\n\n                       >>>> Que o combate comece <<<<");
        treinadorDois.getMonstro().setVida(0, 20);
        combate.combateMenu(treinadorUm, treinadorDois, 1, listaMonstro);

        leitura.close();
    }
}
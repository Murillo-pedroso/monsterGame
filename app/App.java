import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        Treinador treinadorUm = new Treinador();
        Treinador treinadorDois = new Treinador();
        Monstro listaMonstro = new Monstro();
        Menu menuInteracao = new Menu();
       

        Ataque rajadaDeFogo = new Ataque("Rajada de Fogo",TipoElemento.FOGO,5);
        Ataque esguichoDeAgua = new Ataque("Esguicho de Agua",TipoElemento.AGUA,4);
        Ataque tiroVenenoso = new Ataque("Tiro Venenoso", TipoElemento.PLANTA, 4);
        Ataque asasCortantes = new Ataque("Asas Cortantes",TipoElemento.DRAGAO,5);
        Ataque raioPsiquico = new Ataque("Raio Psiquico", TipoElemento.PSIQUICO,6);
        Ataque cantoMagico = new Ataque("Canto Magico",TipoElemento.FADA,2);
        Ataque rosnado = new Ataque("Rosnado", TipoElemento.SOMBRIO, 6);
        Ataque garraFantasmagorica = new Ataque("Garra Fantasmagorica", TipoElemento.FANTASMA, 4);
        Ataque voadora = new Ataque("Voadora", TipoElemento.LUTADOR,7);
        Ataque arremecoDePedra = new Ataque("Arremaço de Pedra", TipoElemento.PEDRA, 4);
        Ataque tapaDeLama = new Ataque("Tapa de Lama",TipoElemento.TERRA, 6);
        Ataque ataqueMalandro = new Ataque("Ataque Malandro",TipoElemento.NORMAL,4);
        Ataque mordida = new Ataque("Mordida",TipoElemento.NORMAL,6);

        AtaqueCarregado erupcaoDeFogo = new AtaqueCarregado("Erupção de Fogo", TipoElemento.FOGO,12, 3, Efeito.INCENDIADO);
        AtaqueCarregado alagamento = new AtaqueCarregado("Alagamento", TipoElemento.AGUA, 9, 5, Efeito.NULO);
        AtaqueCarregado sementesVenenosas = new AtaqueCarregado("Sementes Venenosas", TipoElemento.PLANTA, 10, 4, Efeito.ENVENENADO);
        AtaqueCarregado pulsoDoDragao = new AtaqueCarregado("Pulso do Dragao", TipoElemento.DRAGAO, 12, 4, Efeito.NULO);
        AtaqueCarregado confusaoMental = new AtaqueCarregado("Confusao Mental",TipoElemento.PSIQUICO,5,4,Efeito.ATORDOADO);
        AtaqueCarregado bonsSonhos = new AtaqueCarregado("Bons Sonhos", TipoElemento.FADA, 0, 5,Efeito.DORMINDO);
        AtaqueCarregado escuridao = new AtaqueCarregado("Escuridao", TipoElemento.SOMBRIO, 8, 5, Efeito.NULO);
        AtaqueCarregado bolaSombria = new AtaqueCarregado("Bola Sombria", TipoElemento.FANTASMA, 15, 2, Efeito.NULO);
        AtaqueCarregado antonioNunes = new AtaqueCarregado("Antonio Nunes", TipoElemento.LUTADOR, 12, 2, Efeito.NULO);
        AtaqueCarregado desmoronamento = new AtaqueCarregado("Desmoronamento", TipoElemento.PEDRA, 8, 7, Efeito.NULO);
        AtaqueCarregado terremoto = new AtaqueCarregado("Terremoto", TipoElemento.TERRA, 10, 4, Efeito.NULO);
        AtaqueCarregado barrigada = new AtaqueCarregado("Barrigada", TipoElemento.NORMAL, 12, 3, Efeito.ATORDOADO);
        AtaqueCarregado hiperFeixe = new AtaqueCarregado("Hiper Feixe", TipoElemento.NORMAL, 17, 1, Efeito.NULO);

        /* ///  ********IMPORTANTE: OS VALORES DE VIDA, DEFESA, ATAQUE E VELOCIDADE TAO COM 1, SE ALGUEM TIVER COM TEMPO FAZ OS VALORES AI, 
        LEMBRA Q A SOMA DE TODOS OS QUATRO VALORES TEM Q DAR 100 EH NOIS, VAMO PRA CIMA GRUPO.************* /// */
        
        listaMonstro.add(0, "Boitata", TipoElemento.FOGO, TipoElemento.NULO, 1, 1, 1, 1, rajadaDeFogo,rosnado,mordida,erupcaoDeFogo);
        listaMonstro.add(1, "Cuca", TipoElemento.DRAGAO,TipoElemento.PSIQUICO,1,1,1,1,asasCortantes,raioPsiquico,tapaDeLama,pulsoDoDragao);
        listaMonstro.add(2, "Boto", TipoElemento.AGUA,TipoElemento.FADA,1,1,1,1,esguichoDeAgua,mordida,cantoMagico,bonsSonhos);
        listaMonstro.add(3,"Cabra Cabriola", TipoElemento.SOMBRIO,TipoElemento.NULO,1,1,1,1,mordida,ataqueMalandro,rosnado,escuridao);
        listaMonstro.add(4,"Chibamba",TipoElemento.PLANTA,TipoElemento.NULO,1,1,1,1,voadora,ataqueMalandro,tiroVenenoso,sementesVenenosas);
        listaMonstro.add(5,"Corpo Seco",TipoElemento.FANTASMA,TipoElemento.NULO,1,1,1,1,garraFantasmagorica,mordida,rosnado,bolaSombria);
        listaMonstro.add(6, "Curupira", TipoElemento.LUTADOR, TipoElemento.NULO, 1, 1, 1, 1, rajadaDeFogo, voadora, ataqueMalandro, antonioNunes);
        listaMonstro.add(7,"Encantados",TipoElemento.PLANTA,TipoElemento.FADA,1,1,1,1,tiroVenenoso,cantoMagico,raioPsiquico,hiperFeixe);
        listaMonstro.add(8,"Gorjala",TipoElemento.PEDRA,TipoElemento.NULO,1,1,1,1,arremecoDePedra,rosnado,ataqueMalandro,desmoronamento);
        listaMonstro.add(9,"Homem do Saco", TipoElemento.NORMAL,TipoElemento.NULO,1,1,1,1,ataqueMalandro,mordida,voadora,barrigada);
        listaMonstro.add(10,"Iara",TipoElemento.AGUA,TipoElemento.FADA,1,1,1,1,esguichoDeAgua,cantoMagico,mordida,alagamento);
        listaMonstro.add(11,"Labatut",TipoElemento.TERRA,TipoElemento.NULO,1,1,1,1,tapaDeLama,arremecoDePedra,ataqueMalandro,terremoto);
        listaMonstro.add(12,"Lobisomem",TipoElemento.SOMBRIO,TipoElemento.NULO,1,1,1,1,rosnado,mordida,garraFantasmagorica,escuridao);
        listaMonstro.add(13, "Loura do Banheiro",TipoElemento.FANTASMA,TipoElemento.NULO, 1,1,1,1,raioPsiquico,garraFantasmagorica,ataqueMalandro,bolaSombria);
        listaMonstro.add(14,"Mula sem Cabeça",TipoElemento.FOGO,TipoElemento.NULO,1,1,1,1,rajadaDeFogo,voadora,ataqueMalandro,erupcaoDeFogo);
        listaMonstro.add(15,"Negrinho do Pastoreio",TipoElemento.FADA,TipoElemento.NULO,1,1,1,1,cantoMagico,raioPsiquico,ataqueMalandro,bonsSonhos);
        listaMonstro.add(16,"Saci",TipoElemento.LUTADOR,TipoElemento.NULO,1,1,1,1,ataqueMalandro,voadora,raioPsiquico,antonioNunes);
        listaMonstro.add(17,"Alma de Gato",TipoElemento.FOGO,TipoElemento.SOMBRIO,1,1,1,1,rajadaDeFogo,rosnado,mordida,escuridao);

        
        menuInteracao.menuInteracao(treinadorUm,treinadorDois,listaMonstro);
       
        leitura.close();
    }
}
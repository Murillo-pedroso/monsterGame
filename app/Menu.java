import java.io.IOException;
import java.util.Scanner;

public class Menu {
    
    public Menu() {
    }

    public int menuInteracao(Treinador treinadorUm, Treinador treinadorDois, Monstro listaMonstro) throws InterruptedException, IOException {
        Escolha verificaEscolha = new Escolha();
        Scanner leitura = new Scanner(System.in);
        int navegacaoMenu = 0;

        System.out.printf("\n");
        System.out.println("\t>>> Monster Game <<<");

        System.out.printf("\n");
        do {
            System.out.println("\t1- Jogar partida arcade");
            System.out.println("\t2- Exibir regras do jogo");
            System.out.println("\t3- Sair");
            System.out.println("\tRESPOSTA: ");

            navegacaoMenu = leitura.nextInt();

            switch (navegacaoMenu) {

                case 1:                   
                    verificaEscolha.escolhaMonstro(treinadorUm, listaMonstro);
                    verificaEscolha.escolhaMonstro(treinadorDois, listaMonstro);
                    break;
                case 2:
                    System.out.println("Regras do jogo: ");
                    System.out.println("1- O mesmo jogador não poderá escolher o mesmo monstro");
                    System.out.println("2- Existem as prioridades de desempate para quem vai atacar primeiro");
                    System.out.println("3- O jogador 2 não tem desvantagem por ser 2\n");
                    System.out.println("Pressione qualquer tecla para continuar...");
                    System.in.read();//https://www.guj.com.br/t/como-faco-pra-pausar-a-execucao/32986/6
                    //Thread.sleep(500);//https://www.javatpoint.com/sleep()-method


                    break;

                case 3:
                    System.out.println("Até a próxima jogador!");
                    break;
                default:

                    System.out.println("Opcao não encontrada, digite novamente\n");
                   

                    break;
            }
        } while (navegacaoMenu != 1 && navegacaoMenu != 2 && navegacaoMenu != 3);
        return navegacaoMenu;
    }
}

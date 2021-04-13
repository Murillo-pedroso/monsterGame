import java.util.Scanner;

public class Menu {
    public int menuInteracao(){
        System.out.printf("\n");
        System.out.println("\t>>> Monster Game <<<");
        
        System.out.printf("\n");

        System.out.println("\t1- Jogar partida arcade");
        System.out.println("\t2- Exibir regras do jogo");
        System.out.println("\t3- Sair");
        
        System.out.printf("\n");
        System.out.printf("\tRESPOSTA: ");

        Scanner leitura = new Scanner(System.in);
        
        int navegacaoMenu = 0;

        navegacaoMenu = leitura.nextInt();

        switch (navegacaoMenu) {

            case 1:
                System.out.println("Para jogar partida Arcade você deverá escolher seus monstros");
                System.out.println("Você confirma a escolha e quer se juntar aos Monsters Gamers?\n");
                
                System.out.println("1- Confirma  2- Desistir\n");
                
                System.out.println("Resposta: ");

                navegacaoMenu = leitura.nextInt();
                
                break;
            case 2: 
                break;

            case 3: 
                break;
            default:
                do {
                    System.out.println("Opcao não encontrada, digite novamente");
                    System.out.print("RESPOSTA: ");

                    navegacaoMenu = leitura.nextInt();

                    System.out.println("\n");

                } while (navegacaoMenu < 1 || navegacaoMenu > 2);
                
                break;
        }

        return navegacaoMenu;
    }
}

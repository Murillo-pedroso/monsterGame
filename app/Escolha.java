import java.util.ArrayList;
import java.util.Scanner;

public class Escolha {
    public void EscolhaMonstro() {

        int escolhaJogadorUm = 0;   
        int controleEscolhaJogadorUm = 1;
        int acumuladorDeErro = 0;
        int acumuladorDeErroNaListagem = 0;
        String armazenaListagem[] = new String[3];

        ArrayList<String> percorreListagemDeMonstros = new ArrayList();

        Scanner leitura = new Scanner(System.in);


        do {
            do {
                System.out.println("Faça sua " + controleEscolhaJogadorUm +"ª escolha\n");
                System.out.printf("RESPOSTA: ");

                escolhaJogadorUm = leitura.nextInt();
                do {
                    switch (escolhaJogadorUm) {
                        case 1:
                            System.out.println("Beholder\n");

                            percorreListagemDeMonstros.add("Beholder");

                            break;

                        case 2:
                            System.out.println("Mimico\n");

                            percorreListagemDeMonstros.add("Mimico");

                            break;
                        
                        case 3:
                            System.out.println("Lich\n");

                            percorreListagemDeMonstros.add("Lich");

                            break;
                        
                        case 4:
                            System.out.println("Drow\n");

                            percorreListagemDeMonstros.add("Drow");

                            break;

                        case 5:
                            System.out.println("Tarrasque\n");

                            percorreListagemDeMonstros.add("Tarrasque");

                            break;

                        case 6:
                            System.out.println("Female\n");
                
                            percorreListagemDeMonstros.add("Female");

                            break;

                        default:
                            do {
                                System.out.println("Opção não encontrada, digite novamente\n");
                                System.out.println("RESPOSTA: ");

                                escolhaJogadorUm = leitura.nextInt();

                                if (escolhaJogadorUm < 1 || escolhaJogadorUm > 6)
                                    acumuladorDeErro++;
                                

                                System.out.println("\n");  

                            } while (escolhaJogadorUm < 1 || escolhaJogadorUm > 6);

                            break;
                        
                }
                } while ();

                armazenaListagem[0] = percorreListagemDeMonstros.get(0);
                controleEscolhaJogadorUm++;
                
            } while (controleEscolhaJogadorUm <= 3);
            
            System.out.println(armazenaListagem[0]);
            System.out.println(armazenaListagem[1]);
            System.out.println(armazenaListagem[2]);

            //Print abaixo somente para teste, desconsiderar na versão final do código.
            System.out.println(percorreListagemDeMonstros);

        } while(false);

    }
}
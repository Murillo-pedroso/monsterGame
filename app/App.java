import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        int resposta;
        Ataque fireBlast = new Ataque("Fire Blast", TipoElemento.FOGO, 5, 999);
        Ataque overheat = new Ataque("Overheat", TipoElemento.FOGO, 10, 5);
        Ataque sendAttack = new Ataque("Sand-attack", TipoElemento.TERRA, 10, 999);
        Ataque earthquake = new Ataque("Earthquake", TipoElemento.TERRA, 15, 5);
        Ataque waterGun = new Ataque("Water Gun", TipoElemento.AGUA, 7, 999);
        Ataque aquaTail = new Ataque("Aqua Tail", TipoElemento.AGUA, 12, 5);
        Ataque spark = new Ataque("Spark", TipoElemento.ELETRICO, 5, 999);
        Ataque shockWave = new Ataque("Shock Wave", TipoElemento.ELETRICO, 10, 5);
        Ataque mist = new Ataque("Mist", TipoElemento.GELO, 5, 999);
        Ataque icyWind = new Ataque("Icy Wind", TipoElemento.GELO, 10, 5);
        Ataque machPunch = new Ataque("Mach Punch", TipoElemento.LUTADOR, 5, 999);
        Ataque hammerArm = new Ataque("Hammer Arm", TipoElemento.LUTADOR, 10, 5);

        Scanner leitura = new Scanner(System.in);

        Monstro Beholder = new Monstro(1, "Beholder",TipoElemento.FOGO, 65, 63, 45, 45, fireBlast, overheat);      
        Monstro Mimico = new Monstro(2, "Mimico", TipoElemento.TERRA, 45, 45, 55, 63, sendAttack, earthquake);        
        Monstro Lich = new Monstro(3, "Lich", TipoElemento.AGUA, 55, 55, 45, 45, waterGun, aquaTail);
        Monstro Drow = new Monstro(4, "Drow", TipoElemento.ELETRICO, 65, 63, 45, 45, spark, shockWave);
        Monstro Tarrasque = new Monstro(5, "Tarrasque", TipoElemento.GELO, 65, 63, 45, 45, mist, icyWind);
        Monstro Female = new Monstro(6, "Female", TipoElemento.LUTADOR, 65, 63, 45, 44, machPunch, hammerArm);
        
        Escolha verificaEscolhaDoJogador = new Escolha();

        Menu menuInteracaoComUsuario = new Menu();
        resposta = menuInteracaoComUsuario.menuInteracao();
        
        if(resposta == 1) {
            Beholder.Imprime();
            Mimico.Imprime();
            Lich.Imprime();
            Drow.Imprime();
            Tarrasque.Imprime();
            Female.Imprime();

            verificaEscolhaDoJogador.escolhaMonstro();

            /* 
            Comentários escritos abaixo para facilitar testes,
            Não deve ser usado pois o menu necessita de algumas
            mudanças.
            */

            /*
            switch (resposta) {
                case 1:
                    verificaEscolhaDoJogador.EscolhaMonstro();
                    break;
                
                case 2:
                    System.out.println("Até a próxima jogador!");
                    break;

                default:
                    do {
                        System.out.println("Opção não encontrada, responda novamente!\n");
                        System.out.println("RESPOSTA: ");

                        resposta = leitura.nextInt();

                        System.out.println("\n");

                    } while(resposta < 1 || resposta > 2);

                    break;
            }
            */
        }

        /*
        else if(resposta == 2){
            System.out.println("Regras do jogo: ");
            System.out.println("1- O mesmo jogador não poderá escolher o mesmo monstro");
            System.out.println("2- Existem as prioridades de desempate para quem vai atacar primeiro");
            System.out.println("3- O jogador 2 não tem desvantagem por ser 2");

            System.out.println("O que deseja fazer?");
            System.out.println("\t 1- Voltar ao menu");
            System.out.println("\t 2- Jogar partida arcade!");
            System.out.println("\t 3- Sair");

            
            /*
            if (resposta == 1) {

            }
            *

            if (resposta == 2) {
                verificaEscolhaDoJogador.EscolhaMonstro();
            }

            else if (resposta == 3) {
                System.out.println("Sessão encerrada Monster Gamer");
                System.out.println("Até a próxima");
            }
        }

        */
        else if (resposta == 3) {
            System.out.println("Sessão encerrada Monster Gamer");
            System.out.println("Até a próxima!");
        }

        

    }
}
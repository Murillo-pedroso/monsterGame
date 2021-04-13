import java.util.ArrayList;
import java.util.*;

public class Escolha {
    public void escolhaMonstro() {

        int escolhaJogadorUm = 0;            
        int error = 0;
        int errorRepetePrimeiraEscolha = 0;
        String escolhaJogadorUmStr = ""; 

        int escolhaJogadorDois = 0;
        int errorRepeteSegundaEscolha = 0;
        String escolhaJogadorDoisStr = "";
        
        
        ArrayList<String> percorreListagemDeJogadorUm = new ArrayList();
        ArrayList<String> percorreListagemDeJogadorDois = new ArrayList();

        Scanner leituraResposta = new Scanner(System.in);



        System.out.println(">>> Atenção jogador 1. Faça suas escolhas! <<<");

        for (int controleEscolhaJogadorUm = 0; controleEscolhaJogadorUm < 3; controleEscolhaJogadorUm++) {
            
            do {
                errorRepetePrimeiraEscolha = 0;
                
                do {
                    error = 0;

                    System.out.println("Faça sua " + (controleEscolhaJogadorUm + 1) +"ª escolha\n");
                    System.out.println("RESPOSTA: ");

                    escolhaJogadorUm = leituraResposta.nextInt();
                    
                    if (escolhaJogadorUm == 1)                         
                        escolhaJogadorUmStr = "beholder";
                        
                    else if (escolhaJogadorUm == 2) 
                        escolhaJogadorUmStr = "mimico";
                        
                    else if (escolhaJogadorUm == 3) 
                        escolhaJogadorUmStr = "lich";
                    
                    else if (escolhaJogadorUm == 4) 
                        escolhaJogadorUmStr = "drow";
                        
                    else if (escolhaJogadorUm == 5) 
                        escolhaJogadorUmStr = "tarrasque";
                        
                    
                    else if (escolhaJogadorUm == 6) 
                        escolhaJogadorUmStr = "female";
                        
                    else{
                        System.out.println("Monstro não existente. Escolha outro monstro: \n");
                        error = 1;
                    }

                } while (error == 1);
                
                if (controleEscolhaJogadorUm == 0) {

                    percorreListagemDeJogadorUm.add(escolhaJogadorUmStr);
                    
                }
                else if(controleEscolhaJogadorUm == 1){  
                    if (escolhaJogadorUmStr == percorreListagemDeJogadorUm.get(controleEscolhaJogadorUm - 1) ) {
                        System.out.println("\nVocê já selecionou esse monstro\nSelecione novamente, por favor\n");
                        System.out.println("RESPOSTA: ");
                        
                        errorRepetePrimeiraEscolha = 1;
                    }
                    else
                        percorreListagemDeJogadorUm.add(escolhaJogadorUmStr);    
                    
                }else{
                    if (escolhaJogadorUmStr == percorreListagemDeJogadorUm.get(controleEscolhaJogadorUm - 1) || escolhaJogadorUmStr == percorreListagemDeJogadorUm.get(controleEscolhaJogadorUm - 2)) {
                        System.out.println("\nVocê já selecionou esse monstro\nSelecione novamente, por favor\n");
                        System.out.println("RESPOSTA: ");

                        errorRepetePrimeiraEscolha = 1;
                    }
                    else 
                        percorreListagemDeJogadorUm.add(escolhaJogadorUmStr);
                        
                }
            } while (errorRepetePrimeiraEscolha == 1);

        }

        
        System.out.println(percorreListagemDeJogadorUm);
        

        System.out.println("\n>>> Atenção jogador 2. Faça suas escolhas! <<<");

        for (int controleEscolhaJogadorDois = 0; controleEscolhaJogadorDois < 3; controleEscolhaJogadorDois++) {
            
            do {
                errorRepeteSegundaEscolha = 0;
                
                do {
                    error = 0;

                    System.out.println("Faça sua " + (controleEscolhaJogadorDois + 1) +"ª escolha\n");
                    System.out.println("RESPOSTA: ");

                    escolhaJogadorDois = leituraResposta.nextInt();
                    
                    if (escolhaJogadorDois == 1)                         
                        escolhaJogadorDoisStr = "beholder";
                        
                    else if (escolhaJogadorDois == 2) 
                        escolhaJogadorDoisStr = "mimico";
                        
                    else if (escolhaJogadorDois == 3) 
                        escolhaJogadorDoisStr = "lich";
                    
                    else if (escolhaJogadorDois == 4) 
                        escolhaJogadorDoisStr = "drow";
                        
                    else if (escolhaJogadorDois == 5) 
                        escolhaJogadorDoisStr = "tarrasque";
                        
                    
                    else if (escolhaJogadorDois == 6) 
                        escolhaJogadorDoisStr = "female";
                        
                    else{
                        System.out.println("Monstro não existente. Escolha outro monstro: \n");
                        error = 1;
                    }

                } while (error == 1);
                
                if (controleEscolhaJogadorDois == 0) {

                    percorreListagemDeJogadorDois.add(escolhaJogadorDoisStr);
                    
                }
                else if(controleEscolhaJogadorDois == 1){  
                    if (escolhaJogadorDoisStr == percorreListagemDeJogadorDois.get(controleEscolhaJogadorDois - 1) ) {
                        System.out.println("\nVocê já selecionou esse monstro\nSelecione novamente, por favor\n");
                        System.out.println("RESPOSTA: ");
                        
                        errorRepeteSegundaEscolha = 1;
                    }
                    else
                        percorreListagemDeJogadorDois.add(escolhaJogadorDoisStr);    
                    
                }else{
                    if (escolhaJogadorDoisStr == percorreListagemDeJogadorDois.get(controleEscolhaJogadorDois - 1) || escolhaJogadorDoisStr == percorreListagemDeJogadorDois.get(controleEscolhaJogadorDois - 2)) {
                        System.out.println("\nVocê já selecionou esse monstro\nSelecione novamente, por favor\n");
                        System.out.println("RESPOSTA: ");

                        errorRepeteSegundaEscolha = 1;
                    }
                    else 
                        percorreListagemDeJogadorDois.add(escolhaJogadorDoisStr);
                        
                }
            } while (errorRepeteSegundaEscolha == 1);

            
        }
        
        System.out.println(percorreListagemDeJogadorDois);
    }
}
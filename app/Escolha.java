import java.util.*;

public class Escolha {
    public void escolhaMonstro(Treinador treinador,Monstro listaMonstro) {

        int escolhaMonstro = 0;            
        int error = 0;
        int errorRepetePrimeiraEscolha = 0;
        String escolhaJogadorUmStr = ""; 

        Scanner leituraResposta = new Scanner(System.in);

        System.out.println(">>> Atenção treinador. Faça suas escolhas! <<<");

        for (int controleEscolhaJogadorUm = 0; controleEscolhaJogadorUm < 3; controleEscolhaJogadorUm++) {
            
            do {
                errorRepetePrimeiraEscolha = 0;
                
                do {
                    error = 0;
                    listaMonstro.imprime();
                    System.out.println("Faça sua " + (controleEscolhaJogadorUm + 1) +"ª escolha\n");
                    System.out.println("RESPOSTA: ");

                    escolhaMonstro = leituraResposta.nextInt();
                    
                   

                } while (error == 1);
                
                if (controleEscolhaJogadorUm == 0) 
                    treinador.setMonstro(controleEscolhaJogadorUm, monstro);                    
                
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

                    else {
                        System.out.println("Monstro não existente. Escolha outro monstro: \n");
                        error = 1;
                    }
                } while (error == 1);
                
                if (controleEscolhaJogadorDois == 0) 
                    percorreListagemDeJogadorDois.add(escolhaJogadorDoisStr);    
                
                else if(controleEscolhaJogadorDois == 1){  
                    if (escolhaJogadorDoisStr == percorreListagemDeJogadorDois.get(controleEscolhaJogadorDois - 1) ) {
                        System.out.println("\nVocê já selecionou esse monstro\nSelecione novamente, por favor\n");
                        System.out.println("RESPOSTA: ");
                        
                        errorRepeteSegundaEscolha = 1;
                    }
                    else
                        percorreListagemDeJogadorDois.add(escolhaJogadorDoisStr);    
                    
                }
                else {
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
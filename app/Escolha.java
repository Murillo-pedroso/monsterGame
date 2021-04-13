import java.util.ArrayList;
import java.util.*;

public class Escolha {
    public void escolhaMonstro() {

        int escolhaJogadorUm = 0;            
        int error = 0;
        int errorRepeteMonstro = 0;
        String escolhaJogadorUmStr = ""; 
        
        

        ArrayList<String> percorreListagemDeMonstros = new ArrayList();

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            
            do{
                errorRepeteMonstro = 0;
                
                do{
                    error = 0;
                    System.out.println("Faça sua " +(i+1)+"ª escolha\n");
                    escolhaJogadorUm = scan.nextInt();
                    
                    if(escolhaJogadorUm == 1){
                        
                        escolhaJogadorUmStr = "beholder";
                        
                    }else if(escolhaJogadorUm == 2){
                        escolhaJogadorUmStr = "mimico";
                        
                    }else if(escolhaJogadorUm == 3){
                        escolhaJogadorUmStr = "lich";
                    

                    }else if(escolhaJogadorUm == 4){
                        escolhaJogadorUmStr = "drow";
                        

                    }else if(escolhaJogadorUm == 5){
                        escolhaJogadorUmStr = "tarrasque";
                        

                    }else if(escolhaJogadorUm == 6){
                        escolhaJogadorUmStr = "female";
                        

                    }else{
                        System.out.println("Opção inválida, escolha outro...\n");
                        error = 1;

                    }
                }while(error == 1);
                
                if( i == 0 ){

                    percorreListagemDeMonstros.add(escolhaJogadorUmStr);
                   
                    
                }else{  
                    if (escolhaJogadorUmStr == percorreListagemDeMonstros.get(i-1) ) {
                        System.out.println("\nVocê já selecionou esse monstro\nSelecione novamente, por favor\n");
                        errorRepeteMonstro = 1;
                    }else{
                        percorreListagemDeMonstros.add(escolhaJogadorUmStr);
                        
                    }
                }

                if(i == 2){
                    if (escolhaJogadorUmStr == percorreListagemDeMonstros.get(i-2) ) {
                        System.out.println("\nVocê já selecionou esse monstro\nSelecione novamente, por favor\n");
                        errorRepeteMonstro = 1;
                    }else{
                        percorreListagemDeMonstros.add(escolhaJogadorUmStr);
                        
                    }

                }
            }while(errorRepeteMonstro == 1);
            
        }

    }
}
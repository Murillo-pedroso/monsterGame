import java.util.Scanner;

public class Combate {
    public Combate(){

    }
    public int combateMenu(Treinador atacante,Treinador defensor,int turno){
        
        System.out.println("\nTurno " + turno);
        System.out.println("");
        System.out.printf(String.format("%23s %-40s","","**>  Seu turno " + atacante.getNome()+"  <**")+"\n");
        imprimeCombateMenu(atacante, defensor);
        System.out.println("\n");
        System.out.printf(String.format("%7s", ""));
        System.out.println("|---------------------------------------------------------|");
        System.out.printf(String.format("%7s", ""));
        System.out.println("|"+String.format("%-30s %1s %11s %1s %5s ",
         " O que "+atacante.getMonstro().getNome(atacante.getMonstroAtualId()),"|","1 - Atacar"," ","2 - Bolsa |"));
         System.out.printf(String.format("%7s", ""));
         System.out.printf("|"+String.format("%-30s %1s %11s %1s %5s ",
         " irá fazer?","|","3 - Trocar"," ","4 - Fugir |"));
         System.out.println("");
         System.out.printf(String.format("%7s", ""));
         System.out.println("|---------------------------------------------------------|");

         Scanner sc = new Scanner(System.in);
         int ret = sc.nextInt();

         return ret;
        
    }
    public void imprimeCombateMenu(Treinador atacante,Treinador defensor){
        double resultado;
        System.out.println("|--------------------------------|");

        System.out.println("| Inimigo:                       |");
        System.out.println("| "+String.format("%-21s %10s", defensor.getMonstro().getNome(defensor.getMonstroAtualId()),"|"));
        System.out.printf("| "+String.format("%8s ", "HP   "));
        resultado = defensor.getMonstro().getVidaMax(defensor.getMonstroAtualId())/10;
        
        for (int i = 0; i < Math.floor((defensor.getMonstro().getVida(defensor.getMonstroAtualId())/resultado)); i++) {
            System.out.printf("▓");
        }
        
        for (int i = 0; i < (10-Math.floor((defensor.getMonstro().getVida(defensor.getMonstroAtualId())/resultado))); i++) {

            System.out.printf("▒");
        }  
        System.out.printf("            |");      
        System.out.println("\n|--------------------------------|");
        System.out.println("------------------------------------");
        System.out.println("                                    VS ");
        System.out.println("                                      ------------------------------------");

        System.out.printf(String.format("%39s", ""));
        System.out.println("|--------------------------------|");
        System.out.printf(String.format("%39s", ""));
        System.out.println("| Seu atual:                     |");
        System.out.printf(String.format("%39s", ""));
        System.out.println("| "+String.format("%-21s %10s", atacante.getMonstro().getNome(atacante.getMonstroAtualId()),"|"));
        System.out.printf(String.format("%39s", ""));
        System.out.printf("| "+String.format("%8s ", "HP   "));
        resultado = atacante.getMonstro().getVidaMax(atacante.getMonstroAtualId())/10;

        for (int i = 0; i < Math.floor((atacante.getMonstro().getVida(atacante.getMonstroAtualId())/resultado)); i++) {
            System.out.printf("▓");
        }
        for (int i = 0; i < 10-Math.floor((atacante.getMonstro().getVida(atacante.getMonstroAtualId())/resultado)); i++) {

            System.out.printf("▒");
        }     
        System.out.printf("            |");      
        System.out.println("");
        System.out.printf(String.format("%39s", ""));
        System.out.printf("| "+String.format("%15.0f %1s %-12.0f %1s", atacante.getMonstro().getVida(atacante.getMonstroAtualId()),"/",atacante.getMonstro().getVidaMax(atacante.getMonstroAtualId()),"|"));
        System.out.println("");
        System.out.printf(String.format("%39s", ""));
        System.out.println("|--------------------------------|");

    }
    public double calculaAtaque(Treinador atacante,Treinador defensor,int golpeEscolhido){
        //DANO = (a.atk - (b.pdef / 2)) * (20 + a.str) / 20 -->https://centrorpg.com/index.php?topic=19931.0
            
        return (golpeEscolhido - (defensor.getMonstro().getDefesa(defensor.getMonstroAtualId() / 2)) * (20 + atacante.getMonstro().getForca(atacante.getMonstroAtualId()) /20));
    }
    
    
}

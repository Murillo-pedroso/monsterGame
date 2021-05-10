public class Combate {
    public Combate(){

    }
    public void combateMenu(Treinador atacante,Treinador defensor,int turno,Monstro listaMonstro){

        System.out.println("Turno " + turno);
        System.out.println("**>  Seu turno " + atacante.getNome()+"  <**");
        System.out.println("|--------------------------------|");

        System.out.println("| Inimigo:                       |");
        System.out.println("| "+String.format("%-21s %10s", listaMonstro.getNome(defensor.getMonstroAtualId()),"|"));
        System.out.printf("| "+String.format("%8s ", "HP   "));
        for (int i = 0; i < (defensor.getMonstro().getVida(0)/5); i++) {
            System.out.printf("▓");
        }
        for (int i = 0; i < (defensor.getMonstro().getVidaMax(0)/5)-(defensor.getMonstro().getVida(0)/5); i++) {

            System.out.printf("▒");
        }       
        System.out.println("\n|--------------------------------|");
        System.out.println("------------------------------------");
        System.out.println("                                    VS ");
        System.out.println("                                      ------------------------------------");

        System.out.printf(String.format("%39s", ""));
        System.out.println("|--------------------------------|");
        System.out.printf(String.format("%39s", ""));
        System.out.println("| Atual:                         |");
        System.out.printf(String.format("%39s", ""));
        System.out.println("| "+String.format("%-21s %10s", listaMonstro.getNome(atacante.getMonstroAtualId()),"|"));
        System.out.printf(String.format("%39s", ""));
        System.out.printf("| "+String.format("%8s ", "HP   "));
        for (int i = 0; i < (atacante.getMonstro().getVida(0)/5); i++) {
            System.out.printf("▓");
        }
        for (int i = 0; i < (atacante.getMonstro().getVidaMax(0)/5)-(atacante.getMonstro().getVida(0)/5); i++) {

            System.out.printf("▒");
        }     
        System.out.println("");
        System.out.printf(String.format("%39s", ""));
        System.out.printf("| "+String.format("%15.0f %1s %-12.0f %1s", atacante.getMonstro().getVida(0),"/",atacante.getMonstro().getVidaMax(0),"|"));
        System.out.println("");
        System.out.printf(String.format("%39s", ""));
        System.out.println("|--------------------------------|");

        System.out.printf(String.format("%7s", ""));
        System.out.println("|---------------------------------------------------------|");
        System.out.printf(String.format("%7s", ""));
        System.out.println("|"+String.format("%-30s %1s %11s %1s %5s ",
         " O que "+listaMonstro.getNome(atacante.getMonstroAtualId()),"|","1 - Atacar"," ","2 - Bolsa |"));
         System.out.printf(String.format("%7s", ""));
         System.out.printf("|"+String.format("%-30s %1s %11s %1s %5s ",
         " irá fazer?","|","3 - Trocar"," ","4 - Fugir |"));
         System.out.println("");
         System.out.printf(String.format("%7s", ""));
         System.out.println("|---------------------------------------------------------|");
        
    }
    
}

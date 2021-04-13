class Main {

    package class ataquesMonstros;
    import java.util.Scanner;
    import java.util.Random;
  
    public class RPGFigthGame {
      
      static int ataqueUsuario(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha seu ataque:");
        System.out.println("(1) = soco");
        System.out.println("(2) = Especial");
        return leitor.nextInt();
    }
    static int ataqueComputador(){
      Random gerador = new Random();
      return gerador.nextInt(3)+1; //retorna numero entre 1 e 3.
    }
  
    static void imprimeHp(int hpUsuario, int hpComputador, int contagemEspeciais){
      System.out.println("================");
      System.out.println(" HP USUARIO: " + hpUsuario);
      System.out.println(" HP COMPUTADOR: " + hpComputador);
      System.out.println(" Contagem Especiais: " + contagemEspeciais);
      System.out.println("================");
    }
  
    static void batalha(){
      int hpUsuario = 150;
      int hpComputador = 11;
      int contagemEspecial = 5;
      int escolhaAtaque;
  
      while(hpUsuario > 0 && hpComputador > 0){
        imprimeHP(hpUsuario, hpComputador, contagemEspecial);
        escolhaAtaque = ataqueUsuario();
        switch(escolhaAtaque){
          case 1:
          System.out.println("Usuario aplicou um soco");
          hpComputador -= 7;
          break;
          case 2:
          System.out.println("Usuario aplicou um ataque especial");
          hpComputador -= 20;
          contagemEspecial --; // contagemEspecial = contagemEspecial - 1
          break;
          default:
          System.out.println("Opção Invalida.");
          break;
        }
        if(hpComputador > 0){
          escolhaAtaque = ataqueComputador();
          switch(escolhaAtaque){
            case 1:
            System.out.println("Computador aplicou um soco");
            hpUsuario -= 2;
            break;
            case 2:
            System.out.println("Computador aplicou um chute");
            hpUsuario -= 3;
            break;
            case 3:
            System.out.println("Computador aplicou um ataque especial");
            hpUsuario -= 4;
            break;
          }
        }
        else{
          System.out.println("Inimigo derrotado.");
        }
      }
  
    }
  
  }
  
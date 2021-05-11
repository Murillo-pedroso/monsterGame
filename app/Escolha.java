import java.util.*;

public class Escolha {
  
    public void escolhaMonstro(Treinador treinador, Monstro listaMonstro) throws InterruptedException {
        int i = 0;
        int escolhaMonstro = 0;
        int error = 0;
        int errorRepetePrimeiraEscolha = 0;
        String nomeTreinador;
        Monstro escolhaTreinador = new Monstro();

        Scanner sc = new Scanner(System.in);
        for ( i = 0; i < 50; ++i) System.out.println();
        System.out.println("Digite seu nome de treinador!!");
        nomeTreinador = sc.next();
        treinador.setNome(nomeTreinador);
        for ( i = 0; i < 50; ++i) System.out.println();
        System.out.println(">>> Atenção treinador "+nomeTreinador+". Faça suas escolhas! <<<");

        for (int j = 0; j < 3; j++) {

            do {
                errorRepetePrimeiraEscolha = 0;

                do {
                    error = 0;
                    listaMonstro.imprime();
                    System.out.println("Faça sua " + (j + 1) + "ª escolha\n");
                    System.out.println("RESPOSTA: ");

                    escolhaMonstro = sc.nextInt();

                    if(escolhaMonstro<0||escolhaMonstro>=listaMonstro.getPos()){
                        System.out.println("Monstro inválido.");
                        Thread.sleep(1000);
                        for ( i = 0; i < 50; ++i) System.out.println();
                        error=1;
                    }

                } while (error == 1);

                if (j == 0) {
                    escolhaTreinador.add(listaMonstro.getId(escolhaMonstro), listaMonstro.getNome(escolhaMonstro),
                            listaMonstro.getTipo(escolhaMonstro), listaMonstro.getTipoSecundario(escolhaMonstro),
                            listaMonstro.getVida(escolhaMonstro), listaMonstro.getForca(escolhaMonstro),
                            listaMonstro.getDefesa(escolhaMonstro), listaMonstro.getVelocidade(escolhaMonstro),
                            listaMonstro.getAtaque(escolhaMonstro, 0), listaMonstro.getAtaque(escolhaMonstro, 1),
                            listaMonstro.getAtaque(escolhaMonstro, 2), listaMonstro.getAtaqueCarregado(escolhaMonstro));

                } else if (j == 1) {
                    if (escolhaMonstro == escolhaTreinador.getId(0)) {
                        System.out.println("\nVocê já selecionou esse monstro\nSelecione novamente, por favor\n");
                        Thread.sleep(1000);
                        for ( i = 0; i < 50; ++i){System.out.println();};
                        

                        errorRepetePrimeiraEscolha = 1;
                    } else {
                        escolhaTreinador.add(listaMonstro.getId(escolhaMonstro), listaMonstro.getNome(escolhaMonstro),
                                listaMonstro.getTipo(escolhaMonstro), listaMonstro.getTipoSecundario(escolhaMonstro),
                                listaMonstro.getVida(escolhaMonstro), listaMonstro.getForca(escolhaMonstro),
                                listaMonstro.getDefesa(escolhaMonstro), listaMonstro.getVelocidade(escolhaMonstro),
                                listaMonstro.getAtaque(escolhaMonstro, 0), listaMonstro.getAtaque(escolhaMonstro, 1),
                                listaMonstro.getAtaque(escolhaMonstro, 2),
                                listaMonstro.getAtaqueCarregado(escolhaMonstro));
                    }
                } else if (j == 2) {
                    if (escolhaMonstro == escolhaTreinador.getId(0) || escolhaMonstro == escolhaTreinador.getId(1)) {
                        System.out.println("\nVocê já selecionou esse monstro\nSelecione novamente, por favor\n");
                        Thread.sleep(1000);
                        for ( i = 0; i < 50; ++i) System.out.println();

                        errorRepetePrimeiraEscolha = 1;
                    } else {
                        escolhaTreinador.add(listaMonstro.getId(escolhaMonstro), listaMonstro.getNome(escolhaMonstro),
                                listaMonstro.getTipo(escolhaMonstro), listaMonstro.getTipoSecundario(escolhaMonstro),
                                listaMonstro.getVida(escolhaMonstro), listaMonstro.getForca(escolhaMonstro),
                                listaMonstro.getDefesa(escolhaMonstro), listaMonstro.getVelocidade(escolhaMonstro),
                                listaMonstro.getAtaque(escolhaMonstro, 0), listaMonstro.getAtaque(escolhaMonstro, 1),
                                listaMonstro.getAtaque(escolhaMonstro, 2),
                                listaMonstro.getAtaqueCarregado(escolhaMonstro));
                    }
                }
            } while (errorRepetePrimeiraEscolha == 1);

        }

        escolhaTreinador.imprime();
        treinador.setMonstro(escolhaTreinador);
        Thread.sleep(1500);
        for ( i = 0; i < 50; ++i) System.out.println();
        //sc.close();
        
    }

}
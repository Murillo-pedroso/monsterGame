public class Monstro{
    int ID;
    String nome;
    TipoElemento tipo;
    int vida;
    int forca;
    int defesa;
    int velocidade;
    Ataque ataquePrincipal;
    Ataque ataqueSecundario;

    public Monstro(int ID, String nome, TipoElemento tipo, int vida, int forca,int defesa, int velocidade,Ataque ataquePrincipal, Ataque ataqueSecundario){
        this.ID = ID;
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.ataquePrincipal = ataquePrincipal;
        this.ataqueSecundario = ataqueSecundario;

    }

    public void Imprime(){
        System.out.println("ID: " + this.ID +
                            "\nNome: " + this.nome +
                            "\nTipo: " + this.tipo.descricao +
                            "\nVida: " + this.vida +
                            "\nForça: " + this.forca +
                            "\nDefesa: " + this.defesa +
                            "\nVelocidade: " + this.velocidade + 
                            "\nAtaque Principal: " + this.ataquePrincipal.getNome() +
                            "\nAtaque Secundario: " + this.ataqueSecundario.getNome() +"\n");


    }

}
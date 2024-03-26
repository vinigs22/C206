public class Zumbi {

    double vida;
    String nome;

    void mostraVida(){
        System.out.println("A vida do Zumbi "+ nome+ " é " + vida);
    }

    void transfereVida(Zumbi zumbiAlvo, float quantia){
        zumbiAlvo.vida -= quantia;
    }

}

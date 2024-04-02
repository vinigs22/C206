public class Main {

    public static void main(String[] args) {

        Jogador player1 = new Jogador();
        player1.setPonto(0);

        Bloco bloco1 = new Bloco();
        Bloco bloco2 = new Bloco();
        Bloco bloco3 = new Bloco();
        Bloco bloco4 = new Bloco();

        player1.destruirBloco(bloco1);
        player1.destruirBloco(bloco3);

        player1.convertePontos();
    }

}

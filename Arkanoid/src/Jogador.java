public class Jogador {

    private int ponto;

    public void destruirBloco(Bloco bloco){
        bloco.destruir();
        ponto++;
    }

    public void convertePontos(){
        int coins = 0;
        coins = ponto * 100;
        System.out.println("Você fez " + ponto + " pts");
        System.out.println("Portanto ganhou " + coins + " coins!");
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }
}

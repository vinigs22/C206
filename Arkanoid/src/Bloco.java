public class Bloco {

    private static int numBlocos = 0;

    public Bloco() {
        numBlocos++;
    }

    public void destruir(){
        numBlocos--;
    }
}

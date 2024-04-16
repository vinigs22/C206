public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Olavo", 20);
        Lontra lontra = new Lontra("Farri", 30);
        Boi boi = new Boi("Picanha", 25);

        cachorro.mostraInfo();
        lontra.mostraInfo();
        boi.mostraInfo();

        cachorro.emitirSom();
        lontra.emitirSom();

        lontra.nadar();
    }
}

public class Boi extends Mamifero{

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Muhhh muh muhhhhhh!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("O nome do boi é: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("");

    }
}

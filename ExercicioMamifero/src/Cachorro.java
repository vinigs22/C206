public class Cachorro extends Mamifero{

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("O nome do cachorro é: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("");

    }
}

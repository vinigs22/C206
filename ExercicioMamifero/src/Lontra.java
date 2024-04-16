public class Lontra extends Mamifero{

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Lontra emitindo um som!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("O nome da lontra é: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("");

    }
}

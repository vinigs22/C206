public class Musica {

    String nome;
    double duracao;

    public Musica(String nome, double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return  nome + ", Duração: " + duracao;

    }
}

public class Empresario {

    String nome;
    long cnpj;

      public Empresario(String nome, long cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return nome + ", CNPJ: " + cnpj;
    }
}

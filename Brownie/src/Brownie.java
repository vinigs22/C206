public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;



    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void addCarrinho(){
        System.out.println("Adcionando ao carrinho um " + nome);
    }

    public void calculaTotalCompra(){
        System.out.println("Você comprou um " + nome);
        System.out.println("O valor da compra é: " + preco);

    }

    public void mostraInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Sabor do produto: " + sabor);
        System.out.println("");
    }

}

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaCafe(){
        System.out.println("Adcionando mais café");
    }

    @Override
    public void addCarrinho() {
        System.out.println("Otima escolha, pedido adicionado ao seu carrinho: " + nome);
    }
}
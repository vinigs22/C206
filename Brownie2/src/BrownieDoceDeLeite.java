public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adcionando mais doce de leite");
    }

    @Override
    public void addCarrinho() {
        System.out.println("Pedido adicionado ao seu carrinho: " + nome);
    }
}
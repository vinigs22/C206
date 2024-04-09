public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void adicionaNutella(){
        System.out.println("Adcionando mais Nutella");
        preco++;
    }

    @Override
    public void addCarrinho() {
        System.out.println("Adcionando ao carrinho um delicioso " + nome);
    }
}
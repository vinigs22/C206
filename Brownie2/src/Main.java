public class Main {

    public static void main(String[] args) {

        BrownieNutella bn = new BrownieNutella("Brownie Nutella", 20, "Nutella");
        Brownie bl = new BrownieDoceDeLeite("Brownie Doce De Leite", 18, "Doce de Leite");
        Brownie bc = new BrownieCafe("Brownie Cafe", 15, "Café");

        bn.mostraInfo();
        bl.mostraInfo();
        bc.mostraInfo();

        bn.addCarrinho();
        bn.adicionaNutella();
        bn.calculaTotalCompra();

    }

}
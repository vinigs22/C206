public class Main {

    public static void main(String[] args) {

        BrownieNutella bn = new BrownieNutella("BNutella", 20, "Nutella");
        Brownie bl = new BrownieDoceDeLeite("BDoceLeite", 18, "Doce de Leite");
        Brownie bc = new BrownieCafe("BCafe", 15, "Café");

        bn.mostraInfo();
        bl.mostraInfo();
        bc.mostraInfo();

        bn.addCarrinho();
        //if (bn instanceof BrownieNutella){
          //  BrownieNutella brownienutella = (BrownieNutella) bn;
            //brownienutella.adicionaNutella();
        //}

        bn.adicionaNutella();
        bn.calculaTotalCompra();

    }

}

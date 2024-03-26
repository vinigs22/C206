public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        cantina.nome = "Cantina da Neide";

        Salgado salgado1 = new Salgado();
        salgado1.nome = "Coxinha";

        Salgado salgado2 = new Salgado();
        salgado2.nome = "Pao de Hamburguer";

        Salgado salgado3 = new Salgado();
        salgado3.nome = "Kibe";

        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);
        cantina.addSalgado(salgado3);

        cantina.mostrandoInfo();

    }
}

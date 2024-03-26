public class Main {

    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        piloto1.nome = "Dju";

        Piloto piloto2 = new Piloto();
        piloto2.nome = "Cris";

        Kart kart1 = new Kart();
        kart1.nome = "Kart1";

        Kart kart2 = new Kart();
        kart2.nome = "Kart2";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 100f;

        //entender isso, é o core


    }

}

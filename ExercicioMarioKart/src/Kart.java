public class Kart {

    String nome;
    Motor motor;
    Piloto piloto;

    public Kart() {
        this.motor = new Motor();
    }

    void pular(){
        System.out.println("Pulando...");
    }

    void SoltarTurbo(){
        System.out.println("Soltando Turbo...");

    }

    void fazerDrift(){
        System.out.println("Fazendo Drift");
    }


}

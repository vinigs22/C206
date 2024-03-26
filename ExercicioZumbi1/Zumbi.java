package ExercicioZumbi2;

public class Zumbi {

    String nome;
    int vida;
    float altura;
    int forca;

    void iniciar(){
        vida = 100;
        nome = "Anna";
        altura = 1.40f;
        forca = 9999;
    }

    void andar(){
        System.out.println("Zumbi andando...");
    }
    void seAlimentar(){
        System.out.println("Se alimentando");
    }

}

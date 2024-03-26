package Aula3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int numDigitado;
        int numGerado = rand.nextInt(10) + 1;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor de 0 a 10: ");
            numDigitado = entrada.nextInt();
            if(numGerado == numDigitado){
                System.out.println("Você acertou o numero aleatorio");
                break;
            }
            System.out.println("Errou!");
        }

        //Na aula foi feito com doWhile, mas fiz antes com For

        entrada.close();
    }
}

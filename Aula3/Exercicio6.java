package Aula3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);

        int numDigitado;
        int numGerado = rand.nextInt(10) + 1;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor de 0 a 10: ");
            numDigitado = entrada.nextInt();

            if(numDigitado > numGerado){
                System.out.println("Digite um valor menor");
            }else if(numGerado == numDigitado){
                System.out.println("Você acertou o numero aleatorio");
                break;
            }else{
                System.out.println("Digite um valor maior");
            }
        }
    }
}

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite a sua NPA");
        int NPA = entrada.nextInt();
        int NP3 = 0;

        if(NPA >= 60){
            System.out.println("Passou com a nota: " + NPA);
        }
        else{

            System.out.println("Ainda tem como");

            System.out.println("Digite a nota da NP3");
            NP3 = entrada.nextInt();

            if((NP3 + NPA)/2 >= 50){
                System.out.println("Aprovado");
            }else{
                System.out.println("Tente de novo semestre que vem");
            }

        }

        entrada.close();
    }

}

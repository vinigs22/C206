import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero de alunos: ");
        int alunos = entrada.nextInt();

        switch(alunos){
            case 10:
                System.out.println("Sala I-16");
                break;
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Nenhum numero valido");
        }

        entrada.close();
    }

}

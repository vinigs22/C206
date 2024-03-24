import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean pc1 = false, pc2 = false, pc3 = false;
        int qtdPc1 = 0, qtdPc2 = 0, qtdPc3 = 0;

        Scanner entrada = new Scanner(System.in);

        Computador[] computadores = new Computador[3];

        Cliente cliente = new Cliente("Chris", 1231231231);

        Computador computador1 = new Computador(
                "Positivo",
                3300,
                new HardwareBasico("Pentium Core i3", 2200, 8, 500),
                new MemoriaUSB("Pen-drive", 16),
                new SistemaOperacional("Sistema Operacional Linux Ubuntu", 32)
        );

        Computador computador2 = new Computador(
                "Acer",
                8800,
                new HardwareBasico("Pentium Core i5", 3370, 16, 1),
                new MemoriaUSB("Pen-drive", 32),
                new SistemaOperacional("Sistema Operacional Windows 8", 64)
        );

        Computador computador3 = new Computador(
                "Vaio",
                4800,
                new HardwareBasico("Pentium Core i7 ", 4500, 32, 2),
                new MemoriaUSB("HD Externo", 1),
                new SistemaOperacional("Sistema Operacional Windows 10", 64)
        );

        computadores[0] = computador1;
        computadores[1] = computador2;
        computadores[2] = computador3;

        Computador.mostraPCConfigs(computadores);

        while(true){
            System.out.println("Escolha o computador que deseja comprar");
            System.out.println("Digite 1 para selecionar o computador da Promoção 1");
            System.out.println("Digite 2 para selecionar o computador da Promoção 2");
            System.out.println("Digite 3 para selecionar o computador da Promoção 3");
            System.out.println("Digite 0 para sair do menu de compras");

            int escolha = entrada.nextInt();

                if(escolha == 0){
                    System.out.println("Saindo do Menu de compras...");
                    System.out.println();
                    break;
                }else if(escolha == 1){
                    System.out.println("Você escolheu a promoção 1");
                    cliente.calculaTotalCompra(computador1);
                    pc1 = true;
                    qtdPc1++;
                }else if(escolha == 2){
                    System.out.println("Você escolheu a promoção 2");
                    cliente.calculaTotalCompra(computador2);
                    pc2 = true;
                    qtdPc2++;

                }else if(escolha == 3){
                    System.out.println("Você escolheu a promoção 3");
                    cliente.calculaTotalCompra(computador3);
                    pc3 = true;
                    qtdPc3++;

                }else{
                    System.out.println("Escolha uma opção válida");
                }
        }

        System.out.println("------------------------------------------------------");
        cliente.mostraClienteInfo();
        System.out.println("------------------------------------------------------");

        if(pc1 || pc2 || pc3){
            System.out.println("Você comprou os seguintes computadores");
        }else{
            System.out.println("Nenhum computador comprado");
        }

        if (pc1){

            System.out.println();
            System.out.println("Você comprou " + qtdPc1 + " da Promoção 1");
            System.out.println(computador1);
        }
        if(pc2){
            System.out.println();
            System.out.println("Você comprou " + qtdPc2 + " da Promoção 2");
            System.out.println(computador2);
        }
        if (pc3) {
            System.out.println();
            System.out.println("Você comprou " + qtdPc3 + " da Promoção 3");
            System.out.println(computador3);
        }
        System.out.println("------------------------------------------------------");
        cliente.mostraTotalCompra();
        System.out.println("------------------------------------------------------");

    }
}

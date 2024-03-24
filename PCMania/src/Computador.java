public class Computador {

    String marca;
    float preco;
    HardwareBasico hardwareBasico;
    MemoriaUSB memoriaUSB;
    SistemaOperacional sistemaOperacional;

    public Computador(String marca, float preco, HardwareBasico hardwareBasico, MemoriaUSB memoriaUSB, SistemaOperacional sistemaOperacional ) {
        this.marca = marca;
        this.preco = preco;
        this.hardwareBasico = hardwareBasico;
        this.memoriaUSB = memoriaUSB;
        this.sistemaOperacional = sistemaOperacional;
    }

    static void mostraPCConfigs(Computador[] computador){
        for (int i = 0; i < computador.length; i++) {
            System.out.println("Promoção " + (i+1));
            System.out.println(computador[i]);
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\n"
                + "Preço: " + preco + "\n"
                + hardwareBasico.nome + " (" + hardwareBasico.valorMhz + " Mhz)" + "\n"
                + hardwareBasico.valorRAM + " GB de Memória RAM" + "\n"
                + hardwareBasico.valorHD + "Gb de HD" + "\n"
                + sistemaOperacional.nome + "(" +sistemaOperacional.tipo + " bits)" + "\n"
                + memoriaUSB.nome + " de " + memoriaUSB.capacidade + "Gb";
    }
}

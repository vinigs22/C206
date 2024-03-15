import java.sql.SQLOutput;

public class Banda {

    String nome;
    String genero;
    Empresario empresario;
    int popularidade;

    Musica[] musicas = new Musica[20];
    Membro[] membros = new Membro[10];

    public Banda(String nome, String genero, Empresario empresario , int popularidade) {
        this.nome = nome;
        this.genero = genero;
        this.empresario = empresario;
        this.popularidade = popularidade;
    }

    void mostraInfo(){
        int numeroMusica = 1;

        System.out.println("Nome da banda:" + nome);
        System.out.println("Genero da banda:" + genero);
        System.out.println("Empresario: " + empresario);

        System.out.println("Membros:");
        for(Membro membro : membros){
            if (membro != null){
                System.out.println(membro);
            }
        }

        System.out.println("Musicas:");
        for(Musica musica : musicas){
           if (musica != null){
               System.out.println( "Musica " + numeroMusica + ": " + musica);
               numeroMusica++;
           }
        }
        System.out.println("----------------------------------------------");
    }

    void addMusica(Musica musica){

        for (int i = 0; i < musicas.length; i++) {
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }

    }

    void addMembro(Membro membro){
        for (int i = 0; i < musicas.length; i++) {
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }

    void comparaPopularidade(Banda banda){
        if(popularidade > banda.popularidade){
            System.out.println("A banda " + nome + " é mais popular que " + banda.nome);
        }else{
            System.out.println("A banda " + banda.nome + " é mais popular que " + nome);
        }

        System.out.println("A popularidade da banda " + nome + " é " + popularidade);
        System.out.println("A popularidade da banda " + banda.nome + " é " + banda.popularidade);
        System.out.println("----------------------------------------------");
    }

}

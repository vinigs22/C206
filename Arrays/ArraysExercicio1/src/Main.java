public class Main {

    public static void main(String[] args) {

        Banda oasis = new Banda("Oasis", "Rock", new Empresario("Caio Pacheco", 1111111111) , 5);
        Banda nirvana = new Banda("Nirvana", "Rock", new Empresario("Joel", 1111111112), 10) ;
        Musica comeasyouare = new Musica("Come As You Are" , 3.39);
        Musica smellsliketeenspirits = new Musica("Smells Like Teen Spirits", 5.02);
        Musica standbyme = new Musica("Stand by me", 5.57);

        Membro tonymccarroll = new Membro("Tony McCarroll", "Bateria");
        Membro kurtcobain = new Membro("Kurt Cobain", "Vocalista");

        nirvana.addMusica(comeasyouare);
        nirvana.addMusica(smellsliketeenspirits);
        nirvana.addMembro(kurtcobain);
        nirvana.mostraInfo();

        oasis.addMusica(standbyme);
        oasis.addMembro(tonymccarroll);
        oasis.mostraInfo();

        oasis.comparaPopularidade(nirvana);
    }
}

package br.inatel.cdg;

public class Asteroide {

    private String nome;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public void destruir(){
        System.out.println("Asteroide " + tipoAsteroide +" destruido");
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }
}

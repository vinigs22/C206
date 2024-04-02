package br.inatel.cdg;

public class Nave {

    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atacar(Asteroide ast){

        if(tipoTiro == "Explosivo"){
            ast.destruir();
        }else {
            if(ast.getTipoAsteroide() == "Grande"){
                System.out.println("Asteroide só pode ser destruido com tiro explosivo");
            }else{
                ast.destruir();
            }
        }

    }
}

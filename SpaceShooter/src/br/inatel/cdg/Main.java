package br.inatel.cdg;

public class Main {

    public static void main(String[] args) {

    Nave nave1 = new Nave("Executor", 200, "Explosivo");
    Nave nave2 = new Nave("Milano", 200, "Normal");

    Asteroide asteroide1 = new Asteroide("Asteroide1", "Grande");
    Asteroide asteroide2 = new Asteroide("Asteroide1", "Pequeno");

    nave1.atacar(asteroide2);
    nave2.atacar(asteroide1);

    nave1.atacar(asteroide1);
    nave2.atacar(asteroide2);

    }

}

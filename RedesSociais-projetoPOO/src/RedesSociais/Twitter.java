package RedesSociais;

import RedesSociais.Interface.Compartilhamento;

public class Twitter extends RedeSocial implements Compartilhamento {
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Video postado no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Twitter");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Twitter");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no Twitter");
    }
}

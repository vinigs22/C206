package RedesSociais;

import RedesSociais.Interface.Compartilhamento;
import RedesSociais.Interface.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo uma Streaming no Facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postada no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no Facebook");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Facebook");
    }
}

package RedesSociais;

import RedesSociais.Interface.Compartilhamento;
import RedesSociais.Interface.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Foto postada no GooglePlus" );
    }

    @Override
    public void postarVideo() {
        System.out.println("Video postado no GooglePlus" );
    }

    @Override
    public void postarComentario() {
        System.out.println("Comentario postado no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo uma Streaming no GooglePlus");
    }

}

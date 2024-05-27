import RedesSociais.*;
import RedesSociais.Exception.RedeSocialException;
import RedesSociais.Exception.UsuarioInvalidoException;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        try {
            Instagram instagram = new Instagram("senhaInsta", 1000);
            Facebook facebook = new Facebook("senhaFB", 500);

            // Criando um usuário e adicionando Instagram e Facebook
            HashSet<RedeSocial> redesSociaisUsuario = new HashSet<>();
            redesSociaisUsuario.add(instagram);
            redesSociaisUsuario.add(facebook);

            try {
                Usuario usuario1 = new Usuario("Vini", "viniciusgsimoni@gmail.com", redesSociaisUsuario);
                System.out.println(usuario1);

                // Executando ações para cada rede social
                for (RedeSocial redeSocial : usuario1.getRedeSociais()) {
                    if (redeSocial instanceof Instagram) {
                        ((Instagram) redeSocial).postarFoto();
                        ((Instagram) redeSocial).postarVideo();
                        ((Instagram) redeSocial).postarComentario();
                    } else if (redeSocial instanceof Facebook) {
                        ((Facebook) redeSocial).compartilhar();
                        ((Facebook) redeSocial).fazStreaming();
                        ((Facebook) redeSocial).curtirPublicacao();
                    }
                }

            } catch (UsuarioInvalidoException e) {
                System.out.println("Erro ao criar usuário: " + e.getMessage());
            }

        } catch (RedeSocialException e) {
            System.out.println("Erro ao criar rede social: " + e.getMessage());
        }
    }
}

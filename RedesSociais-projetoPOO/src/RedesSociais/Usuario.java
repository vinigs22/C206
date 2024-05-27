package RedesSociais;

import RedesSociais.Exception.UsuarioInvalidoException;
import java.util.HashSet;

public class Usuario {

    private String nome;
    private String email;
    private HashSet<RedeSocial> redeSociais;

    public Usuario(String nome, String email, HashSet<RedeSocial> redeSociais) throws UsuarioInvalidoException {
        if (nome == null || nome.isEmpty() || email == null || email.isEmpty()) {
            throw new UsuarioInvalidoException("Nome ou email do usuário é inválido");
        }
        this.nome = nome;
        this.email = email;
        this.redeSociais = redeSociais;
    }

    public HashSet<RedeSocial> getRedeSociais() {
        return redeSociais;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", redeSociais=" + redeSociais +
                '}';
    }
}

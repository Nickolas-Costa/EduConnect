package Service;

import Model.Usuario;

public class AutenticacaoService {
    public boolean autenticar(Usuario usuario, String login, String senha) {
        if (usuario == null) return false;
        return usuario.login.equals(login) && usuario.senha.equals(senha);
    }
}

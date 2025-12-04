package Service;

import Model.Autenticacao;

public class AutenticacaoService {
    public boolean autenticar(Autenticacao usuario, String login, String senha) {
        if (usuario == null) return false;
        return usuario.autenticar(login, senha);
    }
}


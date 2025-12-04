package Service;

import Model.Administrador;

public class AdministradorService {
    public void alterarSetor(Administrador admin, String novoSetor) {
        admin.setor = novoSetor;
    }
}

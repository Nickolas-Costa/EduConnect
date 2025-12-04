package Repository;

import Model.Administrador;
import java.util.ArrayList;
import java.util.List;

public class AdministradorRepository {

    private List<Administrador> administradores = new ArrayList<>();

    public void salvar(Administrador admin) {
        administradores.add(admin);
    }

    public List<Administrador> listar() {
        return administradores;
    }

    public Administrador buscarPorSetor(String setor) {
        for (Administrador a : administradores) {
            if (a.setor.equalsIgnoreCase(setor)) {
                return a;
            }
        }
        return null;
    }
}
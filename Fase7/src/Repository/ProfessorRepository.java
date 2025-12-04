package Repository;

import Model.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository {

    private List<Professor> professores = new ArrayList<>();

    public void salvar(Professor professor) {
        professores.add(professor);
    }

    public List<Professor> listar() {
        return professores;
    }

    public Professor buscarPorRegistro(int registro) {
        for (Professor p : professores) {
            if (p.registro == registro) {
                return p;
            }
        }
        return null;
    }
}
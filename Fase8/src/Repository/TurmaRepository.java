package Repository;

import Model.Turma;
import java.util.ArrayList;
import java.util.List;

public class TurmaRepository {

    private List<Turma> turmas = new ArrayList<>();

    public void salvar(Turma turma) {
        turmas.add(turma);
    }

    public List<Turma> listar() {
        return turmas;
    }

    public Turma buscarPorCodigo(int codigo) {
        for (Turma t : turmas) {
            if (t.codigo == codigo) {
                return t;
            }
        }
        return null;
    }
}

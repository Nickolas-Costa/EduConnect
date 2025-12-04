package Repository;

import Model.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoRepository {

    private List<Curso> cursos = new ArrayList<>();

    public void salvar(Curso curso) {
        cursos.add(curso);
    }

    public List<Curso> listar() {
        return cursos;
    }

    public Curso buscarPorCodigo(int codigo) {
        for (Curso c : cursos) {
            if (c.codigo == codigo) {
                return c;
            }
        }
        return null;
    }
}


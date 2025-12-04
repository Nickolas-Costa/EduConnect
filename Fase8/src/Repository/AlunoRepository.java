package Repository;

import Model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {

    private List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listar() {
        return alunos;
    }

    public Aluno buscarPorMatricula(int matricula) {
        for (Aluno a : alunos) {
            if (a.matricula == matricula) {
                return a;
            }
        }
        return null;
    }
}

package Service;

import Model.Aluno;
import Model.Avaliacao;

public class AlunoService {
    public void atribuirNota(Aluno aluno, Avaliacao avaliacao, double valor) {
        avaliacao.atribuirNota(valor);
        aluno.getAvaliacoes().add(avaliacao);
    }

    public void atualizarCurso(Aluno aluno, String novoCurso) {
        aluno.curso = novoCurso;
    }
}

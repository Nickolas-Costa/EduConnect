package Service;

import Model.Aluno;
import Model.Avaliacao;
import Model.Professor;
import Model.Turma;

public class TurmaService {
    public void adicionarAluno(Turma turma, Aluno aluno) {
        turma.getListaAlunos().add(aluno);
    }

    public void removerAluno(Turma turma, Aluno aluno) {
        turma.getListaAlunos().remove(aluno);
    }

    public void registrarAvaliacao(Turma turma, Aluno aluno, Avaliacao avaliacao) {
        aluno.getAvaliacoes().add(avaliacao);
    }

    public void definirProfessor(Turma turma, Professor professor) {
        turma.professor = professor;
    }
}

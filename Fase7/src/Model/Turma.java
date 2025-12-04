package Model;

import java.util.ArrayList;

public class Turma {
    public int codigo;
    public Professor professor;
    public Curso curso;
    public ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        listaAlunos.remove(aluno);
    }

    public void registrarAvaliacao(Aluno aluno, Avaliacao avaliacao) {
        aluno.avaliacoes.add(avaliacao);
    }

    public void mostrarResumo() {
        System.out.println("=== Resumo da Turma ===");
        System.out.println("Código da Turma: " + codigo);

        if (professor != null) {
            System.out.println("Professor: " + professor.nome);
        }
        if (curso != null) {
            System.out.println("Curso: " + curso.nome);
        }

        System.out.println("Quantidade de alunos matriculados: " + listaAlunos.size());
        System.out.println("========================\n");
    }

    public void mostrarAvaliacoes() {
        System.out.println("=== Avaliações dos Alunos ===");
        for (Aluno aluno : listaAlunos) {
            System.out.println("Aluno: " + aluno.nome);

            if (aluno.avaliacoes.isEmpty()) {
                System.out.println("  Nenhuma avaliação registrada.");
            } else {
                for (Avaliacao av : aluno.avaliacoes) {
                    System.out.println("  - " + av.getDescricao() + ": " + av.getNota());
                }
            }

            System.out.println("------------------------");
        }
        System.out.println("============================\n");
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
}

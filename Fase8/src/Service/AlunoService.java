package Service;

import Model.Aluno;
import Model.Avaliacao;

import java.util.Scanner;

public class AlunoService {

    public Aluno cadastrarAlunoUI(Scanner sc) {
        System.out.println("\n=== Cadastro de Aluno ===");

        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.print("Login: ");
        aluno.login = sc.nextLine();

        System.out.print("Senha: ");
        aluno.senha = sc.nextLine();

        System.out.print("Matrícula: ");
        aluno.matricula = sc.nextInt();
        sc.nextLine();

        System.out.print("Curso: ");
        aluno.curso = sc.nextLine();

        System.out.println("Aluno cadastrado com sucesso!\n");
        return aluno;
    }

    public void atribuirNota(Aluno aluno, Avaliacao avaliacao, double valor) {
        avaliacao.atribuirNota(valor);
        aluno.getAvaliacoes().add(avaliacao);
    }

    public void atualizarCurso(Aluno aluno, String novoCurso) {
        aluno.curso = novoCurso;
    }

    public void registrarAvaliacaoUI(Scanner sc, TurmaService turmaService) {
        System.out.println("\n=== Registrar Avaliação ===");

        TurmaService ts = turmaService;

        System.out.print("Descrição da avaliação: ");
        String desc = sc.nextLine();

        Avaliacao av = new Avaliacao(desc);

        System.out.print("Nota (0 a 10): ");
        double nota = sc.nextDouble();
        sc.nextLine();

        av.atribuirNota(nota);

        System.out.println("Avaliação registrada!\n");
    }

    public void listarAlunos() {
    }
}

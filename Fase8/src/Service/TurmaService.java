package Service;

import Model.Aluno;
import Model.Avaliacao;
import Model.Curso;
import Model.Professor;
import Model.Turma;

import java.util.List;
import java.util.Scanner;

public class TurmaService {

    public Turma criarTurmaUI(Scanner sc, CursoService cursoService) {
        System.out.println("\n=== Criar Turma ===");

        Turma turma = new Turma();

        System.out.print("Código da turma: ");
        turma.codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Cadastrar curso vinculado:");
        Curso curso = cursoService.cadastrarCursoUI(sc);

        turma.curso = curso;

        System.out.println("Turma criada com sucesso!\n");
        return turma;
    }

    public void adicionarAluno(Turma turma, Aluno aluno) {
        turma.getListaAlunos().add(aluno);
    }

    // UI: adiciona um aluno já cadastrado ou novo na turma recebida
    public void adicionarAlunoUI(Scanner sc, Turma turma, AlunoService alunoService) {
        System.out.println("\n=== Adicionar Aluno à Turma ===");

        // Opção: cadastrar novo aluno ou usar um já existente via AlunoService
        System.out.println("1 - Cadastrar novo aluno e adicionar");
        System.out.println("2 - Cadastrar apenas (retorna)"); // deixando simples
        System.out.print("Escolha: ");
        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 1) {
            Aluno aluno = alunoService.cadastrarAlunoUI(sc);
            turma.getListaAlunos().add(aluno);
            System.out.println("Aluno adicionado à turma!\n");
        } else {
            System.out.println("Operação cancelada ou não implementada seleção de alunos já cadastrados.\n");
        }
    }

    public void definirProfessor(Turma turma, Professor professor) {
        turma.professor = professor;
    }

    // UI: define professor para a turma recebida
    public void definirProfessorUI(Scanner sc, Turma turma, ProfessorService professorService) {
        System.out.println("\n=== Definir Professor da Turma ===");

        Professor professor = professorService.cadastrarProfessorUI(sc);
        turma.professor = professor;

        System.out.println("Professor definido!\n");
    }

    public void registrarAvaliacao(Turma turma, Aluno aluno, Avaliacao avaliacao) {
        aluno.getAvaliacoes().add(avaliacao);
    }

    public void registrarAvaliacaoUI(Scanner sc, Turma turma) {
        System.out.println("\n=== Registrar Avaliação ===");

        System.out.print("Descrição: ");
        String desc = sc.nextLine();
        Avaliacao av = new Avaliacao(desc);

        System.out.print("Nota: ");
        double nota = sc.nextDouble();
        sc.nextLine();

        av.atribuirNota(nota);

        if (turma.getListaAlunos().isEmpty()) {
            System.out.println("A turma não possui alunos cadastrados.\n");
            return;
        }

        System.out.println("Selecione o aluno pelo índice:");
        for (int i = 0; i < turma.getListaAlunos().size(); i++) {
            System.out.println(i + " - " + turma.getListaAlunos().get(i).nome);
        }

        int idx = sc.nextInt();
        sc.nextLine();

        turma.getListaAlunos().get(idx).getAvaliacoes().add(av);

        System.out.println("Avaliação registrada!\n");
    }

    // novo: seleciona uma turma a partir de uma lista fornecida pelo MenuPrincipal
    public Turma selecionarTurmaUI(Scanner sc, List<Turma> turmas) {
        if (turmas == null || turmas.isEmpty()) {
            System.out.println("Nenhuma turma disponível.");
            return null;
        }

        System.out.println("=== Seleção de Turma ===");
        for (int i = 0; i < turmas.size(); i++) {
            Turma t = turmas.get(i);
            System.out.println(i + " - Turma " + t.codigo + " | Curso: " + (t.curso != null ? t.curso.nome : "N/A"));
        }
        System.out.print("Escolha o índice da turma: ");
        int idx = sc.nextInt();
        sc.nextLine();

        if (idx < 0 || idx >= turmas.size()) {
            System.out.println("Índice inválido.");
            return null;
        }

        return turmas.get(idx);
    }

    // lista turmas recebidas
    public void listarTurmas(List<Turma> turmas) {
        if (turmas == null || turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
            return;
        }

        System.out.println("\n=== LISTA DE TURMAS ===");
        for (int i = 0; i < turmas.size(); i++) {
            Turma t = turmas.get(i);
            System.out.println(i + " - Turma " + t.codigo + " | Curso: " + (t.curso != null ? t.curso.nome : "N/A"));
        }
    }

    public void listarTurmas() {
    }
}

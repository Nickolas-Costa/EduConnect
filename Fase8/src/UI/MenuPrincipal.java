package UI;

import Model.*;
import Service.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {

    private final Scanner sc = new Scanner(System.in);

    // Services
    private final AlunoService alunoService = new AlunoService();
    private final ProfessorService professorService = new ProfessorService();
    private final CursoService cursoService = new CursoService();
    private final TurmaService turmaService = new TurmaService();
    private final AdministradorService adminService = new AdministradorService();

    // Registros gerais do sistema
    private final ArrayList<Aluno> alunos = new ArrayList<>();
    private final ArrayList<Professor> professores = new ArrayList<>();
    private final ArrayList<Curso> cursos = new ArrayList<>();
    private final ArrayList<Turma> turmas = new ArrayList<>();
    private final ArrayList<Administrador> administradores = new ArrayList<>();

    public void iniciar() {

        int opc;

        do {
            System.out.println("\n===== EDUCONNECT - MENU PRINCIPAL =====");
            System.out.println("1. Gerenciar Alunos");
            System.out.println("2. Gerenciar Professores");
            System.out.println("3. Gerenciar Cursos");
            System.out.println("4. Gerenciar Turmas");
            System.out.println("5. Gerar Relatórios");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> menuAlunos();
                case 2 -> menuProfessores();
                case 3 -> menuCursos();
                case 4 -> menuTurmas();
                case 5 -> menuRelatorios();
                case 0 -> System.out.println("Encerrando sistema...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opc != 0);
    }

    // -------------------------------
    // MENU ALUNOS
    // -------------------------------
    private void menuAlunos() {

        int opc;

        do {
            System.out.println("\n=== MENU ALUNOS ===");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Listar Alunos");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> alunos.add(alunoService.cadastrarAlunoUI(sc));
                case 2 -> listarAlunos();
                case 0 -> {}
                default -> System.out.println("Opção inválida!");
            }
        } while (opc != 0);
    }

    private void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        System.out.println("\n=== LISTA DE ALUNOS ===");
        for (Aluno a : alunos) {
            System.out.println("- " + a.nome + " (Mat.: " + a.matricula + ")");
        }
    }

    // -------------------------------
    // MENU PROFESSORES
    // -------------------------------
    private void menuProfessores() {

        int opc;

        do {
            System.out.println("\n=== MENU PROFESSORES ===");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Listar Professores");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> professores.add(professorService.cadastrarProfessorUI(sc));
                case 2 -> listarProfessores();
                case 0 -> {}
                default -> System.out.println("Opção inválida!");
            }
        } while (opc != 0);
    }

    private void listarProfessores() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
            return;
        }

        System.out.println("\n=== LISTA DE PROFESSORES ===");
        for (Professor p : professores) {
            System.out.println("- " + p.nome + " (Registro: " + p.registro + ")");
        }
    }

    // -------------------------------
    // MENU CURSOS
    // -------------------------------
    private void menuCursos() {

        int opc;

        do {
            System.out.println("\n=== MENU CURSOS ===");
            System.out.println("1. Cadastrar Curso");
            System.out.println("2. Listar Cursos");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> cursos.add(cursoService.cadastrarCursoUI(sc));
                case 2 -> listarCursos();
                case 0 -> {}
                default -> System.out.println("Opção inválida!");
            }

        } while (opc != 0);
    }

    private void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado.");
            return;
        }

        System.out.println("\n=== LISTA DE CURSOS ===");
        for (Curso c : cursos) {
            System.out.println("- " + c.nome + " (Código: " + c.codigo + ")");
        }
    }

    // -------------------------------
    // MENU TURMAS
    // -------------------------------
    private void menuTurmas() {

        int opc;

        do {
            System.out.println("\n=== MENU TURMAS ===");
            System.out.println("1. Criar Turma");
            System.out.println("2. Adicionar Aluno à Turma");
            System.out.println("3. Definir Professor");
            System.out.println("4. Registrar Avaliação");
            System.out.println("5. Listar Turmas");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> turmas.add(turmaService.criarTurmaUI(sc, cursoService));
                case 2 -> adicionarAlunoTurma();
                case 3 -> definirProfessorTurma();
                case 4 -> registrarAvaliacaoTurma();
                case 5 -> listarTurmas();
                case 0 -> {}
                default -> System.out.println("Opção inválida!");
            }

        } while (opc != 0);
    }

    private void adicionarAlunoTurma() {
        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
            return;
        }
        System.out.println("Escolha a turma:");
        listarTurmas();
        int idx = sc.nextInt();
        sc.nextLine();

        turmaService.adicionarAlunoUI(sc, turmas.get(idx), alunoService);
    }

    private void definirProfessorTurma() {
        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
            return;
        }
        System.out.println("Escolha a turma:");
        listarTurmas();
        int idx = sc.nextInt();
        sc.nextLine();

        turmaService.definirProfessorUI(sc, turmas.get(idx), professorService);
    }

    private void registrarAvaliacaoTurma() {
        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
            return;
        }
        System.out.println("Escolha a turma:");
        listarTurmas();
        int idx = sc.nextInt();
        sc.nextLine();

        turmaService.registrarAvaliacaoUI(sc, turmas.get(idx));
    }

    private void listarTurmas() {
        if (turmas.isEmpty()) {
            System.out.println("Nenhuma turma cadastrada.");
            return;
        }

        System.out.println("\n=== LISTA DE TURMAS ===");
        for (int i = 0; i < turmas.size(); i++) {
            Turma t = turmas.get(i);
            System.out.println(i + " - Turma " + t.codigo + " | Curso: " + (t.curso != null ? t.curso.nome : "N/A"));
        }
    }

    // -------------------------------
    // RELATÓRIOS
    // -------------------------------
    private void menuRelatorios() {

        int opc;

        do {
            System.out.println("\n=== MENU RELATÓRIOS ===");
            System.out.println("1. Relatórios de Usuários (Alunos/Professores/Administradores)");
            System.out.println("2. Relatórios de Cursos");
            System.out.println("3. Relatórios de Turmas");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1 -> gerarRelatoriosUsuarios();
                case 2 -> gerarRelatoriosCursos();
                case 3 -> gerarRelatoriosTurmas();
                case 0 -> {}
                default -> System.out.println("Opção inválida!");
            }

        } while (opc != 0);
    }

    private void gerarRelatoriosUsuarios() {
        System.out.println("\n=== RELATÓRIO DE ALUNOS ===");
        alunos.forEach(Usuario::gerarRelatorio);

        System.out.println("\n=== RELATÓRIO DE PROFESSORES ===");
        professores.forEach(Usuario::gerarRelatorio);

        System.out.println("\n=== RELATÓRIO DE ADMINISTRADORES ===");
        administradores.forEach(Usuario::gerarRelatorio);
    }

    private void gerarRelatoriosCursos() {
        System.out.println("\n=== RELATÓRIO DE CURSOS ===");
        cursos.forEach(Curso::gerarRelatorio);
    }

    private void gerarRelatoriosTurmas() {
        System.out.println("\n=== RELATÓRIO DE TURMAS ===");
        for (Turma t : turmas) {
            t.mostrarResumo();
            t.mostrarAvaliacoes();
        }
    }
}

package UI;

import Service.*;
import Model.Turma;

import java.util.List;
import java.util.Scanner;

public class MenuAssociacao {

    private final AlunoService alunoService;
    private final ProfessorService professorService;
    private final CursoService cursoService;
    private final TurmaService turmaService;
    private final List<Turma> turmas; // referência à lista do MenuPrincipal
    private final Scanner sc;

    public MenuAssociacao(AlunoService alunoService,
                          ProfessorService professorService,
                          CursoService cursoService,
                          TurmaService turmaService,
                          List<Turma> turmas,
                          Scanner sc) {

        this.alunoService = alunoService;
        this.professorService = professorService;
        this.cursoService = cursoService;
        this.turmaService = turmaService;
        this.turmas = turmas;
        this.sc = sc;
    }

    public void exibir() {

        System.out.println("\n=== ASSOCIAÇÕES ===");
        System.out.println("1. Criar Turma");
        System.out.println("2. Adicionar Aluno à Turma");
        System.out.println("3. Definir Professor da Turma");
        System.out.println("0. Voltar");

        int opcao = sc.nextInt();
        sc.nextLine(); // evitar pular input

        switch (opcao) {
            case 1 -> {
                Turma t = turmaService.criarTurmaUI(sc, cursoService);
                if (t != null) turmas.add(t);
            }
            case 2 -> {
                Turma turma = turmaService.selecionarTurmaUI(sc, turmas);
                if (turma != null) turmaService.adicionarAlunoUI(sc, turma, alunoService);
            }
            case 3 -> {
                Turma turma = turmaService.selecionarTurmaUI(sc, turmas);
                if (turma != null) turmaService.definirProfessorUI(sc, turma, professorService);
            }
            case 0 -> { return; }
            default -> System.out.println("Opção inválida!");
        }
    }
}

package UI;

import Service.*;
import java.util.Scanner;

public class MenuCadastro {

    private final AlunoService alunoService;
    private final ProfessorService professorService;
    private final CursoService cursoService;
    private final Scanner sc;

    public MenuCadastro(AlunoService alunoService,
                        ProfessorService professorService,
                        CursoService cursoService,
                        Scanner sc) {
        this.alunoService = alunoService;
        this.professorService = professorService;
        this.cursoService = cursoService;
        this.sc = sc;
    }

    public void exibir() {
        System.out.println("\n=== CADASTROS ===");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Cadastrar Professor");
        System.out.println("3. Cadastrar Curso");
        System.out.println("0. Voltar");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1 -> alunoService.cadastrarAlunoUI(sc);
            case 2 -> professorService.cadastrarProfessorUI(sc);
            case 3 -> cursoService.cadastrarCursoUI(sc);
            case 0 -> { return; }
            default -> System.out.println("Opção inválida!");
        }
    }
}

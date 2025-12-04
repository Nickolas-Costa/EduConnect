package UI;

import Service.*;
import java.util.Scanner;

public class MenuAvaliacoes {

    private final AlunoService alunoService;
    private final TurmaService turmaService;
    private final Scanner sc;

    public MenuAvaliacoes(AlunoService alunoService,
                          TurmaService turmaService,
                          Scanner sc) {
        this.alunoService = alunoService;
        this.turmaService = turmaService;
        this.sc = sc;
    }

    public void exibir() {

        System.out.println("\n=== AVALIAÇÕES ===");
        System.out.println("1. Registrar avaliação de aluno");
        System.out.println("0. Voltar");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> alunoService.registrarAvaliacaoUI(sc, turmaService);
            case 0 -> { return; }
            default -> System.out.println("Opção inválida!");
        }
    }
}

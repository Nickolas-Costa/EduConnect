package UI;

import Model.Aluno;
import Model.Professor;
import Model.Curso;
import Model.Administrador;

import java.util.Scanner;

    public class MenuRelatorios {

        private Scanner sc = new Scanner(System.in);

        public void exibir(Aluno aluno, Professor professor, Curso curso, Administrador administrador) {

            int opcao = -1;

            while (opcao != 0) {
                System.out.println("=== MENU DE RELATÓRIOS ===");
                System.out.println("1 - Relatório do Aluno");
                System.out.println("2 - Relatório do Professor");
                System.out.println("3 - Relatório do Curso");
                System.out.println("4 - Relatório do Administrador");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 -> aluno.gerarRelatorio();
                    case 2 -> professor.gerarRelatorio();
                    case 3 -> curso.gerarRelatorio();
                    case 4 -> administrador.gerarRelatorio();
                    case 0 -> System.out.println("Encerrando menu...\n");
                    default -> System.out.println("Opção inválida!\n");
                }
            }
        }
    }

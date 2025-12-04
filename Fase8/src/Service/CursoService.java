package Service;

import Model.Curso;
import Model.CursoEAD;
import Model.CursoPresencial;

import java.util.Scanner;

public class CursoService {

    public Curso cadastrarCursoUI(Scanner sc) {
        System.out.println("\n=== Cadastro de Curso ===");
        System.out.println("1 - Curso Presencial");
        System.out.println("2 - Curso EAD");
        System.out.print("Escolha o tipo: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        Curso curso;

        if (tipo == 1) {
            curso = new CursoPresencial();
            System.out.print("Sala de Aula: ");
            ((CursoPresencial) curso).salaAula = sc.nextLine();

        } else {
            curso = new CursoEAD();
            System.out.print("Plataforma: ");
            ((CursoEAD) curso).plataforma = sc.nextLine();
        }

        System.out.print("Nome do Curso: ");
        curso.nome = sc.nextLine();

        System.out.print("Código: ");
        curso.codigo = sc.nextInt();

        System.out.print("Carga Horária: ");
        curso.cargaHoraria = sc.nextInt();
        sc.nextLine();

        System.out.println("Curso cadastrado com sucesso!\n");
        return curso;
    }

    public void atualizarCargaHoraria(Curso curso, int novaCarga) {
        curso.cargaHoraria = novaCarga;
    }

    public void atualizarNome(Curso curso, String novoNome) {
        curso.nome = novoNome;
    }

    public void listarCursos() {
    }
}

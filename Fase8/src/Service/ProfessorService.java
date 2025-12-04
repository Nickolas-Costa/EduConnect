package Service;

import Model.Professor;

import java.util.Scanner;

public class ProfessorService {

    public Professor cadastrarProfessorUI(Scanner sc) {
        System.out.println("\n=== Cadastro de Professor ===");

        Professor prof = new Professor();

        System.out.print("Nome: ");
        prof.nome = sc.nextLine();

        System.out.print("Login: ");
        prof.login = sc.nextLine();

        System.out.print("Senha: ");
        prof.senha = sc.nextLine();

        System.out.print("Registro do Professor: ");
        prof.registro = sc.nextInt();
        sc.nextLine();

        System.out.print("Especialidade: ");
        prof.especialidade = sc.nextLine();

        System.out.println("Professor cadastrado com sucesso!\n");

        return prof;
    }

    public void alterarEspecialidade(Professor professor, String novaEspecialidade) {
        professor.especialidade = novaEspecialidade;
    }

    public void listarProfessores() {
    }
}

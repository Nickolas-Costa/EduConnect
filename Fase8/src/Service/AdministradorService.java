package Service;

import Model.Administrador;

import java.util.Scanner;

public class AdministradorService {

    public Administrador cadastrarAdministradorUI(Scanner sc) {
        System.out.println("\n=== Cadastro de Administrador ===");

        Administrador admin = new Administrador();

        System.out.print("Nome: ");
        admin.nome = sc.nextLine();

        System.out.print("Login: ");
        admin.login = sc.nextLine();

        System.out.print("Senha: ");
        admin.senha = sc.nextLine();

        System.out.print("Setor: ");
        admin.setor = sc.nextLine();

        System.out.println("Administrador cadastrado!\n");
        return admin;
    }

    public void alterarSetor(Administrador admin, String novoSetor) {
        admin.setor = novoSetor;
    }
}

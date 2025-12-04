package Model;

public class Administrador extends Usuario implements Autenticacao {
    public String setor;

    @Override
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("=== Relatório do Administrador ===");
        System.out.println("Nome: " + nome);
        System.out.println("Setor: " + setor);
        System.out.println("===============================\n");
    }
}

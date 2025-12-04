package Model;

public class Professor extends Usuario implements Autenticacao {
    public String especialidade;
    public int registro;

    @Override
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("=== Relatório do Professor ===");
        System.out.println("Nome: " + nome);
        System.out.println("Registro: " + registro);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("===============================\n");
    }
}

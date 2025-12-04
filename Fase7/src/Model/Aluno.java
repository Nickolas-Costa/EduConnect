package Model;

import java.util.ArrayList;

public class Aluno extends Usuario implements Autenticacao {
    public int matricula;
    public String curso;
    public ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    @Override
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("=== Relatório do Aluno ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);

        System.out.println("Avaliações:");
        if (avaliacoes.isEmpty()) {
            System.out.println("  Nenhuma avaliação registrada.");
        } else {
            for (Avaliacao av : avaliacoes) {
                System.out.println("  - " + av.getDescricao() + ": " + av.getNota());
            }
        }
        System.out.println("==========================\n");
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
}

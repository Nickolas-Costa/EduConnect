package Model;

public class CursoEAD extends Curso {
    public String plataforma;

    @Override
    public void gerarRelatorio() {
        System.out.println("=== Relatório Curso EAD ===");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Plataforma Virtual: " + plataforma);
        System.out.println("=========================\n");
    }
}

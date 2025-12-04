package Model;

public class CursoPresencial extends Curso {
    public String salaAula;

    @Override
    public void gerarRelatorio() {
        System.out.println("=== Relatório Curso Presencial ===");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("Sala de Aula: " + salaAula);
        System.out.println("================================\n");
    }
}

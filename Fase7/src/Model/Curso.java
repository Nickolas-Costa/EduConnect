package Model;

public class Curso {
    public String nome;
    public int codigo;
    public int cargaHoraria;

    public void gerarRelatorio() {
        System.out.println("=== Relatório do Curso ===");
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria + "h");
        System.out.println("===========================\n");
    }
}

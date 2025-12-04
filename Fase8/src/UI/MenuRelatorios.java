package UI;

import Service.AlunoService;
import Service.ProfessorService;
import Service.CursoService;
import Service.TurmaService;

public class MenuRelatorios {

    private AlunoService alunoService;
    private ProfessorService professorService;
    private CursoService cursoService;
    private TurmaService turmaService;

    public MenuRelatorios(
            AlunoService alunoService,
            ProfessorService professorService,
            CursoService cursoService,
            TurmaService turmaService
    ) {
        this.alunoService = alunoService;
        this.professorService = professorService;
        this.cursoService = cursoService;
        this.turmaService = turmaService;
    }

    public void gerarRelatoriosUsuarios() {
        System.out.println("\n===== RELATÓRIO DE USUÁRIOS =====");

        System.out.println("\n-- ALUNOS --");
        alunoService.listarAlunos();

        System.out.println("\n-- PROFESSORES --");
        professorService.listarProfessores();
    }

    public void gerarRelatoriosCursos() {
        System.out.println("\n===== RELATÓRIO DE CURSOS =====");
        cursoService.listarCursos();
    }

    public void gerarRelatoriosTurmas() {
        System.out.println("\n===== RELATÓRIO DE TURMAS =====");
        turmaService.listarTurmas();
    }
}

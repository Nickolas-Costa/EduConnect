import Model.*;
import Repository.*;
import UI.MenuRelatorios;

public class Fase7 {

    public static void main(String[] args) {

        // REPOSITORIOS
        AlunoRepository alunoRepo = new AlunoRepository();
        ProfessorRepository professorRepo = new ProfessorRepository();
        CursoRepository cursoRepo = new CursoRepository();
        AdministradorRepository adminRepo = new AdministradorRepository();
        TurmaRepository turmaRepo = new TurmaRepository();

        // CRIANDO OBJETOS

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria Clara";
        aluno1.matricula = 1001;
        aluno1.curso = "Engenharia de Software";
        aluno1.login = "maria";
        aluno1.senha = "123";

        Avaliacao av1 = new Avaliacao("Prova 1");
        av1.atribuirNota(9.5);
        aluno1.avaliacoes.add(av1);
        alunoRepo.salvar(aluno1);

        Professor professor1 = new Professor();
        professor1.nome = "Carlos Silva";
        professor1.especialidade = "POO";
        professor1.registro = 222;
        professor1.login = "carlos";
        professor1.senha = "abc";

        professorRepo.salvar(professor1);

        CursoPresencial curso1 = new CursoPresencial();
        curso1.nome = "Engenharia de Software";
        curso1.codigo = 101;
        curso1.cargaHoraria = 3600;
        curso1.salaAula = "A113 - CalArts";

        cursoRepo.salvar(curso1);

        Administrador admin1 = new Administrador();
        admin1.nome = "Edmar";
        admin1.setor = "QA";
        admin1.login = "admin";
        admin1.senha = "root";

        adminRepo.salvar(admin1);

        // TURMA
        Turma turma = new Turma();
        turma.codigo = 1;
        turma.professor = professor1;
        turma.curso = curso1;
        turma.adicionarAluno(aluno1);

        turmaRepo.salvar(turma);

        // MENU RELATORIOS
        MenuRelatorios menu = new MenuRelatorios();
        menu.exibir(aluno1, professor1, curso1, admin1);

    }
}


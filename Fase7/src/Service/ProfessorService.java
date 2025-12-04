package Service;

import Model.Professor;

public class ProfessorService {
    public void alterarEspecialidade(Professor professor, String novaEspecialidade) {
        professor.especialidade = novaEspecialidade;
    }
}

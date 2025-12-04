package Service;

import Model.Curso;

public class CursoService {
    public void atualizarCargaHoraria(Curso curso, int novaCarga) {
        curso.cargaHoraria = novaCarga;
    }

    public void atualizarNome(Curso curso, String novoNome) {
        curso.nome = novoNome;
    }
}

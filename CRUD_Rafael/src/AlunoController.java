import java.util.ArrayList;
import java.util.List;

public class AlunoController {
    private List<Aluno> alunos;

    public AlunoController() {
        alunos = new ArrayList<>();
    }

    // Adicionar um aluno
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Atualizar um aluno
    public void atualizarAluno(int ra, Aluno novoAluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getRa() == ra) {
                alunos.set(i, novoAluno);
                return;
            }
        }
    }

    // Remover um aluno
    public void removerAluno(int ra) {
        alunos.removeIf(aluno -> aluno.getRa() == ra);
    }

    // Listar todos os alunos
    public List<Aluno> listarAlunos() {
        return alunos;
    }

    // Buscar um aluno por RA
    public Aluno buscarPorRA(int ra) {
        for (Aluno aluno : alunos) {
            if (aluno.getRa() == ra) {
                return aluno;
            }
        }
        return null;
    }
}

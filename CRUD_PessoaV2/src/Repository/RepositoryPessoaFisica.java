package Repository;

import Model.Pessoa;
import Model.PessoaFisica;

import java.util.ArrayList;
import java.util.List;

public class RepositoryPessoaFisica implements IRepositoryCRUD<Pessoa> {
    private List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void adicionar(Pessoa entidade) {
        pessoas.add(entidade);
    }

    @Override
    public void remover(Pessoa entidade) {
        pessoas.remove(entidade);
    }

    @Override
    public List<Pessoa> listar() {
        return new ArrayList<>(pessoas);
    }

    @Override
    public Pessoa buscarPorNome(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }
}

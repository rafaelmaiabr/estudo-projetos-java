package Repository;

import java.util.List;

public interface IRepositoryCRUD<T> {
    void adicionar(T entidade);
    void remover(T entidade);
    List<T> listar();
    T buscarPorNome(String nome);
}

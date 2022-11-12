package ifestagio.dao;

import ifestagio.model.Endereco;
import java.util.List;

public interface EnderecoDAO {
    void salvar(Endereco endereco);
    Endereco get(long idEndereco);
    void remover(long idEndereco);
    List<Endereco>getTodos();
}

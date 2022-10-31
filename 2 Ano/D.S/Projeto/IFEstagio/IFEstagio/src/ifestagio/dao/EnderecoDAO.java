package ifestagio.dao;

import ifestagio.model.Endereco;

public interface EnderecoDAO {
    void salvar(Endereco endereco);
    Endereco get(long idEndereco);
    void remover(Endereco endereco);
}

package contas.DAO;

import contas.model.Cliente;
import java.util.List;

public interface ClienteDAO {
    List<Cliente> GetAll();
    List<Cliente> find(String query);
    void save(Cliente cliente);
    void delete(long id);
}
package ifestagio.dao;

import java.util.ArrayList;
import java.util.List;

import ifestagio.model.Endereco;

public class EnderecoDAOList implements EnderecoDAO{

    private static List<Endereco> enderecos = new ArrayList<>();
    private static long id = 0;

    @Override
    public void salvar(Endereco endereco){
        if(endereco.getId() == 0){
            id++;
            endereco.setId(id);
            enderecos.add(endereco);
        }
        else{

        }
    }

    @Override
    public Endereco get(long idEndereco){

    }

    @Override
    public void remover(Endereco endereco){
        
    }
}

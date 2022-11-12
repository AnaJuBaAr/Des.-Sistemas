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
        for(Endereco enderecoTemporario : enderecos){
            if(enderecoTemporario.getId() == idEndereco){
                return enderecoTemporario;
            }
        }
        return null;
    }

    @Override
    public void remover(long idEndereco){
        for(Endereco enderecoTemporario : enderecos){
            if(enderecoTemporario.getId() == idEndereco){
                enderecos.remove(enderecoTemporario);
            }
        }
        return;
    }
    
    @Override
    public List<Endereco> getTodos(){
        return enderecos;
    }
}

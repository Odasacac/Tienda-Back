package tienda.dao;

import org.springframework.data.repository.CrudRepository;

import tienda.modelos.ModeloCliente;

public interface IClienteDao extends CrudRepository <ModeloCliente, Long>
{

}

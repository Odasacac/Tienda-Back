package tienda.dao;

import org.springframework.data.repository.CrudRepository;

import tienda.modelos.ModeloVendedor;

public interface IClienteDao extends CrudRepository <ModeloVendedor, Long>
{

}

package tienda.dao;

import org.springframework.data.repository.CrudRepository;

import tienda.modelos.ModeloCliente;


public interface IVendedorDao extends CrudRepository <ModeloCliente, Long>
{

}

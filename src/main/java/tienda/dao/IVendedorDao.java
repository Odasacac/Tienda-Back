package tienda.dao;

import org.springframework.data.repository.CrudRepository;

import tienda.modelos.ModeloVendedor;


public interface IVendedorDao extends CrudRepository <ModeloVendedor, Long>
{

}

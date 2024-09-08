package tienda.dao;

import org.springframework.data.repository.CrudRepository;

import tienda.modelos.ModeloPedido;



public interface IPedidosDao extends CrudRepository <ModeloPedido, Long>
{

}

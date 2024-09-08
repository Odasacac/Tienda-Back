package tienda.dao;

import org.springframework.data.repository.CrudRepository;

import tienda.modelos.ModeloPedido;



public interface IPedidoDao extends CrudRepository <ModeloPedido, Long>
{

}

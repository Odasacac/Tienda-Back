package tienda.dao;

import org.springframework.data.repository.CrudRepository;

import tienda.modelos.ModeloArticulo;



public interface IArticuloDao extends CrudRepository <ModeloArticulo, Long>
{

}

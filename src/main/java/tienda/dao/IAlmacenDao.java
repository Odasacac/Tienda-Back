package tienda.dao;

import org.springframework.data.repository.CrudRepository;

import tienda.modelos.ModeloAlmacen;



public interface IAlmacenDao extends CrudRepository <ModeloAlmacen, Long>
{

}

package tienda.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import tienda.dao.IVendedorDao;
import tienda.respuestas.RespuestaVendedor;
import tienda.modelos.ModeloVendedor;

@Service
public class ServicioVendedor implements IServicioVendedor 
{
	@Autowired
	private IVendedorDao vendedorDao;

	@Override
	public ResponseEntity<RespuestaVendedor> obtenerTodosLosVendedores() 
	{
		
		RespuestaVendedor respuesta = new RespuestaVendedor();
		List <ModeloVendedor> listaVendedores = new ArrayList <>();
		
		try
		{
			listaVendedores = (List<ModeloVendedor>) vendedorDao.findAll();
			
			if (!listaVendedores.isEmpty())
			{
				respuesta.setRespuesta("Vendedores obtenidos con éxito.");
				respuesta.setVendedores(listaVendedores);
				
			}
			else
			{
				respuesta.setRespuesta("No hay vendedores que mostrar.");
				respuesta.setVendedores(null);
				
				return new ResponseEntity <RespuestaVendedor> (respuesta, HttpStatus.BAD_REQUEST);
			}
		}
		catch (Exception e)
		{
			respuesta.setRespuesta("Error al obtener todos los vendedores: " + e);
			respuesta.setVendedores(null);
			
			return new ResponseEntity <RespuestaVendedor> (respuesta, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		return new ResponseEntity <RespuestaVendedor> (respuesta, HttpStatus.OK);
	}
	
}

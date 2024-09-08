package tienda.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tienda.respuestas.RespuestaVendedor;
import tienda.servicios.IServicioVendedor;


@CrossOrigin (origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ControladorVendedor 
{
	@Autowired
	private IServicioVendedor servicioVendedor;
	
	@GetMapping("/vendedor/")
	public ResponseEntity<RespuestaVendedor> obtenerTodosLosVendedores()
	{
		return servicioVendedor.obtenerTodosLosVendedores();
	}
	

}

package tienda.servicios;
import org.springframework.http.ResponseEntity;
import tienda.respuestas.RespuestaVendedor;

public interface IServicioVendedor 
{
	public ResponseEntity<RespuestaVendedor> obtenerTodosLosVendedores ();

}

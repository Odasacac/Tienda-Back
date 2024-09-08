package tienda.respuestas;

import java.util.List;

import tienda.modelos.ModeloAlmacen;



public class RepuestaAlmacen 
{
	private String respuesta;
	private List <ModeloAlmacen> vendedores;
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public List<ModeloAlmacen> getVendedores() {
		return vendedores;
	}
	public void setVendedores(List<ModeloAlmacen> vendedores) {
		this.vendedores = vendedores;
	}

	
}

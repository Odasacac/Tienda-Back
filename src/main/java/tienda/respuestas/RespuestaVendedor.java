package tienda.respuestas;

import java.util.List;

import tienda.modelos.ModeloVendedor;



public class RespuestaVendedor 
{
	private String respuesta;
	private List <ModeloVendedor> vendedores;
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public List<ModeloVendedor> getVendedores() {
		return vendedores;
	}
	public void setVendedores(List<ModeloVendedor> vendedores) {
		this.vendedores = vendedores;
	}
	
	
}

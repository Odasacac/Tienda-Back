package tienda.respuestas;

import java.util.List;

import tienda.modelos.ModeloCliente;




public class RepuestaCliente 
{
	private String respuesta;
	private List <ModeloCliente> clientes;
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public List<ModeloCliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<ModeloCliente> clientes) {
		this.clientes = clientes;
	}
	
	

}

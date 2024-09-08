package tienda.respuestas;

import java.util.List;

import tienda.modelos.ModeloPedido;



public class RespuestaPedido 
{
	private String respuesta;
	private List <ModeloPedido> pedidos;
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public List<ModeloPedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<ModeloPedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	

	
}

package tienda.respuestas;

import java.util.List;

import tienda.modelos.ModeloArticulo;



public class RespuestaArticulo 
{
	private String respuesta;
	private List <ModeloArticulo> articulos;
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public List<ModeloArticulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<ModeloArticulo> articulos) {
		this.articulos = articulos;
	}


	
}

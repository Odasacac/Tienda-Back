package tienda.modelos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="vendedores")
public class ModeloVendedor implements Serializable
{

	private static final long serialVersionUID = -1211083377896427184L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String codigoUsuario;
	private String contrasenyaEncriptada;
	private String correo;
	private LocalDateTime fechaCreacion;
	private boolean esAdmin;
	
	@OneToMany(mappedBy = "vendedorDelPedido")
	private List <ModeloPedidos> pedidosVendedor= new ArrayList <>();
	
	
	
	
	
	//--------------G&S-----------------
	
	
	
	
	
	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getContrasenyaEncriptada() {
		return contrasenyaEncriptada;
	}

	public void setContrasenyaEncriptada(String contrasenyaEncriptada) {
		this.contrasenyaEncriptada = contrasenyaEncriptada;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public boolean isEsAdmin() {
		return esAdmin;
	}

	public void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}

	public List<ModeloPedidos> getPedidosVendedor() {
		return pedidosVendedor;
	}

	public void setPedidosVendedor(List<ModeloPedidos> pedidosVendedor) {
		this.pedidosVendedor = pedidosVendedor;
	}
	
	
}

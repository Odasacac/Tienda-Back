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
@Table(name="clientes")
public class ModeloCliente implements Serializable
{


	private static final long serialVersionUID = 8256581880669245599L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String numeroTelefono;
	private String direccion;
	private String contrasenyaEncriptada;
	private String correo;
	private LocalDateTime fechaCreacion;
	
	@OneToMany(mappedBy = "clienteDelPedido")
	private List <ModeloPedido> pedidosCliente= new ArrayList <>();
	
	
	
	
	
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

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public List<ModeloPedido> getPedidosCliente() {
		return pedidosCliente;
	}

	public void setPedidosCliente(List<ModeloPedido> pedidosCliente) {
		this.pedidosCliente = pedidosCliente;
	}
	
	

	

}

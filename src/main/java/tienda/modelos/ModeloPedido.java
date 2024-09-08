package tienda.modelos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidos")
public class ModeloPedido implements Serializable
{
	private static final long serialVersionUID = 5714290238688162890L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	private LocalDateTime fechaVenta;
	
	private float importeTotal;
	
	@ManyToOne
	@JoinColumn(name = "clienteId")
	private ModeloCliente clienteDelPedido;
	
	@ManyToOne
	@JoinColumn(name = "vendedorId")
	private ModeloVendedor vendedorDelPedido;
	
	@ManyToMany(mappedBy = "pedidosArticulo")
	private List <ModeloArticulo> articulosPedido= new ArrayList <>();
	
	private boolean aDomicilio;
	
	
	
	
	
	//--------------G&S-----------------
	
	
	
	
	
	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public float getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(float importeTotal) {
		this.importeTotal = importeTotal;
	}

	public ModeloCliente getClienteDelPedido() {
		return clienteDelPedido;
	}

	public void setClienteDelPedido(ModeloCliente clienteDelPedido) {
		this.clienteDelPedido = clienteDelPedido;
	}

	public ModeloVendedor getVendedorDelPedido() {
		return vendedorDelPedido;
	}

	public void setVendedorDelPedido(ModeloVendedor vendedorDelPedido) {
		this.vendedorDelPedido = vendedorDelPedido;
	}

	public List<ModeloArticulo> getArticulosPedido() {
		return articulosPedido;
	}

	public void setArticulosPedido(List<ModeloArticulo> articulosPedido) {
		this.articulosPedido = articulosPedido;
	}

	public boolean isaDomicilio() {
		return aDomicilio;
	}

	public void setaDomicilio(boolean aDomicilio) {
		this.aDomicilio = aDomicilio;
	}
	
	
	
}

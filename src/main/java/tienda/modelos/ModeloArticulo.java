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
@Table(name="articulos")
public class ModeloArticulo implements Serializable
{

	private static final long serialVersionUID = 2697102979195650264L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private LocalDateTime fechaAlta;
	private LocalDateTime fechaBaja;
	
	private float importe;
	
	private String codigoArticulo;
	private String descripcionArticulo;
	
	@ManyToMany
	private List <ModeloPedido> pedidosArticulo= new ArrayList <>();
	
	@ManyToOne
	@JoinColumn(name = "almacenId")
	private ModeloAlmacen almacenArticulo;
	
	
	
	
	
	//--------------G&S-----------------
	
	
	
	
	
	
	
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public LocalDateTime getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(LocalDateTime fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getCodigoArticulo() {
		return codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getDescripcionArticulo() {
		return descripcionArticulo;
	}

	public void setDescripcionArticulo(String descripcionArticulo) {
		this.descripcionArticulo = descripcionArticulo;
	}

	public List<ModeloPedido> getPedidosArticulo() {
		return pedidosArticulo;
	}

	public void setPedidosArticulo(List<ModeloPedido> pedidosArticulo) {
		this.pedidosArticulo = pedidosArticulo;
	}

	public ModeloAlmacen getAlmacenArticulo() {
		return almacenArticulo;
	}

	public void setAlmacenArticulo(ModeloAlmacen almacenArticulo) {
		this.almacenArticulo = almacenArticulo;
	}
	

}

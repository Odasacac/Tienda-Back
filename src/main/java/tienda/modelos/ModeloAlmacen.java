package tienda.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="almacenes")
public class ModeloAlmacen implements Serializable
{

	private static final long serialVersionUID = -5199060101289404729L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	
	@OneToMany(mappedBy = "almacenArticulo")
	private List <ModeloArticulos> articulosEnAlmacen = new ArrayList <>();
	
	
	
	
	
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

	public List<ModeloArticulos> getArticulosEnAlmacen() {
		return articulosEnAlmacen;
	}

	public void setArticulosEnAlmacen(List<ModeloArticulos> articulosEnAlmacen) {
		this.articulosEnAlmacen = articulosEnAlmacen;
	}
	
	
	
}

package tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TercerProyectoTiendaRopaApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(TercerProyectoTiendaRopaApplication.class, args);
	}
}


/*

----CONSIDERACIONES TABLAS RELACIONALES----

1 - Relacion ManyToOne <-> OneToMany

	Son complementarias, es decir si un campo de una tabla es ManyToOne hacia el campo de otra tabla, ese campo de esa otra tabla será OneToMany hacia el campo de la primera tabla, es decir:	
	
	Tabla A, Campo 3, tiene una relacion ManyToOne hacia el Campo 5 de la Tabla B
	
	Por tanto
	
	Tabla B, Campo 5, tendra una relacion OneToMany hacia el Campo 3 de la Tabla A
	
	
	Ejemplo:
	
		Tabla Proyectos, campo jefeDelProyectoId en relacion con Tabla Usuarios, campo proyectosQueLlevaElUsuario.
		
		Desde el punto de vista de Proyecto:
		
			Un Proyecto solo puede ser llevado por un Usuario, pero un Usuario puede llevar varios Proyectos.			
			Por lo que es una relacion de ManyToOne, vamos desde muchos (Proyectos) hacia uno (Usuario)
			
		Desde el punto de vista del Usuario:
		
			Un Usuario puede llevar varios Proyectos, pero un Proyecto solo puede ser llevado por un Usuario.			
			Por lo que es una relacion de OneToMany, vamos desde uno (Usuario) hacia muchos (Proyectos)
			 
	1.1 - Anotaciones en los atributos de las clases
		
		1.1.1 - Relacion ManyToOne
		
			@ManyToOne: para indicar la relacion.
			@JoinColumn(name = "nombreNuevaColumna"): para indicar el nombre de la columna que se crea en la tabla y con la que se relacionara.
			private NombreDeLaClase nombreDelAtributo;
			
		1.1.2 - Relacion OneToMany
		
			@OneToMany(mappedBy = "nombreDelAtributoDeLaOtraClase")
			private List <NombreDeLaClase> nombreDelAtributo;
			
			Sera una lista porque seran muchas.
		
		1.1.3 - Ejemplo
			
			En la clase ProyectoModelo:
			
				@ManyToOne
				@JoinColumn(name = "jefeProyectoId")
				private UsuarioModelo jefeProyecto;
			
			En la clase UsuarioModelo:
			
				@OneToMany(mappedBy="jefeProyecto")	
				private List <ProyectoModelo> proyectosQueLlevaElUsuario;
	
2 - Relacion ManyToMany

	Por ejemplo, la relacion entre el campo usuariosDelProyecto de la tabla Proyectos y el campo proyectosDelUsuario de la tabla Usuarios.
	
	Un Proyecto puede tener varios Usuarios y un Usuario puede estar en varios Proyectos, por lo que es una relacion de ManyToMany.
	
	2.1 - Anotaciones en los atributos de las clases
	
		Primero indicar la relacion con @ManyToMany
		
		Y luego la idea es generar una tabla intermedia que conecte las dos tablas principales, eso se hace con @JoinTable solo en uno de los atributos
		
		@JoinTable
		(
			name = "NombreDeLaNuevaTabla", <- Este sera el nombre de la tabla intermedia
			joinColumns = @JoinColumn(name = "NombreColumnaEntidadActual"), <- Define la columna en la tabla intermedia que se refiere a la entidad actual
			inverseJoinColumns = @JoinColumn(name = "NombreColumnaEntidadRelacionada") <-Define la columna en la tabla intermedia que se refiere a la entidad relacionada
		)
		private List <NombreDeLaClase> nombreDelAtributo;
		
		Luego, en el otro atributo, solo hay que indicar @ManyToMany(mappedBy="atributoDeLaOtraClase") y listo.		
			
	2.2 - Ejemplo
	
		En la clase ProyectoModelo:
		
			@ManyToMany //Un Proyecto tiene varios Usuarios y un Usuarios pueden estar en varios Proyectos, por lo que es una relacion de ManyToMany
			@JoinTable
			(
				name = "proyecto_usuario", // Nombre de la tabla intermedia
				joinColumns = @JoinColumn(name = "proyectoId"), // Columna en la tabla Proyectos
				inverseJoinColumns = @JoinColumn(name = "usuarioId") // Columna en la tabla Usuarios
			)	
			private List <UsuarioModelo> usuariosDelProyecto;

		En la clase UsuarioModelo:
		
			@ManyToMany(mappedBy = "usuariosDelProyecto")
			private List <ProyectoModelo> proyectosDelUsuario;
			
	2.3 - Simplificaciones
	
		No hace falta el @JoinTable realmente si no se va a personalizar nada, solo con el @ManyToMany valdria, es decir:
		
		En la clase ProyectoModelo:
		
			@ManyToMany
			private List <UsuarioModelo> usuariosDelProyecto;

		En la clase UsuarioModelo:
		
			@ManyToMany(mappedBy = "usuariosDelProyecto")
			private List <ProyectoModelo> proyectosDelUsuario;
	
	
	
*/

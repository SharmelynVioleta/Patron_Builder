package ejemploSencillo;

public class Usuario {
	private final int id;  
	private final String nombre ;
	private final String apellido;  
	private final int edad;  
	private final int telefono;  
	private final String direccion; 
	
	private Usuario (UsuarioBuilder builder) {
		this.id = builder.id;
		this.nombre = builder.nombre;
		this.apellido = builder.apellido;
		this.edad = builder.edad;
		this.telefono = builder.telefono;
		this.direccion = builder.direccion; 
	}
	public int getId () {
		return id; 
	}	
	public String getNombre () {
		return nombre; 
	}	
	public String getApellido () {
		return apellido; 
	}	
	public int getEdad () {
		return edad;
	}
	public int getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	@Override 
	public String toString () {
		return "User: " + this.id + " , " + this.nombre+ " , " + 
		this.apellido + " , " + this.edad + " , " + this.telefono + " , " + this.direccion;
	}
	
	
	public static class UsuarioBuilder{
		private final int id;  //not null
		private final String nombre;  
		private final String apellido;  
		private  int edad; //opcional (null)
		private  int telefono;  
		private  String direccion;  
	
		public UsuarioBuilder(int id, String nombre, String apellido) {
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
		}
		public UsuarioBuilder edad(int edad) {
			this.edad = edad;
			return this;
		}
		public UsuarioBuilder telefono(int telefono) {
			this.telefono = telefono;
			return this;
		}
		public UsuarioBuilder direccion(String direccion) {
			this.direccion = direccion;
			return this;
		}
		//Retorna el constructor final del objeto Usuario
		public Usuario build() {
			Usuario usuario =  new Usuario(this);  
			return usuario;
		}
	} 
}

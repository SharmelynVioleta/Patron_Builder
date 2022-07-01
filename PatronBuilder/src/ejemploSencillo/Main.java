package ejemploSencillo;

public  class Main {
	public static void main(String[] args) 
	{
		Usuario usuario = new Usuario.UsuarioBuilder((1),  ("Juana"), ("Sanz"))
		.edad(15)
		.telefono(951265879)
		.direccion("Av. Garcilazo de la Vega 124")
		.build();

		System.out.println(usuario);

		Usuario usuario2 = new Usuario.UsuarioBuilder(2,"Javier", "Vera")
		.telefono(980242581)
		.edad(40)
		//no direccion
		.build();

		System.out.println(usuario2);

		Usuario usuario3 = new Usuario.UsuarioBuilder(3,"Ivonne", "Campos")
		//No edad
		//No telefono
		//no direccion
		.build();

		System.out.println(usuario3);	
	}
}


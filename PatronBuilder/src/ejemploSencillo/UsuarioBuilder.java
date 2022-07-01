package ejemploSencillo;

public  class UsuarioBuilder {
	public static void main(String[] args) 
	{
		Usuario usuario = new Usuario.UsuarioBuilder((1),  ("Juana"), ("Sanz"))
		.edad(15)
		.telefono(951265879)
		.direccion("Av. Garcilazo de la Vega 124")
		.build();

		System.out.println(usuario);

		Usuario usuario2 = new Usuario.UsuarioBuilder(2,"Javier", "Vera")
		.edad(40)
		.telefono(980242581)
		//no direccion
		.build();

		System.out.println(usuario2);

		Usuario usuario3 = new Usuario.UsuarioBuilder(3,"Ivonne", "Campos")
		//No edad
		//No telefono
		//no direccion
	//	.telefono(951265879)
	//	.edad(15)
		.build();

		System.out.println(usuario3);
		
		
		//una variable final de referencia
        final StringBuilder cadena=new StringBuilder("Java");
        System.out.println(cadena);
        //cambiando estado interno de referencia del objeto
        //por variable de referencia final 'cadena'
        cadena.append("desdeCero");
        System.out.println(cadena);
		
		
		
		
	}
}


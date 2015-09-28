class Alumno {
	
//ATRIBUTOS
	private int clave;
	private String nom;	
	//private String genero;	
	private Calificaciones calif;
	private Carrera carr;
	private Genero genero;
//CONSTRUCTORES
	public Alumno(){
		calif = new Calificaciones(); //se crea el objeto
		carr = new Carrera();
		genero = new Genero(); 
	}
	
//METODOS
	public void CapturaAlumno(){
		System.out.println("Captura de Datos Personales:\n");
		LeeClave();
		LeeNom();
		//LeeGenero();
		genero.ElegirGenero();
		carr.ElegirCarrera();
		calif.CapturaCalificaciones();
	}
	
	public void LeeClave(){
		clave = Teclado.LeeEntero("# de cuenta: ");
	}

	public void LeeNom(){
		nom = Teclado.LeeCadena("Nombre: ");
	}

	/*public void LeeGenero(){
		genero = Teclado.LeeCadena("Genero: ");
	}*/

	public void Listar(){
        System.out.print("\nCta: "+clave+"\t"+nom);
        genero.Listar();
        calif.Listar();
    }
	
	public void Actualizar(){
		int opcion;
		Menu menu = new Menu();
		
		do{
			opcion = menu.ListaMenu("1)Nombre\n2)Genero\n3)Calificaciones\n4)Salir\nOpcion: ",4);
		   	switch (opcion) {
				case 1:
					LeeNom();
				break;

				case 2:
				 	//LeeGenero();
				break;

				case 3:
					calif.Actualizar();
				break;
			}
		} while (opcion !=4);
	}

	public int GetClave(){
		return clave;
	}

	public Genero GetGenero(){
		return genero;
	}

	public Calificaciones GetPromedio(){
		return calif;
	}

	public Carrera GetCarrera(){
		return carr;
	}	

}
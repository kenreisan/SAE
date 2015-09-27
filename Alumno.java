class Alumno {
	
//ATRIBUTOS
	private int clave;
	private String nom;	
	private String genero;	
	private Calificaciones calif;
	private Carrera carr;
	
//CONSTRUCTORES
	public Alumno(){
		calif = new Calificaciones(); //se crea el objeto 
		carr = new Carrera();
	}
	
//METODOS
	public void CapturaAlumno(){
		System.out.println("Captura de Datos Personales:\n");
		LeeClave();
		LeeNom();
		LeeGenero();
		carr.ElegirCarrera();
		calif.CapturaCalificaciones();
	}
	
	public void LeeClave(){
		clave = Teclado.LeeEntero("# de cuenta: ");
	}

	public void LeeNom(){
		nom = Teclado.LeeCadena("Nombre: ");
	}

	public void LeeGenero(){
		genero = Teclado.LeeCadena("Genero: ");
	}

	public void Listar(){
        System.out.print(clave+"\t"+nom+"\t"+genero+"\t");
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
				 	LeeGenero();
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
}
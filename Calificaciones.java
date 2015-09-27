class Calificaciones {

//ATRIBUTOS
      private int calculo;
      private int geometria;
      private int algebra;
      private int progra;	
   
//CONSTRUCTORES

//METODOS
       public void CapturaCalificaciones() {
         System.out.println("\nCaptura de Calificaciones:\n");
         LeeCalculo();
         LeeGeometria();
         LeeAlgebra();
         LeeProgra();
      }	

      public void LeeCalculo() {
         calculo = Teclado.LeeEntero("Calculo: ");
      }

      public void LeeGeometria() {
         geometria = Teclado.LeeEntero("Geometria: ");
      }

      public void LeeAlgebra() {
         algebra = Teclado.LeeEntero("Algebra: ");
      }

      public void LeeProgra() {
         progra = Teclado.LeeEntero("Progamacion Avanzada: ");
      }

	public void Listar() {		
		System.out.println(calculo+",\n "+geometria+",\n "+algebra+",\n "+progra);
	}

	public void Actualizar() {
		int opcion;
		Menu menu = new Menu();//creo el objeto menu
		do {
			opcion = menu.ListaMenu("1)Calculo\n2)Geometria\n3)Algebra\n4)Prog. Avanzada\n5)Salir\nOpcion: ",5);
		   switch (opcion) {
				case 1:
               LeeCalculo();
				break;

				case 2:
               LeeGeometria();
				break;

				case 3:
               LeeAlgebra();
				break;
				
            case 4:
               LeeProgra();
				break;
			}
		} while (opcion != 5);
	}
}
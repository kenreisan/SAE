class Calificaciones {

//ATRIBUTOS
      private int calculo;
      private int geometria;
      private int algebra;
      private int estatica; 
   
//CONSTRUCTORES

//METODOS
       public void CapturaCalificaciones() {
         System.out.println("\nCaptura de Calificaciones:\n");
         LeeCalculo();
         LeeGeometria();
         LeeAlgebra();
         LeeEstatica();
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

      public void LeeEstatica() {
         estatica = Teclado.LeeEntero("Estatica: ");
      }

 public void Listar() {  
  System.out.println("\nCalificaciones: \n"+
         "Calculo:\t"+calculo+"\nGeometria:\t"+geometria+"\nAlgebra:\t"+algebra+"\nEstatica:\t"+estatica);
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
               LeeEstatica();
    break;
   }
  } while (opcion != 5);
 }
}
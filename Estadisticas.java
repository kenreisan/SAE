class Estadisticas{
    
    //ATRIBUTOS
    private ArregloAlumno obj;

    //CONSTRUCTORES
    public Estadisticas(ArregloAlumno a){
        obj=a;
    }

    //METODOS
    public void CalcularEstadisticas(){
        //...menu y los case}
        ContarHumanos();

    }

    public void ContarHumanos(){
        int totalhombres=0;
        int totalmujeres=0;
        int i, indice;

        indice=obj.GetIndice();
        for(i=0; i<=indice; i++){
            if (obj.GetAlumno(i).GetGenero().GetClave()==1){
                totalhombres=totalhombres+1;}
            else{
                totalmujeres=totalmujeres+1;
            }
        }
        System.out.println("\nTotal de hombres en sistema: "+totalhombres+
            "\nTotal de mujeres en sistema: "+totalmujeres);
    }
}
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
        TotalProm();
        PromArribaAbajo();
        AlumnosxCarrera();


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

    public void PromArribaAbajo(){
        int alumarriba=0;
        int alumabajo=0;
        int i, indice;

        indice=obj.GetIndice();
        for(i=0; i<=indice; i++){
            if (obj.GetAlumno(i).GetPromedio().GetProm()>TotalProm()){
                alumarriba++;}
            else{
                alumabajo++;
            }
        }
        System.out.println("\nAlumnos arriba del promedio gral.: "+alumarriba+
            "\nAlumnos debajo del promedio gral.: "+alumabajo);
    }

       public float TotalProm(){ //promedio total de los alumnos
        
        float totalprom, sumaprom=0.0f;
        int i, indice;
        indice=obj.GetIndice();

        for(i=0; i<=indice; i++){
            sumaprom = (obj.GetAlumno(i).GetPromedio().GetProm())+sumaprom;
        }

        totalprom = sumaprom/i;
            System.out.println("\nEl promedio total es: " + totalprom);
            return totalprom;
    }

    public void AlumnosxCarrera(){
        int compu=0, civil=0, petro=0;
        int i, indice;
        
        indice=obj.GetIndice();
        for(i=0; i<=indice; i++){
            if (obj.GetAlumno(i).GetCarrera().GetClave()==1000)
                compu++;
            if (obj.GetAlumno(i).GetCarrera().GetClave()==2000)
                civil++;
            if (obj.GetAlumno(i).GetCarrera().GetClave()==3000)
                petro++; 
            
        }
        System.out.println("\nAlumnos en Computacion: " + compu+
            "\nAlumnos en Ing. Civil: "+civil+
            "\nAlumnos en Ing. Petrolera: "+petro);
    }
}

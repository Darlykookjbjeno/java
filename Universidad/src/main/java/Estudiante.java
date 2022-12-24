


public class Estudiante extends Persona{
    
    //Atributos
    
    private String programa;
    

    //Constructor por defecto
    public Estudiante(){
        super("Nuevo Estudiante","");
        this.programa="Automatica";
    }
    
    //Constructor parametrizado
    public Estudiante(String Nombre, String Apellidos, String Carrera)
    {
        super(Nombre,Apellidos);
        this.programa=Carrera;
    }
    
    public Estudiante(String Nombre, String Apellidos)
    {
        super(Nombre,Apellidos);
        this.programa="Automatica";
    }
    
    public Estudiante(String Nombre, String Apellidos, String Carrera, String FechaNacimiento)
    {
        super(Nombre, Apellidos, FechaNacimiento);
        this.programa=Carrera;
    }
    
    public String presentacionPersonal()
    {
        String discurso="";
        
        discurso = "Hola me llamo "+super.getNombres()+" "+super.getApellidos();
        discurso += "\nEstudio "+this.programa;
        discurso += "\nActualmente tengo "+getEdad();
        
        return discurso;
    }    
    
    
    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    
}
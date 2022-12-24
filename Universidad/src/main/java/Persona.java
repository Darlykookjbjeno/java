
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Persona {
    private String nombres;
    private String apellidos;
    private String documento;//Documento de identificación del estudiante. 
    private long edad;
    
    public Persona(String Nombre, String Apellido)
    {
        this.nombres=Nombre;
        this.apellidos=Apellido;
    }
    
    public Persona(String Nombre, String Apellidos, String FechaNacimiento)
    {
        this.nombres=Nombre;
        this.apellidos=Apellidos;
               
        CalcularEdad(FechaNacimiento);
    }
    
    //Metdodo que calcula la edad a partir de un String que debe estar en formato dia-mes-año
    private void CalcularEdad(String fechaNacimiento){
        try{
            LocalDate fNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("d-M-yyyy"));
            this.edad=ChronoUnit.YEARS.between(fNacimiento, LocalDate.now());
        }catch (DateTimeParseException e) {
            this.edad=0;
            throw e;
            //System.out.println("La edad no se pudo calcular, debido al error: "+e.toString());
        }
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }



    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }
    
}
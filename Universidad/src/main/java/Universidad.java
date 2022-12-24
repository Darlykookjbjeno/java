

import java.time.format.DateTimeParseException;

public class Universidad {

    public static void main(String[] args) {
          
        
          try{
            Estudiante E1= new Estudiante("JULIAN", "GIL", "ING. SISTEMAS", "23-02-2020");
            System.out.println(E1.presentacionPersonal());
          }catch(DateTimeParseException  e)
          {
              System.out.println("Fecha con formato incorrecto. ");
          }
          
          Estudiante E0= new Estudiante();
          System.out.println(E0.presentacionPersonal());
          //
    }
    
}
package tecnicasdeprogramacion;

public class Principal extends MetodosSteve{

    public static void main(String[] args) {
    
        Persona persona1 = new Persona("Juana");
        
        imprimir (""+persona1.getName());
        
       persona1.verificarNombre("juan");
       imprimir (""+persona1.getName());
       
       int nameok;
       nameok= persona1.nombreCorrecto("ju5n");
       imprimir (nameok);
     
       
       
    }
    
   
}

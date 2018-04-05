package tecnicasdeprogramacion;

public class Principal extends MetodosSteve{

    public static void main(String[] args) {
    
        Persona persona1 = new Persona("agustin");
        Mascota mascota1 = new Mascota("Odin","Perro");
        
        persona1.setMascota(mascota1);
        
        persona1.pasearMascota();
        persona1.sentadoMascota();
       
       
    }
    
   
}

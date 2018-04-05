package tecnicasdeprogramacion;

import java.util.Random;

public class Principal extends MetodosSteve{

    public static void main(String[] args) {
    
        Persona persona1 = new Persona("Agustin");
        Mascota mascota1 = new Mascota("Odin","Perro");
        Persona persona2 = new Persona("Federico");
        
        Random rand = new Random();
        int numElegido = rand.nextInt(50)+1;
        boolean winner  = true;
        int intentos = 0;
       persona1.setMascota(mascota1);
       //persona1.pasearMascota();
       persona1.sentadoMascota();
        
        
        /*imprimir("El numero a adivinar es: "+numElegido);
        imprimir (persona1.getName()+" y "+ persona2.getName()+" tienen que adivinar el numero");
        imprimir ("Eligan un numero entre 0 y 50");
        
        while(winner){
            int num1= persona1.elegirNumero(50);
            int num2= persona2.elegirNumero(50);
            imprimir("El numero de "+persona1.getName()+" es "+num1);
            imprimir("El numero de "+persona2.getName()+" es "+num2);
            if(num1==numElegido){
                imprimir("El ganador es: "+ persona1.getName()+"!");
                winner= false;
            }else if (num2==numElegido){
                imprimir("El ganador es: "+ persona1.getName()+"!");
                winner= false;
            }
        }*/
        
       
       
    }
    
   
}

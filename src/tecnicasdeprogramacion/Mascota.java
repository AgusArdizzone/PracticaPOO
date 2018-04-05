/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasdeprogramacion;

import java.util.Random;
import static tecnicasdeprogramacion.MetodosSteve.imprimir;

/**
 *
 * @author utku34
 */
public class Mascota extends MetodosSteve {
    
    private String nombre;
    private String animal;

    public Mascota() {
        this.animal="Perro";
        this.nombre="Toby";
    }

    public Mascota(String Nombre, String Animal) {
        this.nombre = Nombre;
        this.animal = Animal;
    }

    public String getAnimal() {
        return animal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAnimal(String Animal) {
        this.animal = Animal;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    
    public void decisionSentado(String dueno){
        Random rand = new Random();
        int aleatorio = rand.nextInt(2);
        if(aleatorio==0){
            imprimir(this.nombre+" mira a "+ dueno+" desconcertado");
        }else{
            imprimir(this.nombre+" se sento");
        }
        
    }
    
}

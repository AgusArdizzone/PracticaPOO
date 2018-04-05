/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasdeprogramacion;

import java.util.Random;

/**
 *
 * @author utku34
 */
public class Persona extends MetodosSteve {

    private String name;
    private String lastName;
    private int dni;
    private Mascota mascota;
    
    public Persona() {
    }
    
    
    public Persona(String name) {
       this.name= verificarNombre(name);
    }

    public Persona(String name, String lastName, int dni, Mascota mascota) {
        this.name =  verificarNombre(name);
        this.lastName =  verificarNombre(lastName);
        this.dni = dni;
        this.mascota = mascota;
    }
    
    //////Gets & Sets//////
    
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDni() {
        return dni;
    }

    public Mascota getMascota() {
        return mascota;
    }
    
    public void setName(String name) {
        this.name = verificarNombre(name);
    }

    public void setLastName(String lastName) {
        this.lastName = verificarNombre(lastName);
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    ////////////
    
    //////Metodos//////
    public void pasearMascota(){
        imprimir(this.name+" esta Paseando a "+getMascota().getNombre());
    }
    
    public void sentadoMascota(){
        
        imprimir (getMascota().getNombre()+", sentado!");
        getMascota().decisionSentado(this.name);
    }
    
    public int elegirNumero(int maxNum){
        Random rand = new Random();
        int numElegido = rand.nextInt(maxNum)+1;
        return numElegido;
    }
    
    
    //////OTROS//////
    private String verificarNombre(String name){
        for (int i = 0; i <name.length(); i++) {
            if(name.charAt(i)>=48 && name.charAt(i)<=57){
            name = null;
            return name;
            }
        }
        
        if (name.charAt(0)>=97 && name.charAt(0)<=122){
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        return name;
    }
        
} 

    
    


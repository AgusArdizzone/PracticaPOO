/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasdeprogramacion;

/**
 *
 * @author utku34
 */
public class Persona {

    private String name;
    private String lastName;
    private int dni;
    private String resident;
    private String profession;
    
    public Persona(String name) {
       this.name=name;
       
        
    }

    public String getName() {
        return name;
    }
    
  public void verificarNombre(String name){
      this.name=name;
            
        }
    
     public int nombreCorrecto(String name){
        int nombreok=1;
         for (int i = 0; i <name.length(); i++) {
             if(name.charAt(i)>=48 && name.charAt(i)<=57){
                 nombreok=0;
             
            
             }
             if (nombreok ==1){
                 this.name=name;
             }else{
                 this.name=null;
             }
             
         }
         
     return nombreok;    
     }
     
    }
    
    


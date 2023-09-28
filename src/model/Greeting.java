/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Iñigo Eguskiza
 * 
 * Esta clase representa un objeto Greeting que contiene un valor de saludo como una cadena.
 * El valor de saludo puede ser configurado y recibido a través de los métodos "setValue" y "getValue".
 */
public class Greeting {
   
    private String value;

     /**
     * Constructor de la clase Greeting.
     * 
     * @param hola El valor inicial del saludo.
     */
    Greeting(String hola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Obtiene el valor del saludo.
     * 
     * @return El valor del saludo como una cadena.
     */
    
    public String getValue(){
        return this.value;
    }
    
    /**
     * Establece un nuevo valor para el saludo.
     * 
     * @param value El nuevo valor del saludo a establecer.
     */
     public void setValue(String value){
        this.value = value;
    }
}

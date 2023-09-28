/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * Esta interface Model define un contrato para las clases que representan modelos en la aplicación.
 * Implementar esta interfaz requiere la implementación del método 'getGreeting'.
 * 
 * @author Iñigo Eguskiza
 * 
 */
public interface Model {

    
     /**
     * Obtiene un saludo desde el modelo y lo devuelve como una cadena.
     *
     * @return El saludo obtenido desde el modelo.
     */
    public String getGreeting();
}

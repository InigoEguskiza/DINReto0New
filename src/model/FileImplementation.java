/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Esta clase FileImplementation implementa la interface Model y se encarga de obtener un saludo desde un archivo de propiedades.
 * Utiliza la clase ResourceBundle para cargar la configuración desde el archivo "ArchivoSaludos".
 * 
 * @author Iñigo Eguskiza
 */
public class FileImplementation implements Model {

    /**
    * El método 'getGreeting' recupera el saludo desde el archivo de propiedades y lo devuelve como un String.
    *
    * @return El saludo obtenido.
    */
    public String getGreeting() {

        // Cargamos el ResourceBundle desde el archivo.properties "ArchivoSaludos"
        ResourceBundle bundle = ResourceBundle.getBundle("model.ArchivoSaludos");

        String greeting = bundle.getString("greeting");

        return greeting;
    }

}

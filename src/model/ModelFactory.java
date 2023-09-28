/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * Esta clase ModelFactory se utiliza para crear instancias de implementaciones de la interfaz Model.
 * La implementación que se crea depende de la configuración especificada en "ArchivoSaludos".
 * 
 * @author Eneko Vazquez
 */
public class ModelFactory {
    public static Model getModel(){
        
        /**
         *  El método 'getModel' es estático y devuelve una instancia de Model según la configuración.
         * Si la configuración es "bd", se crea y devuelve una instancia de ImplementationDB.
         * Si no es "bd", se crea y devuelve una instancia de FileImplementation.
         */
        String modelOptions = ResourceBundle.getBundle("model.ArchivoSaludos").getString("model");
               
        if(modelOptions.equalsIgnoreCase("bd")){
            return new ImplementationDB();
        } else {
            return new FileImplementation();
        }
       
    }

}

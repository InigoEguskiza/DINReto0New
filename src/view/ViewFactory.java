/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 * Esta clase es una factory para crear instancias de la interface View.
 * La implementación de la vista que se crea depende de la configuración de ArchivoSaludos.
 * @author Iñigo Eguskiza
 */

public class ViewFactory {
    public static View getView(){
        String modelOptions = ResourceBundle.getBundle("model.ArchivoSaludos").getString("view");
               
        if(modelOptions.equalsIgnoreCase("ventana")){
            return (View) new ViewImplementation();
        } else {
            return (View) new TextImplementation();
        }
       
    }
}


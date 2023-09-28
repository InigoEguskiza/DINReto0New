/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;

import model.Model;
import view.View;

/**
 * Esta clase Controller es responsable de controlar la lógica principal de la aplicación.
 * Su función principal es obtener un saludo del model (implementación de Model) y mostrarlo en la  (implementación de View).
 * 
 * @author Iñigo Eguskiza
 */
public class Controller {

     /**
     * Toma una instancia del modelo y una instancia de la vista como parámetros y ejecuta la lógica principal de la app.
     * 
     * @param model El modelo (implementación de Model) que proporciona el saludo.
     * @param view La vista (implementación de View) en la que se muestra el saludo.
     */
    public void run(Model model, View view) {
        // Obtiene el saludo del model y lo muestra en la view.
        view.showGreeting(model.getGreeting());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import contoller.Controller;
import model.ModelFactory;
import view.ViewFactory;

/**
 *
 * @author Iñigo Eguskiza
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Controller().run(ModelFactory.getModel(),ViewFactory.getView());
    }
    
}
//}

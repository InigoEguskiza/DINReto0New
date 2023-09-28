/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.View;

/**
 *
 * Esta clase TextImplementation implementa la interfaz View y se encarga de mostrar un saludo en texto en consola.
 * El método 'showGreeting' de esta clase muestra el saludo proporcionado como argumento en la consola.
 * 
 * @author Iñigo Eguskiza
 */
public class TextImplementation implements View {

    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

}

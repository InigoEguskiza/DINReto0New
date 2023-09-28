/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iñigo
 */
public class GreetingTest {
    
    public GreetingTest() {
    }

    /**
     * Test of getValue method, of class Greeting.
     */
    @Test
    public void testGetValue() {
    }

    /**
     * Test of setValue method, of class Greeting.
     */
    @Test
    public void testSetValue() {
    }
    
    @Test
    public void testGreeting(){
        //Greeting greeting = new Greeting();
        //assertNotNull("El objeto Greeting no debe ser nulo", greeting);
    }
    
    public void testSetter(){
        Greeting greeting = new Greeting("Hola");
        assertEquals("Error", "My message", greeting.getValue());
        
    }
    
}

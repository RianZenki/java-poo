/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Nacazato
 */
public class Pinguim extends Ave {
    
    @Override
    public void alimentar() {
        System.out.println("Comendo peixes");
    }
    
    @Override
    public void locomover() {
        System.out.println("Andando");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Nacazato
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto();
        
        c.ligar();
        c.maisVolume();
        c.maisVolume();        
        c.maisVolume();
        c.menosVolume();
        c.ligarMudo();
        c.desligarMudo();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();

        c.play();
        c.abriMenu();
        c.fecharMenu();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Nacazato
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        m.setPeso(20.5f);
        m.setCorPelo("Marrom");
        m.emitirSom();
        l.emitirSom();
        c.emitirSom();

        System.out.println("");
        
        // Testando a sobrecarga
        c.reagir("Olá");
        c.reagir("Vai pra lá");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        

        System.out.println("");
        
        // Testando a ordem dos parametros
        c.reagir("Bob", 7);
        System.out.println(c.reagir(2, "Havel"));
        
    }
    
}

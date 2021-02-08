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
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Cobra c = new Cobra();
        Canguru ca = new Canguru();
        Cachorro k = new Cachorro();
        Arara ar = new Arara();
        Pinguim pi = new Pinguim();
        Tartaruga t = new Tartaruga();
        
        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        // Verificando o polimorfismo
        a.locomover();
        p.locomover();
        r.locomover();
        
        // Sobreescrita em Canguru
        ca.emitirSom();
        ca.locomover();
        ca.usarBolsa();
        
        k.emitirSom();
        k.locomover();
        
        a.locomover();
        ar.locomover();
        pi.locomover();
        
        a.alimentar();
        ar.alimentar();
        pi.alimentar();
        
        t.locomover();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Nacazato
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBanco cc = new ContaBanco();
        ContaBanco cp = new ContaBanco();
        
        cc.abrirConta("cc", "Maria", 1);
        System.out.println(cc.toString());
        cc.depostiar(200.0f);
        cc.sacar(150f);
        cc.pagarMensal();
        System.out.println(cc.toString());

        
        cp.abrirConta("cp", "Paulo", 2);
        System.out.println(cp.toString());
        cp.fecharConta();
        cp.sacar(200f);
        cp.pagarMensal();
        cp.sacar(130f);
        cp.fecharConta();
        System.out.println(cp.toString());
        
    }
    
}

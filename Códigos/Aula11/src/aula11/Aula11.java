/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Nacazato
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Classe abstrata não pode ser instanciada
        // Pessoa p1 = new Pessoa();
        
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(19);
        v1.setSexo("M");
        //System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Julia");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(18);
        a1.setSexo("F");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Vinicius");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade(); // Método sobreescrito
        
        Professor p1 = new Professor();
        p1.setNome("Jaime");
        p1.setIdade(56);
        p1.setSalario(1780.90f);
        p1.receberAumento();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Carla");
        t1.setMatricula(11113);
        t1.setCurso("RH");
        t1.setRegistroProfissional(2145);
        t1.setIdade(25);
        t1.praticar();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

/**
 *
 * @author Nacazato
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 5 de HTML5");
        v[2] = new Video("Aula 2 de Word");
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("paulo123", "Paulo", "M", 22);
        g[1] = new Gafanhoto("julia123", "Julia", "F", 19);
        
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(g[0].toString());
        
        g[1].ganahrExp();
        System.out.println(g[1].toString());
        
        System.out.println("========================================");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[1], v[0]); // Julia viu POO
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[0]); // Paulo viu POO
        vis[1].avaliar(10);
        System.out.println(vis[0].toString());

        System.out.println("");
        
        vis[2] = new Visualizacao(g[1], v[1]); // Julia viu HTML
        vis[2].avaliar(55.5f);
        System.out.println(vis[2].toString());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author Nacazato
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Gustavo", "M", 36);
        p[1] = new Pessoa("Maria", "F", 24);
        
        l[0] = new Livro("Aprendendo Java", "José Vitor", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 400, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 600, p[0]);
        
        l[0].abrir();
        l[0].folhear(300);
        //l[0].avancarPag();
        //l[0].folhear(1);
        l[0].fechar();
        l[0].voltarPag();
        System.out.println(l[0].detalhes());

    }
    
}

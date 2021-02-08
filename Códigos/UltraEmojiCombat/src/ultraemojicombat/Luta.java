/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author Nacazato
 */
public class Luta {
    
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }
        else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random r = new Random();
            int vencedor = r.nextInt(3);
            
            System.out.println("========= RESULTADO DA LUTA ==========");
            
            switch (vencedor) {
                case 0: // EMPATE
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("Empatou!");
                    break;
                    
                case 1: // Desafiado ganhou
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println(this.desafiado.getNome() + " venceu a luta!");

                    break;
                
                case 2: // Desafiante ganhou
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    System.out.println(this.desafiante.getNome() + " venceu a luta!");
                    break;
                 
                default:
                    System.out.println("ERRO");
            }       
        }
        else {
            System.out.println("Luta não pode acontecer");
        }
      
        System.out.println("======================================");
    }
    
    // Getters e Setters
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    
    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }
    
    public Lutador getDesafiante() {
        return this.desafiante;
    }
    
    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }
    
    public int getRounds() {
        return this.rounds;
    }
    
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    public boolean isAprovada() {
        return this.aprovada;
    }
    
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}

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
public class Cachorro extends Lobo {
    
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
    
    // Utilizando a sobrecarga
    // Assinatura de um método é diferenciado pela quantidade e tipo dos parametros.
    // Não importa o nome dos parametros e nem o tipo de retorno.
    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar e latir");
        }
        else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } 
        else if (hora >= 18) {
            System.out.println("Ignorar");
        }
        else {
            System.out.println("Abanar e latir");
        }
    }
    
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } 
        else {
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }
    }
    
    public void reagir(int idade, float peso) {
        
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } 
            else {
                System.out.println("Latir");
            }
        } 
        else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } 
            else {
                System.out.println("Ignorar");
            }
        }
    }
    
    
    // Ordem dos parametros interfere na assinatura do método
    public void reagir(String nome, int idade) {
        System.out.println("String e int como parametro");
    }
    
    public String reagir(int idade, String nome) {
        return "Int e String como parametro";
    }
    
}

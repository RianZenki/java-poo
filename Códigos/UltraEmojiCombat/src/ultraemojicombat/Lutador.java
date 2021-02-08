/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author Nacazato
 */
public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    // Construtor
    public Lutador(String no, String na, int id,float al,
                   float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;

    }

    // Métodos
    public void apresentar() {
        System.out.println("-------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + getNome());
        System.out.println("Diretamente da " + getNacionalidade());
        System.out.println("Com " + getIdade() + " anos");
        System.out.println("Medindo " + getAltura() + "m");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Com " + getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas e");
        System.out.println(getEmpates() + " empates!");
    }
    
    public void status() {
        System.out.print(getNome());
        System.out.println(" é um peso " + getCategoria());
        System.out.print("Com " + getVitorias() + " vitórias ");
        System.out.print(getDerrotas() + " derrotas e ");
        System.out.print(getEmpates() + " empates");
        System.out.println("");
    }
    
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        setEmpates(getEmpates() +1);
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    
    
}

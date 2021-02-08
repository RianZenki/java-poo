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
public class Livro implements Publicacao {
    
    //Atributos
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    
    // Métodos
    public String detalhes() {
        return "Livro{" + "\ntitulo=" + titulo + ", \nautor=" + autor + ", totPaginas=" 
                        + totPaginas + ", pagAtual=" + pagAtual + ", \naberto=" + aberto 
                        + ", \nleitor=" + leitor.getNome() + ", idade=" + leitor.getIdade()+ ", sexo=" + leitor.getSexo() + '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
        this.pagAtual = 0;
    }

    @Override
    public void fechar() {
        this.aberto = false;
        this.pagAtual = 0;
    }

    @Override
    public void folhear(int p) {
        if (this.aberto && this.totPaginas >= p) {
            this.pagAtual = p;
        }
        else {
            this.pagAtual = 0;
        }
    }

    @Override
    public void avancarPag() {
         if (this.aberto && this.pagAtual != this.totPaginas) {
            this.pagAtual++;
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto && this.pagAtual > 0) {
            this.pagAtual--;
        }
    }
    
    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}

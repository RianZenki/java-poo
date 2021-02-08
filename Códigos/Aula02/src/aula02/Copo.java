
package aula02;

public class Copo {
    
    String tipo;
    float tamanho;
    int volume;
    
    void status() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Volume: " + this.volume);
    }
    
    void encher() {
        this.volume = 10;
    }
    
    void esvaziar() {
        this.volume = 0;
    }
    
    void mover() {
        System.out.println("Moveu o copo");
    }
    
}

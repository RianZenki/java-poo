package aula04;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    // Método construtor
    public Caneta(String m, String c, float p) {
        setModelo(m);
        setCor(c);
        setPonta(p);
        this.tampar();
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public boolean getTampada() {
        return this.tampada;
    }
    
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.getTampada());
    }
    
}

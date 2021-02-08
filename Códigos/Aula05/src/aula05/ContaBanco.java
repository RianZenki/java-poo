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
public class ContaBanco {
    
    public int nunConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco() {
        this.status = false;
        this.saldo = 0f;
    }
    
    public int getNunConta() {
        return nunConta;
    }

    public void setNunConta(int nunConta) {
        this.nunConta = nunConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo, String nome, int num) {
        setStatus(true);
        setDono(nome);
        setTipo(tipo);
        setNunConta(num);
        
        if ("cc".equals(getTipo())) {
            setSaldo(50f);
        }
        else {
            setSaldo(150f);
        }
    }
    
    public void fecharConta() {
        if (isStatus()) {
            if (getSaldo() == 0) {
                setStatus(false);
            }
        }
    }
    
    public void depostiar(float valor) {
        if (isStatus() && valor > 0) {
            setSaldo(getSaldo() + valor);
        }
    }
    
    public void sacar(float valor) {
        if (isStatus() && valor <= this.saldo) {
            setSaldo(getSaldo() - valor);
        }
    }
    
    public void pagarMensal() {
        if (isStatus()) {
            if ("cc".equals(getTipo())) {
                setSaldo(getSaldo() - 12f);                
            }
            else {
                setSaldo(getSaldo() - 20f);
            }
        }
    }

    @Override
    public String toString() {
        return "ContaBanco{" + "nunConta=" + nunConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status=" + status + '}';
    }
    
}

package Model;

import java.io.Serializable;

public class Administrador implements Serializable{
    
    private String nome;
    private String senha;
    private double saldo;
    
    

    public Administrador(String nome, String senha,double saldo) {
        this.nome = nome;
        this.senha = senha;
        this.saldo=saldo;
    }
    
    public Administrador(){
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}

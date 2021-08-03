package Model;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Funcionario implements Serializable{
    
    private String nome;
    private String apelido;
    private int idade;
    private String nacionalidade;
    private double saldo;
    private double salario;
    private String senha;
    private String nivelAcademico;
    private String departamento;
    private String sexo;
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    DecimalFormat df = new DecimalFormat("###,##0.00");
    
 
   

    public Funcionario(String nome, String apelido, int idade,String cargo,String nacionalidade,double saldo, double salario, String senha, String nivelAcademico, String departamento, String sexo) {
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.saldo = saldo;
        this.salario = salario;
        this.senha = senha;
        this.nivelAcademico = nivelAcademico;
        this.departamento = departamento;
        this.sexo = sexo;
        this.cargo=cargo;
        
        
    }

    public Funcionario() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

   


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  

    @Override
    public String toString() {
        return(nome +" "+ apelido);
    }
    
}

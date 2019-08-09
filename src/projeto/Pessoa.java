/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * autor: Michael Junges
 */
public class Pessoa {
    
    private int codigo;
    private String nome;
    private String cidade;
    private String telefone;
    private double valorconta;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorconta() {
        return valorconta;
    }

    public void setValorconta(double valorconta) {
        this.valorconta = valorconta;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + "\nSaldo: " + this.valorconta  + "\n";
        /*return "Código: " + this.codigo + "\nNome: " + this.nome + "\nCidade: " 
        + this.cidade + "\nTelefone: " + this.telefone + "\n";*/  
    }
}

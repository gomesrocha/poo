/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicaSis.model;

import javax.swing.JOptionPane;

/**
 *
 * @author 10361
 */
public class Endereco {
   private String logradouro;
   private String numero;
   private String complemento;
   private String cep;
   private String bairro;
   private String cidade;
   private String uf;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
   
   public void cadastrarEndereco(){
      logradouro = JOptionPane.showInputDialog("Entre com o Endereço");
      numero = JOptionPane.showInputDialog("Entre com o numero");
      complemento = JOptionPane.showInputDialog("Entre com o Complemento");
      cep = JOptionPane.showInputDialog("Entre com o CEP");
      bairro = JOptionPane.showInputDialog("Entre com o bairro");
      cidade = JOptionPane.showInputDialog("Entre com a cidade");
      uf = JOptionPane.showInputDialog("Entre com o UF");
   }
   public String listarEndereco(){
      String dados = "\nEndereço: " + logradouro
              + "\nNumero: " + numero
              + "\nComplemento: " + complemento
              + "\nCEP: " + cep
              + "\nBairro: " + bairro
              + "\nCidade: " + cidade
              + "\nEstado: " + uf;
       return dados;
   } 
}

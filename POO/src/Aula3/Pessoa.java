/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author 10361
 */
public class Pessoa {
   protected String nome;
   protected String dtNasc;
   protected String cpf;
   protected String rg;
   protected String logradouro;
   protected String numero;
   protected String complemento;
   protected String cep;
   protected String bairro;
   protected String cidade;
   protected String uf;
   protected String email;
   protected String telefone;
   public void cadastrarPessoa(){
      nome = JOptionPane.showInputDialog("Entre com seu nome");
      dtNasc = JOptionPane.showInputDialog("Entre com a data de nascimento");
      logradouro = JOptionPane.showInputDialog("Entre com o Endereço");
      numero = JOptionPane.showInputDialog("Entre com o numero");
      complemento = JOptionPane.showInputDialog("Entre com o Complemento");
      cep = JOptionPane.showInputDialog("Entre com o CEP");
      bairro = JOptionPane.showInputDialog("Entre com o bairro");
      cidade = JOptionPane.showInputDialog("Entre com a cidade");
      uf = JOptionPane.showInputDialog("Entre com o UF");
      cpf = JOptionPane.showInputDialog("Entre com o CPF");
      while(cpf.length()!=11){
         JOptionPane.showMessageDialog(null, "CPF inválido");
         cpf = JOptionPane.showInputDialog("Entre com o CPF");
      }
      rg = JOptionPane.showInputDialog("Entre com o RG");
      email = JOptionPane.showInputDialog("Entre com o email");
      telefone = JOptionPane.showInputDialog("Entre com o celular");
   }
   
   public String listarPessoa(){
       String dados = "Nome: " + nome
              + "\nData de Nascimento: " + dtNasc
              + "\nEndereço: " + logradouro
              + "\nNumero: " + numero
              + "\nComplemento: " + complemento
              + "\nCEP: " + cep
              + "\nBairro: " + bairro
              + "\nCidade: " + cidade
              + "\nEstado: " + uf
              + "\nCPF: " + cpf
              + "\nRG: " + rg
              + "\nE-Mail: " + email
              + "\nTelefone: " + telefone;
       return dados;
   }
   
}

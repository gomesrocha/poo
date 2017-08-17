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
public class Medico {
   private String nome;
   private String crm;
   private String dtNasc;
   private String logradouro;
   private String numero;
   private String complemento;
   private String cep;
   private String bairro;
   private String cidade;
   private String uf;
   private String cpf;
   private String rg;
   private String email;
   private String telefone;
   private String celular;
   public void cadastrarMedico(){
          nome = JOptionPane.showInputDialog("Entre com seu nome");
      dtNasc = JOptionPane.showInputDialog("Entre com a data de nascimento");
      crm = JOptionPane.showInputDialog("Entre com o CRM");
      logradouro = JOptionPane.showInputDialog("Entre com o Endereço");
      numero = JOptionPane.showInputDialog("Entre com o numero");
      complemento = JOptionPane.showInputDialog("Entre com o Complemento");
      cep = JOptionPane.showInputDialog("Entre com o CEP");
      bairro = JOptionPane.showInputDialog("Entre com o bairro");
      cidade = JOptionPane.showInputDialog("Entre com a cidade");
      uf = JOptionPane.showInputDialog("Entre com o UF");
      cpf = JOptionPane.showInputDialog("Entre com o CPF");
      rg = JOptionPane.showInputDialog("Entre com o RG");
      email = JOptionPane.showInputDialog("Entre com o email");
      telefone = JOptionPane.showInputDialog("Entre com o celular");
      celular = JOptionPane.showInputDialog("Entre com o celular");
      

      
   }
   public void listarMedico(){
  
      JOptionPane.showMessageDialog(null, "Nome: " + nome
              + "\nData de Nascimento: " + dtNasc
              + "\nCRM: " + crm
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
              + "\nTelefone: " + telefone
              + "\nCelular: " + celular);
      
   }
   
}

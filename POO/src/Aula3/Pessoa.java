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
   protected Endereco endereco;
   protected String email;
   protected Telefone telefone;
   

  public Pessoa() {
      endereco = new Endereco();
      telefone = new Telefone();
   }

   
   public void cadastrarPessoa() {
      nome = JOptionPane.showInputDialog("Entre com seu nome");
      dtNasc = JOptionPane.showInputDialog("Entre com a data de nascimento");
      cpf = JOptionPane.showInputDialog("Entre com o CPF");
      while (cpf.length() != 11) {
         JOptionPane.showMessageDialog(null, "CPF inválido");
         cpf = JOptionPane.showInputDialog("Entre com o CPF");
      }
      rg = JOptionPane.showInputDialog("Entre com o RG");
      email = JOptionPane.showInputDialog("Entre com o email");
      endereco.cadastrarEndereco();
      telefone.cadastrarTelefone();
   }

   public String listarPessoa() {
      String dados = "Nome: " + nome
              + "\nData de Nascimento: " + dtNasc
              + "\nCPF: " + cpf
              + "\nRG: " + rg
              + "\nE-Mail: " + email
              + telefone.listarTelefone()
              + endereco.listarEndereco();
      return dados;
   }

}

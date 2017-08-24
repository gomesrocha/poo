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
   protected String telefone;

  public Pessoa() {
      endereco = new Endereco();
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
      telefone = JOptionPane.showInputDialog("Entre com o celular");
      endereco.cadastrarEndereco();
   }

   public String listarPessoa() {
      String dados = "Nome: " + nome
              + "\nData de Nascimento: " + dtNasc
              + "\nCPF: " + cpf
              + "\nRG: " + rg
              + "\nE-Mail: " + email
              + "\nTelefone: " + telefone
              + endereco.listarEndereco();
      return dados;
   }

}

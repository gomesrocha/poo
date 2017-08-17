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
public class Paciente {
   private String nome;
   private String dtNasc;
   private String logradouro;
   private String numero;
   private String complemento;
   private String cep;
   private String bairro;
   private String cidade;
   private String email;
   private String telefone;
   private String convenio;
   
   public void cadastrarPaciente(){
      nome = JOptionPane.showInputDialog("Entre com seu nome");
      dtNasc = JOptionPane.showInputDialog("Entre com a data de nascimento");
      logradouro = JOptionPane.showInputDialog("Entre com o Endereço");
      numero = JOptionPane.showInputDialog("Entre com o numero");
      complemento = JOptionPane.showInputDialog("Entre com o Complemento");
      cep = JOptionPane.showInputDialog("Entre com o CEP");
      bairro = JOptionPane.showInputDialog("Entre com o bairro");
      cidade = JOptionPane.showInputDialog("Entre com a cidade");
      email = JOptionPane.showInputDialog("Entre com o telefone");
      convenio = JOptionPane.showInputDialog("Entre com o convênio");
   }
   public void listarPaciente(){
      JOptionPane.showMessageDialog(null, "Nome: " + nome
              + "\nData de Nascimento: " + dtNasc
              + "\nEndereço: " + logradouro
              + "\nNumero: " + numero
              + "\nComplemento: " + complemento
              + "\nCEP: " + cep
              + "\nBairro: " + bairro
              + "\nCidade: " + cidade
              + "\nE-Mail: " + email
              + "\nConvênio: " + convenio);
   }
   
}

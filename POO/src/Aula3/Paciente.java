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
public class Paciente extends Pessoa {

   private String convenio;

   public void cadastrarPaciente() {
      super.cadastrarPessoa();
      convenio = JOptionPane.showInputDialog("Entre com o convênio");
   }

   public void listarPaciente() {
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

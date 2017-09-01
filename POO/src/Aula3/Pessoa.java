/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
      String padrao="^[_a-z0-9-\\+]+(\\.[_a-z0-9-]+)*"
      +"@[a-z0-9-]+(\\.[a-z0-9]+)*(\\.[a-z]{2,4})$";
      //"\\b[a-z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}\\b"
      Pattern emailp = Pattern.compile(padrao);
    
      Pattern datap = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
      nome = JOptionPane.showInputDialog("Entre com seu nome");
      dtNasc = JOptionPane.showInputDialog("Entre com a data de nascimento");
      Matcher datam = datap.matcher(dtNasc);
      System.out.println(datam.find());
      cpf = JOptionPane.showInputDialog("Entre com o CPF");
      while (cpf.length() != 11) {
         JOptionPane.showMessageDialog(null, "CPF inválido");
         cpf = JOptionPane.showInputDialog("Entre com o CPF");
      }
      rg = JOptionPane.showInputDialog("Entre com o RG");
      email = JOptionPane.showInputDialog("Entre com o email");
      email = email.trim().toLowerCase();
      Matcher emailm = emailp.matcher(email);
      
      while(emailm.matches()==false){
         JOptionPane.showMessageDialog(null, "Email incorreto");
         email = JOptionPane.showInputDialog("Entre com o email");
         email = email.trim().toLowerCase();
         emailm = emailp.matcher(email);
         
      }
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

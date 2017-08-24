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
public class Medico extends Pessoa{
   private String crm;
   private Telefone celular;
   private Endereco endProf;

   public Medico() {
      celular = new Telefone();
      endProf = new Endereco();
   }
   
   public void cadastrarMedico(){
      super.cadastrarPessoa();
      crm = JOptionPane.showInputDialog("Entre com o CRM");
      celular.cadastrarTelefone();
      endProf.cadastrarEndereco();
   }
   public void listarMedico(){ 
      
      JOptionPane.showMessageDialog(null, super.listarPessoa() 
              + "\nCRM: " + crm
              + celular.listarTelefone()
              + endProf.listarEndereco());
      
   }
   
}

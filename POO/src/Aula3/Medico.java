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
   private String celular;
   
   public void cadastrarMedico(){
      super.cadastrarPessoa();
      crm = JOptionPane.showInputDialog("Entre com o CRM");
      celular = JOptionPane.showInputDialog("Entre com o celular");
   }
   public void listarMedico(){ 
      
      JOptionPane.showMessageDialog(null, super.listarPessoa() 
              + "\nCRM: " + crm
              + "\nCelular: " + celular);
      
   }
   
}

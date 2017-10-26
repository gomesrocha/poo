/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicaSis.model;

import Aula3.Pessoa;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author 10361
 */
public class Paciente extends Pessoa implements Serializable{

   private String convenio;

   public void cadastrarPaciente() {
      super.cadastrarPessoa();
      convenio = JOptionPane.showInputDialog("Entre com o convênio");
   }
   public void listarPaciente() {
      JOptionPane.showMessageDialog(null, super.listarPessoa()
              + "\nConvênio: " + convenio);
   }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula3;

/**
 *
 * @author 10361
 */
public class ClinicaSys {
   
   public static void main(String[] args) {
      Paciente paciente = new Paciente();
      paciente.cadastrarPaciente();
      paciente.listarPaciente();
      Medico medico = new Medico();
      medico.cadastrarMedico();
      medico.listarMedico();
   
   }
   
   
}

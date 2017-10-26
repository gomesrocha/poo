/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicaSis.model;

import Aula3.Pessoa;
import ClinicaSis.model.Telefone;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author 10361
 */
public class Medico extends Pessoa implements Serializable{
   private String crm;
   private Telefone celular;
   private Endereco endProf;
   private double salarioBruto;
   private double inss;
   private double irrf;
   private double salarioSemInss;
   private double salarioLiquido;

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
     public void calcularSalario(int tipo) {
        if(tipo==1){        
            salarioBruto = 3225.33;
        } else if (tipo==2){
            salarioBruto = 6600.20;
        }
        if (salarioBruto <= 1556.94) {
            inss = salarioBruto / 100 * 8;
        } else if (salarioBruto > 1556.94 && salarioBruto <= 2594.92) {
            inss = salarioBruto / 100 * 9;
        } else if (salarioBruto > 2594.92 && salarioBruto <= 5189.82) {
            inss = salarioBruto / 100 * 11;
        } else if (salarioBruto > 5189.82) {
            inss = 5189.82 / 100 * 11;
        }
        salarioSemInss = salarioBruto - inss;
        if(salarioSemInss <= 1903.98){
            irrf=0;
        } else if(salarioSemInss >=1903.99 && salarioSemInss <= 2826.65){
            irrf = (salarioSemInss - 1903.99)/100 * 7.5;
        } else if(salarioSemInss > 2826.65 && salarioSemInss <= 3751.05){
            irrf = (salarioSemInss - 1903.99)/100 * 15;
        } else if(salarioSemInss > 3751.05 && salarioSemInss <= 4664.68){
            irrf = (salarioSemInss - 1903.99)/100 * 22.5;
        } else if(salarioSemInss > 4664.68){
            irrf = (salarioSemInss - 1903.99)/100 * 27.5;
        }
        salarioLiquido = salarioSemInss - irrf;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Telefone getCelular() {
        return celular;
    }

    public void setCelular(Telefone celular) {
        this.celular = celular;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getIrrf() {
        return irrf;
    }

    public void setIrrf(double irrf) {
        this.irrf = irrf;
    }

    public double getSalarioSemInss() {
        return salarioSemInss;
    }

    public void setSalarioSemInss(double salarioSemInss) {
        this.salarioSemInss = salarioSemInss;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
   
}

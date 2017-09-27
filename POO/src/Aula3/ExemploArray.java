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
public class ExemploArray {
   public static void main(String[] args) {
      double nota[][] = new double[5][2];
      String nome[] = new String[5];
      for(int i=0; i<5; i++){
         nome[i] = JOptionPane.showInputDialog(null, "Entre"
                 + " com o nome:");
         for(int m=0;m<2;m++){
 nota[i][m]=Double.parseDouble(JOptionPane.showInputDialog(null, ""
         + "Entre com a nota " + m +".:"));
         }
         double notafinal = ((nota[i][0]*4)+(nota[i][1]*6))/10;
         if(notafinal>=6){
            JOptionPane.showMessageDialog(null, "Passou, "
                    + "sua nota é " + notafinal);
         }else if(notafinal>=4 && notafinal<6){
         JOptionPane.showMessageDialog(null, "Prova final");
      } else{
              JOptionPane.showMessageDialog(null, "Reprovado");
      }
                 
      }
   }
   
}

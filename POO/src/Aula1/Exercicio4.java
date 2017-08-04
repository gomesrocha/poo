/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author 10361
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int dia, mes, ano;
        mes = cal.get(Calendar.MONTH) +1;
        dia = cal.get(Calendar.DAY_OF_MONTH);
        ano = cal.get(Calendar.YEAR);
        JOptionPane.showMessageDialog(null, "Hoje é dia " + dia + " do mês "
                + mes +  " de " + ano);
    }
    
}

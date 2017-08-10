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
        String mestexto="";
        mes = cal.get(Calendar.MONTH);
        dia = cal.get(Calendar.DAY_OF_MONTH);
        ano = cal.get(Calendar.YEAR);
        if(mes==0){
            mestexto="Janeiro";
        }else if(mes==1){
            mestexto="Fevereiro";
        }else if(mes==2){
            mestexto="Março";
        }else if(mes==3){
            mestexto="Abril";
        }else if(mes==4){
            mestexto="Maio";
        }else if(mes==5){
            mestexto="Junho";
        }else if(mes==6){
            mestexto="Julho";
        }else if(mes==7){
            mestexto="Agosto";
        }else if(mes==8){
            mestexto="Setembro";
        }else if(mes==9){
            mestexto="Outubro";
        }else if(mes==10){
            mestexto="Novembro";
        }else if(mes==11){
            mestexto="Dezembro";
        }
        JOptionPane.showMessageDialog(null, "Hoje é dia " + dia + " de "
                + mestexto +  " de " + ano);
    }
    
}

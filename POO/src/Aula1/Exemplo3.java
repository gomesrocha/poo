/*
* Materiais de aula da disciplina de Programação Orientada a Objetos
* Turma 2017.2
* Universidade Tiradentes
 */
package Aula1;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Prof. Fabio Gomes Rocha
 * @email fabio.gomes@souunit.com.br 
 */
/*
* Problema: Você deve criar um pequeno programa que solicite o nome e data de 
* nascimento e o programa deve exibir o nome e idade do da pessoa
 */
public class Exemplo3 {
	public static void main(String[] args) {
		int idade, ano, anoatual;
		String nome;
		//Cria uma chamada para Calendário para capturar o ano atual
		Calendar cal = Calendar.getInstance();
		nome = JOptionPane.showInputDialog("Qual é o seu nome");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o seu ano de nascimento?"));
		// Captura o ano atual
		anoatual = cal.get(Calendar.YEAR);
		// a idade é igual ano atual menos o ano de nascimento
		idade = anoatual-ano;
		JOptionPane.showMessageDialog(null, "Ola " + nome + " e sua idade é " + idade);
		
	}
	
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocha
 */
public class Exemplo2 {
	public static void main(String[] args) {
		//Exemplo de entrada de dados
		Scanner s = new Scanner(System.in);
		System.out.print("Entre com seu nome: ");
		//le até que o usuário pressionar enter
		String nome = s.nextLine();
		System.out.println("Seu nome é " + nome);
		System.out.println("Qual a sua idade?");
		//Lê numero inteiro
		int num = s.nextInt();
		System.out.println("Sua idade é: " + num);
		//Entrada de dados pelo modo gráfico
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
		
	}
	
}

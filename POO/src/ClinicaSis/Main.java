/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicaSis;

import ClinicaSis.view.MedicoView;

/**
 *
 * @author Prof. Fabio Gomes Rocha
 * @about Sistema de clinica médica como exemplo em sala de aula de POO
 */
public class Main {
	public static void main(String[] args) {
		MedicoView md = new MedicoView();
                md.cadastrarMedico();
                md.listarMedico();
	}
}


import ClinicaSis.model.Medico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class MedicoTeste {
   public static void main(String[] args) {
     Medico md = null;
     Medico medico[] = new Medico[30];
     for(int i=0;i<2;i++){
        md = new Medico();
        md.cadastrarMedico();
        medico[i]=md;
        
     }
     for(int l=0;l<2;l++){
        md = medico[l];
        md.listarMedico();
     }
   }
   
}

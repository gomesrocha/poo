/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClinicaSis.view;

import ClinicaSis.model.BancoDeDados;
import ClinicaSis.model.Medico;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.io.PrintStream;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class MedicoView {
    public Medico md;
    Gson gson = new Gson();
    public void cadastrarMedico(){
      md = new Medico();
      md.cadastrarMedico();
      int opc = Integer.parseInt(JOptionPane.showInputDialog("Deseja salvar? 1 = sim, 2 = não"));
      if(opc == 1){
          String medicoLista = gson.toJson(md);
          BancoDeDados.escreverArquivo(medicoLista, "ClinicaSys.txt");
      } else if(opc == 2){
          
      } else if(opc>2){
          
      }
   }
   public void listarMedico(){ 
       md = new Medico();
       List<Medico> mds = new ArrayList<Medico>();
       Type tipo = new TypeToken<List<Medico>>() {}.getType();
        for (String s : BancoDeDados.lerArquivo("ClinicaSys.txt")) {
            md = gson.fromJson(s, Medico.class);
            mds.add(md);
        }
      for(Medico m: mds){
           m.listarMedico();
      }
      
      //JOptionPane.showMessageDialog(null, super.listarPessoa() 
      //        + "\nCRM: " + crm
      //        + celular.listarTelefone()
      //        + endProf.listarEndereco());
      
   }

    private Iterable<String> ReadFile(String clinicaSystxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

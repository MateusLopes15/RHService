/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Dao;

import Java.Classes.Entrevistados;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Gesildo
 */
public class DAOEntrevistados {
    public List<Java.Classes.Entrevistados> consultar(){
        
        List<Java.Classes.Entrevistados> EntrevistadosS = new ArrayList();
        
        Entrevistados Entrevistado1 = new Entrevistados();
        Entrevistado1.setNome("Vanderlei");
        Entrevistado1.setSenha("6978");
        Entrevistado1.setCpf("018.564.475-32");
        Entrevistado1.setRg("16.897.765-75");
        Entrevistado1.setDataNasc(15-02-1987);
        Entrevistado1.setEmail("KaiVa@ifba.edu.br");
        Entrevistado1.setEndereco("Rua das Groselhas casa 7");
        Entrevistado1.settelefone(981976466);
        
        EntrevistadosS.add(Entrevistado1);
        
        return EntrevistadosS;           
        
    }

   
    
}

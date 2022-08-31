/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.Classes;
import Java.Dao.DAOEntrevistados;

import java.util.List;

/**
 *
 * @author Gesildo
 */
public class BOEntrevistados {
     public List<Java.Classes.Entrevistados> consultar(){
      
          DAOEntrevistados entrevistadosDAO = new DAOEntrevistados();
          
          List<Java.Classes.Entrevistados> EntrevistadosS =  entrevistadosDAO.consultar();
          
          return EntrevistadosS;
     }
    
}

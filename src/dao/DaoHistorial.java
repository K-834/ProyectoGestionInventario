/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Historial;
import java.util.List;

/**
 *
 * @author antho
 */
public interface DaoHistorial {

    List<Historial> userSelectHistorial(String usuario);

    String userInsertar(Historial histo);

    String getMensaje();
    
    Historial userGrafico(String Usuario);

}

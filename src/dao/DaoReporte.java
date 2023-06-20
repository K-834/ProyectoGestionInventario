/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;


import entidades.Reporte;
import java.util.List;

/**
 *
 * @author antho
 */
public interface DaoReporte {
     String getMensaje();
     
    List<Reporte> reporteSelect();
    
    String reporteInsertar(Reporte dataR);
    
    String reporteCumplido(Reporte dataR);
  
}

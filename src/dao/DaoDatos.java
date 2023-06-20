/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Producto;
import entidades.Datos;
import java.util.List;

/**
 *
 * @author antho
 */
public interface DaoDatos {
    String getMensaje();
     
    List<Datos> datosSelect();
    
    String datosEditar(Datos data);
    
    String datosInsertar(Datos data);
    
    String datosEliminar(Datos data);
    
    String datosRecuperar(Datos data);
    
    List<Datos> datosSelectEliminados();
}

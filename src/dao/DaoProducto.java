/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Producto;
import java.util.List;

/**
 *
 * @author antho
 */
public interface DaoProducto {
     String getMensaje();
    List <Producto> productoSelect();
    
    String productoditar(Producto prod);
    
    String productoInsertar(Producto prod);
    
    String productoEliminar(Producto prod);
    
    String productoRecuperar(Producto prod);
    
    List<Producto> productoSelectEliminados();
    
    String datosSelect(Producto prod);
}

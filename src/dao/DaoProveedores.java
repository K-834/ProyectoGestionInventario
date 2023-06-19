/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Proveedores;
import java.util.List;

/**
 *
 * @author Anghello
 */
public interface DaoProveedores {
    String getMensaje();
    List <Proveedores> proveedoresSelect();
    
    String proveedoresEditar(Proveedores provee);
    
    String proveedoresInsertar(Proveedores provee);
    
    String proveedoresEliminar(Proveedores provee);
    
    String proveedoresRecuperar(Proveedores provee);
    
    List<Proveedores> proveedoresSelectEliminados();
    
}

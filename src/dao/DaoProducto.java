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
    String datosSelect(Producto prod);
    String getMensaje();
}

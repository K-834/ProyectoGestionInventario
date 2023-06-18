/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.DaoProducto;
import entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.Conexion;

/**
 *
 * @author antho
 */
public class DaoImplProducto implements DaoProducto {

    private final Conexion conexion;
     private String mensaje;

    public DaoImplProducto() {
        conexion = new Conexion();
    }

    @Override
    public String datosSelect(Producto prod) {
    StringBuilder sql = new StringBuilder();
        sql.append("SELECT nombre ")
                .append("FROM producto ")
                .append("WHERE codProducto = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, prod.getCodProducto());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                prod.setNombre(rs.getString(1));
            }
            
        } catch (Exception e) {
            mensaje = "0";
        }
        return mensaje;    
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }


}

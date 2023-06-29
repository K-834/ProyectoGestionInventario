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
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public List<Producto> productoSelect() {
        List<Producto> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("codProducto, ")
                .append("nombre, ")
                .append("categoria, ")
                .append("cantidad ")
                .append("FROM producto ")
                .append("WHERE estado = 1 ");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Producto prod = new Producto();
                prod.setCodProducto(rs.getString(1));
                prod.setNombre(rs.getString(2));
                prod.setCategoria(rs.getString(3));
                prod.setCantidad(rs.getInt(4));
                lista.add(prod);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;

    }

    @Override
    public String productoditar(Producto prod) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE producto SET ")
                .append("nombre = ?, ")
                .append("categoria = ?, ")
                .append("cantidad = ? ")
                .append("WHERE codProducto = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, prod.getNombre());
            ps.setString(2, prod.getCategoria());
            ps.setInt(3, prod.getCantidad());
            ps.setString(4, prod.getCodProducto());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros actualizados";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String productoInsertar(Producto prod) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO producto(")
                .append("codProducto, ")
                .append("nombre, ")
                .append("categoria, ")
                .append("cantidad, ")
                .append("estado")
                .append(") VALUES (?,?,?,?,1)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, prod.getCodProducto());
            ps.setString(2, prod.getNombre());
            ps.setString(3, prod.getCategoria());
            ps.setInt(4, prod.getCantidad());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros agregados";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
            System.out.println(mensaje);
        }
        return mensaje;

    }

    @Override
    public String productoEliminar(Producto prod) {
         StringBuilder sql = new StringBuilder();
        sql.append("UPDATE producto SET ")
                .append("estado = 0 ")
                .append("WHERE codProducto = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
           ps.setString(1, prod.getCodProducto());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros eliminados";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    
    }

    @Override
    public String productoRecuperar(Producto prod) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE producto SET ")
                .append("estado = 1 ")
                .append("WHERE codProducto = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
           ps.setString(1, prod.getCodProducto());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros recuperados";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    
    }

    @Override
    public List<Producto> productoSelectEliminados() {
       List<Producto> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("codProducto, ")
                .append("nombre, ")
                .append("categoria, ")
                .append("cantidad ")
                .append("FROM producto ")
                .append("WHERE estado = 0 ");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Producto prod = new Producto();
                prod.setCodProducto(rs.getString(1));
                prod.setNombre(rs.getString(2));
                prod.setCategoria(rs.getString(3));
                prod.setCantidad(rs.getInt(4));
                lista.add(prod);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
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

}


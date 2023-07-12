/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.DaoDatos;
import entidades.Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.Conexion;

/**
 *
 * @author antho
 */
public class DaoImplDatos implements DaoDatos {

    private final Conexion conexion;
    private String mensaje;

    public DaoImplDatos() {
        conexion = new Conexion();
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public List<Datos> datosSelect() {
        List<Datos> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idStock, ")
                .append("codProducto, ")
                .append("cantidad, ")
                .append("fechaEntrada, ")
                .append("fechaCaducidad, ")
                .append("ubicacion, ")
                .append("idProveedor ")
                .append("FROM inventario ")
                .append("WHERE estado = 1");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Datos data = new Datos();
                data.setIdStock(rs.getInt(1));
                data.setCodProducto(rs.getString(2));
                data.setCantidad(rs.getInt(3));
                data.setFechaIngreso(rs.getString(4));
                data.setFechaCaducidad(rs.getString(5));
                data.setUbicacion(rs.getString(6));
                data.setIdProveedor(rs.getString(7));
                lista.add(data);
            }
        } catch (Exception e) {
            //mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, "ERROR",
                    "Error",
                    JOptionPane.ERROR_MESSAGE); 
        }
        return lista;
    }

    @Override
    public String datosEditar(Datos data) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE inventario SET ")
                .append("codProducto = ?, ")
                .append("cantidad = ?, ")
                .append("fechaEntrada = ?, ")
                .append("fechaCaducidad = ?, ")
                .append("ubicacion = ?, ")
                .append("idProveedor = ? ")
                .append("WHERE idStock = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, data.getCodProducto());
            ps.setInt(2, data.getCantidad());
            ps.setString(3, data.getFechaIngreso());
            ps.setString(4, data.getFechaCaducidad());
            ps.setString(5, data.getUbicacion());
            ps.setString(6, data.getIdProveedor());
            ps.setInt(7, data.getIdStock());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros actualizados";
            }
        } catch (Exception e) {
            //mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, "ERROR",
                    "Error",
                    JOptionPane.ERROR_MESSAGE); 
        }
        return mensaje;
    }

    @Override
    public String datosInsertar(Datos data) {

        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO inventario(")
                .append("codProducto, ")
                .append("cantidad, ")
                .append("fechaEntrada, ")
                .append("fechaCaducidad, ")
                .append("ubicacion, ")
                .append("idProveedor, ")
                .append("estado")
                .append(") VALUES (?,?,?,?,?,?,1)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, data.getCodProducto());
            ps.setInt(2, data.getCantidad());
            ps.setString(3, data.getFechaIngreso());
            ps.setString(4, data.getFechaCaducidad());
            ps.setString(5, data.getUbicacion());
            ps.setString(6, data.getIdProveedor());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros agregados";
            }
        } catch (Exception e) {
            //mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, "ERROR",
                    "Error",
                    JOptionPane.ERROR_MESSAGE); 
        }
        return mensaje;

    }

    @Override
    public String datosEliminar(Datos data) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE inventario SET ")
                .append("estado = 0 ")
                .append("WHERE idStock = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, data.getIdStock());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros actualizados";
            }
        } catch (Exception e) {
            //mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, "ERROR",
                    "Error",
                    JOptionPane.ERROR_MESSAGE); 
        }
        return mensaje;
    }

    @Override
    public String datosRecuperar(Datos data) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE inventario SET ")
                .append("estado = 1 ")
                .append("WHERE idStock = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, data.getIdStock());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros actualizados";
            }
        } catch (Exception e) {
           //mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, "ERROR",
                    "Error",
                    JOptionPane.ERROR_MESSAGE); 
        }
        return mensaje;
    }

    @Override
    public List<Datos> datosSelectEliminados() {
        List<Datos> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idStock, ")
                .append("codProducto, ")
                .append("cantidad, ")
                .append("fechaEntrada, ")
                .append("fechaCaducidad, ")
                .append("ubicacion, ")
                .append("idProveedor ")
                .append("FROM inventario ")
                .append("WHERE estado = 0");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Datos data = new Datos();
                data.setIdStock(rs.getInt(1));
                data.setCodProducto(rs.getString(2));
                data.setCantidad(rs.getInt(3));
                data.setFechaIngreso(rs.getString(4));
                data.setFechaCaducidad(rs.getString(5));
                data.setUbicacion(rs.getString(6));
                data.setIdProveedor(rs.getString(7));
                lista.add(data);
            }
        } catch (Exception e) {
            //mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, "ERROR",
                    "Error",
                    JOptionPane.ERROR_MESSAGE); 
        }
        return lista;
    }

}

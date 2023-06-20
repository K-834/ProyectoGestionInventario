/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.DaoReporte;
import entidades.Reporte;
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
public class DaoImplReporte implements DaoReporte{

     private final Conexion conexion;
    private String mensaje;

    public DaoImplReporte() {
        conexion = new Conexion();
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public List<Reporte> reporteSelect() {
        List<Reporte> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idReporte, ")
                .append("codEmpleado, ")
                .append("tipo, ")
                .append("titulo, ")
                .append("reporte ")
                .append("FROM reporte ")
                .append("WHERE estado = 1");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Reporte dataR = new Reporte();
                dataR.setIdReporte(rs.getInt(1));
                dataR.setCodEmpleado(rs.getString(2));
                dataR.setTipo(rs.getString(3));
                dataR.setTitulo(rs.getString(4));
                dataR.setReporte(rs.getString(5));
                lista.add(dataR);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;
    
    }

    @Override
    public String reporteInsertar(Reporte dataR) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO reporte(")
                .append("codEmpleado, ")
                .append("tipo, ")
                .append("titulo, ")
                .append("reporte, ")
                .append("estado ")
                .append(") VALUES (?,?,?,?,1)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, dataR.getCodEmpleado());
            ps.setString(2, dataR.getTipo());
            ps.setString(3, dataR.getTitulo());
            ps.setString(4, dataR.getReporte());
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
    public String reporteCumplido(Reporte dataR) {
         StringBuilder sql = new StringBuilder();
        sql.append("UPDATE reporte SET ")
                .append("estado = 0 ")
                .append("WHERE idReporte = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, dataR.getIdReporte());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros actualizados";
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.DaoHistorial;
import entidades.Historial;
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
public class DaoImplHistorial implements DaoHistorial {

    private final Conexion conexion;
    private String mensaje;

    public DaoImplHistorial() {
        conexion = new Conexion();
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public List<Historial> userSelect() {
        List<Historial> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idStock, ")
                .append("codProducto, ")
                .append("cantidad, ")
                .append("fechaEntrada, ")
                .append("fechaCaducidad, ")
                .append("ubicacion ")
                .append("FROM inventario ")
                .append("WHERE estado = 1 ")
                .append("ORDER BY idCambio DESC");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Historial histo = new Historial();
                 histo.setIdCambio(rs.getInt(1));
                histo.setIdStock(rs.getInt(2));
                histo.setIdUsuario(rs.getString(3));
                histo.setHistorial(rs.getString(4));
                histo.setFechaCambio(rs.getString(5));
                lista.add(histo);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;

    }

    @Override
    public String userInsertar(Historial histo) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO detalles(")
                .append("idStock, ")
                .append("idUsuario, ")
                .append("historial, ")
                .append("fechaCambio, ")
                .append("descripcion ")
                .append(") VALUES (?,?,?,?,?)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, histo.getIdStock());
            ps.setString(2, histo.getIdUsuario());
            ps.setString(3, histo.getHistorial());
            ps.setString(4, histo.getFechaCambio());
            ps.setString(5, histo.getDescripcion());
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
    public Historial userGrafico(String usuario) {
        Historial userG = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("COUNT(CASE WHEN historial = 'ELIMINADO' THEN historial END) AS Eliminar, ")
                .append("COUNT(CASE WHEN historial = 'RECUPERADO' THEN historial END) AS Recuperado, ")
                .append("COUNT(CASE WHEN historial = 'EDITADO' THEN historial END) AS Editado, ")
                .append("COUNT(CASE WHEN historial = 'AÑADIR' THEN historial END) AS Añadir, ")
                .append("COUNT(CASE WHEN historial = 'LOGEADO' THEN historial END) AS Logear, ")
                .append("COUNT(CASE WHEN historial = 'REPORTE' THEN historial END) AS Reporte ")
                .append("FROM detalles ")
                .append("WHERE idUsuario = ? ");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario);
            ResultSet resultado = ps.executeQuery();
            userG = new Historial();
            if (resultado.next()) {
                userG.setHistorialELiminar(resultado.getString(1));
                userG.setHistorialRecuperado(resultado.getString(2));
                userG.setHistorialEditado(resultado.getString(3));
                userG.setHistorialAñadir(resultado.getString(4));
                userG.setHistorialLogeado(resultado.getString(5));
                userG.setHistorialReporte(resultado.getString(6));
                System.out.println(userG.getHistorialELiminar());    
                System.out.println(userG.getHistorialReporte());    
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return userG;

    }

}

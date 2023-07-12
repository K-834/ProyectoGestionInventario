/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.DaoProveedores;
import entidades.Proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.Conexion;

/**
 *
 * @author Anghello
 */
public class DaoImplProveedores implements DaoProveedores {

    private final Conexion conexion;
    private String mensaje;

    public DaoImplProveedores() {
        this.conexion = new Conexion();
    }

    @Override
    public String getMensaje() {
        return mensaje; ///?
    }

    @Override
    public List<Proveedores> proveedoresSelect() {
        List<Proveedores> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idProvee, ")
                .append("nombre, ")
                .append("direccion, ")
                .append("email, ")
                .append("notas, ")
                .append("tipoDoc, ")
                .append("NumDoc ")
                .append("FROM proveedores ")
                .append("WHERE estado = 1");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Proveedores provee = new Proveedores();
                provee.setIdProvee(rs.getString(1));
                provee.setNombre(rs.getString(2));
                provee.setDireccion(rs.getString(3));
                provee.setEmail(rs.getString(4));
                provee.setNotas(rs.getString(5));
                provee.setTipoDoc(rs.getString(6));
                provee.setNumDoc(rs.getInt(7));
                lista.add(provee);
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
    public String proveedoresEditar(Proveedores provee) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE proveedores SET ")
                .append("nombre = ?, ")
                .append("direccion = ?, ")
                .append("email = ?, ")
                .append("notas = ?, ")
                .append("tipoDoc = ?, ")
                .append("NumDoc = ? ")
                .append("WHERE idProvee = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, provee.getNombre());
            ps.setString(2, provee.getDireccion());
            ps.setString(3, provee.getEmail());
            ps.setString(4, provee.getNotas());
            ps.setString(5, provee.getTipoDoc());
            ps.setInt(6, provee.getNumDoc());
            ps.setString(7, provee.getIdProvee());
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
    public String proveedoresInsertar(Proveedores provee) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO proveedores(")
                .append("idProvee, ")
                .append("nombre, ")
                .append("direccion, ")
                .append("email, ")
                .append("notas, ")
                .append("tipoDoc, ")
                .append("NumDoc, ")
                .append("estado")
                .append(") VALUES (?,?,?,?,?,?,?,1)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, provee.getIdProvee());
            ps.setString(2, provee.getNombre());
            ps.setString(3, provee.getDireccion());
            ps.setString(4, provee.getEmail());
            ps.setString(5, provee.getNotas());
            ps.setString(6, provee.getTipoDoc());
            ps.setInt(7, provee.getNumDoc());
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
    public String proveedoresEliminar(Proveedores provee) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE proveedores SET ")
                .append("estado = 0 ")
                .append("WHERE idProvee = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, provee.getIdProvee());
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
    public String proveedoresRecuperar(Proveedores provee) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE proveedores SET ")
                .append("estado = 1 ")
                .append("WHERE idProvee = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, provee.getIdProvee());
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
    public List<Proveedores> proveedoresSelectEliminados() {
        List<Proveedores> listaProvee = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idProvee, ")
                .append("nombre, ")
                .append("direccion, ")
                .append("email, ")
                .append("notas, ")
                .append("tipoDoc, ")
                .append("NumDoc ")
                .append("FROM proveedores ")
                .append("WHERE estado = 0");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            listaProvee = new ArrayList<>();
            while (rs.next()) {
                Proveedores provee = new Proveedores();
                provee.setIdProvee(rs.getString(1));
                provee.setNombre(rs.getString(2));
                provee.setDireccion(rs.getString(3));
                provee.setEmail(rs.getString(4));
                provee.setNotas(rs.getString(5));
                provee.setTipoDoc(rs.getString(6));
                provee.setNumDoc(rs.getInt(7));
                listaProvee.add(provee);
            }
        } catch (Exception e) {
            //mensaje = e.getMessage();
            JOptionPane.showMessageDialog(null, "ERROR",
                    "Error",
                    JOptionPane.ERROR_MESSAGE); 
        }
        return listaProvee;
    }
}

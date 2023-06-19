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
import util.Conexion;

/**
 *
 * @author Anghello
 */
public class DaoImplProveedores implements DaoProveedores{
    
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
       List<Proveedores> listaProvee = null;
       StringBuilder sql = new StringBuilder();
       sql.append("SELECT ")
               .append("idProvee, ")
               .append("nombre, ")
               .append("direccion, ")
               .append("email, ")
               .append("notas, ")
               .append("numIde, ")
               .append("ruc, ")
               .append("celular, ")
               .append("FROM proveedores")
               .append("WHERE estadoP = 1");
       //.append("WHERE idStock = ?"); Falta implementar este suceso de recuperación
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
                provee.setNumIde(rs.getString(6));
                provee.setRuc(rs.getInt(7));
                provee.setCelular(rs.getInt(8));
                listaProvee.add(provee);
            }
            } catch (Exception e) {
            mensaje = e.getMessage();
        }
       return listaProvee;
       }

    @Override
    public String proveedoresEditar(Proveedores provee) {
       StringBuilder sql = new StringBuilder();
       sql.append("UPDATE proveedores SET ")
               .append("nombre = ?, ")
               .append("direccion = ?, ")
               .append("email = ?, ")
               .append("notas = ?, ")
               .append("numIde = ?, ")
               .append("ruc = ?, ")
               .append("celular = ?, ")
               .append("WHERE idProvee = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, provee.getNombre());
            ps.setString(2, provee.getDireccion());
            ps.setString(3, provee.getEmail());
            ps.setString(4, provee.getNotas());
            ps.setString(5, provee.getNumIde());
            ps.setInt(6, provee.getRuc());
            ps.setInt(7, provee.getCelular());
            ps.setString(8, provee.getIdProvee());
            int resultado = ps.executeUpdate();
            if (resultado == 0) {
                mensaje = "Cero registros actualizados";

            }
            }catch (Exception e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String proveedoresInsertar(Proveedores provee) {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO proveedores(")
                .append("nombre, ")
                .append("direccion, ")
                .append("email, ")
                .append("notas, ")
                .append("numIde, ")
                .append("ruc, ")
                .append("celular, ")
                .append("estadoP,")
                .append(") VALUES (?,?,?,?,?,?,?,1)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, provee.getNombre());
            ps.setString(2, provee.getDireccion());
            ps.setString(3, provee.getEmail());
            ps.setString(4, provee.getNotas());
            ps.setString(5, provee.getNumIde());
            ps.setInt(6, provee.getRuc());
            ps.setInt(7, provee.getCelular());
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
            mensaje = e.getMessage();
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
            mensaje = e.getMessage();
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
               .append("numIde, ")
               .append("ruc, ")
               .append("celular, ")
               .append("FROM proveedores")
               .append("WHERE estadoP = 0");
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
                provee.setNumIde(rs.getString(6));
                provee.setRuc(rs.getInt(7));
                provee.setCelular(rs.getInt(8));
                listaProvee.add(provee);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return listaProvee;
    }
    }

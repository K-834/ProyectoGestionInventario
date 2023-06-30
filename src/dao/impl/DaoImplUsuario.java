/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.DaoUsuario;
import entidades.Datos;
import entidades.Usuario;
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
public class DaoImplUsuario implements DaoUsuario {

    private final Conexion conexion;
    private String mensaje;

    public DaoImplUsuario() {
        conexion = new Conexion();
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public List<Usuario> UsuarioSelect() {
        List<Usuario> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idUsuario, ")
                .append("nombre, ")
                .append("apellido, ")
                .append("correo, ")
                .append("telefono, ")
                .append("contraseña ")
                .append("FROM usuario ")
                .append("WHERE estado = 1 AND nivelSeguridad = 1");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Usuario dataUs = new Usuario();
                dataUs.setCodigo(rs.getString(1));
                dataUs.setNombre(rs.getString(2));
                dataUs.setApellido(rs.getString(3));
                dataUs.setCorreo(rs.getString(4));
                dataUs.setTelefono(rs.getInt(5));
                dataUs.setContraseña(rs.getString(6));
                lista.add(dataUs);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;

    }

    @Override
    public String UsuarioEditar(Usuario dataUs) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE usuario SET ")
                .append("nombre = ?, ")
                .append("apellido = ?, ")
                .append("correo = ?, ")
                .append("telefono = ?, ")
                .append("contraseña = ? ")
                .append("WHERE idUsuario = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, dataUs.getNombre());
            ps.setString(2, dataUs.getApellido());
            ps.setString(3, dataUs.getCorreo());
            ps.setInt(4, dataUs.getTelefono());
            ps.setString(5, dataUs.getContraseña());
            ps.setString(6, dataUs.getCodigo());
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
    public String UsuarioInsertar(Usuario dataUs) {

        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO usuario(")
                .append("idUsuario, ")
                .append("nombre, ")
                .append("apellido, ")
                .append("correo, ")
                .append("telefono, ")
                .append("nivelSeguridad, ")
                .append("estado, ")
                .append("contraseña ")
                .append(") VALUES (?,?,?,?,?,1,1,?)");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, dataUs.getCodigo());
            ps.setString(2, dataUs.getNombre());
            ps.setString(3, dataUs.getApellido());
            ps.setString(4, dataUs.getCorreo());
            ps.setInt(5, dataUs.getTelefono());
            ps.setString(6, dataUs.getContraseña());
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
    public String UsuarioEliminar(Usuario dataUs) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE usuario SET ")
                .append("estado = 0 ")
                .append("WHERE idUsuario = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, dataUs.getCodigo());
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
    public String UsuarioRecuperar(Usuario dataUs) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE usuario SET ")
                .append("estado = 1 ")
                .append("WHERE idUsuario = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, dataUs.getCodigo());
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
    public List<Usuario> UsuarioSelectEliminados() {
        List<Usuario> lista = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idUsuario, ")
                .append("nombre, ")
                .append("apellido, ")
                .append("correo, ")
                .append("telefono, ")
                .append("contraseña ")
                .append("FROM usuario ")
                .append("WHERE estado = 0 AND nivelSeguridad = 1");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                Usuario dataUs = new Usuario();
                dataUs.setCodigo(rs.getString(1));
                dataUs.setNombre(rs.getString(2));
                dataUs.setApellido(rs.getString(3));
                dataUs.setCorreo(rs.getString(4));
                dataUs.setTelefono(rs.getInt(5));
                dataUs.setContraseña(rs.getString(6));
                lista.add(dataUs);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return lista;

    }

    @Override
    public Usuario UsuarioPerfil(String usuario) {
        Usuario adm = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("nombre, ")
                .append("apellido, ")
                .append("correo, ")
                .append("telefono, ")
                .append("imagen ")
                .append("FROM usuario ")
                .append("WHERE idUsuario = ? ");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario);
            ResultSet resultado = ps.executeQuery();
            adm = new Usuario();
            if (resultado.next()) {
                adm.setNombre(resultado.getString(1));
                adm.setApellido(resultado.getString(2));
                adm.setCorreo(resultado.getString(3));
                adm.setTelefono(resultado.getInt(4));
                adm.setImagen(resultado.getBytes(5));
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return adm;

    }

}

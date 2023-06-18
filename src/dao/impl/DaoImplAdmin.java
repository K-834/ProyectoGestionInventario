/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.DaoAdmin;
import entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Conexion;

/**
 *
 * @author antho
 */
public class DaoImplAdmin implements  DaoAdmin{
    private final Conexion conexion;
    private String mensaje;

    public DaoImplAdmin() {
        conexion = new Conexion();
    }
   
    
    @Override
    public Usuario adminLogin(String usuario, String contraseña) {
        Usuario adm = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("idUsuario,")
                .append("nivelSeguridad ")
                .append("FROM usuario ")
                .append("WHERE idUsuario = ? AND contraseña = ?");
         try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet resultado = ps.executeQuery();
            adm = new Usuario();
            if (resultado.next()) {
                adm.setCodigo(resultado.getString(1));
                adm.setNivelSeguridad(resultado.getInt(2));
                System.out.println(adm.getCodigo());
                System.out.println(adm.getNivelSeguridad());
            
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
            
        }
        
        return adm;
    }

    @Override
    public Usuario adminNombre(String usuario, String contraseña) {
        Usuario adm = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("nombre ")
                .append("FROM usuario ")
                .append("WHERE idUsuario = ? AND contraseña = ?");
        try (Connection cn = conexion.getConexion()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ResultSet resultado = ps.executeQuery();
            adm = new Usuario();
            if (resultado.next()) {
                adm.setNombre(resultado.getString(1));
                System.out.println(adm.getNombre());
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return adm;
    
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }
    
}

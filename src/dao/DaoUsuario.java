/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Usuario;
import java.util.List;

/**
 *
 * @author antho
 */
public interface DaoUsuario {
    String getMensaje();
     
    List<Usuario> UsuarioSelect();
    
    String UsuarioEditar(Usuario dataUs);
    
    String UsuarioInsertar(Usuario dataUs);
    
    String UsuarioEliminar(Usuario dataUs);
    
    String UsuarioRecuperar(Usuario dataUs);
    
    List<Usuario> UsuarioSelectEliminados();
    
    Usuario UsuarioPerfil(String usuario);
}

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Usuario;

/**
 *
 * @author antho
 */
public interface DaoAdmin {
    String getMensaje();
    public Usuario adminLogin(String usuario, String contraseña);
    public Usuario adminNombre(String usuario, String contraseña);
    
}

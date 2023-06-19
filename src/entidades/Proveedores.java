/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Anghello
 */
public class Proveedores {
   private String nombre;
   private String direccion;
   private String email;
   private String notas;
   private String idProvee;
   private String numIde;
   private  int ruc;
   private int celular;
   private int estadoP;

    public Proveedores(){
        
    }
    
    
    public Proveedores(String nombre, String direccion, String email, String notas, String idProvee, String numIde, int ruc, int celular, int estadoP) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.notas = notas;
        this.idProvee = idProvee;
        this.numIde = numIde;
        this.ruc = ruc;
        this.celular = celular;
        this.estadoP = estadoP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getIdProvee() {
        return idProvee;
    }

    public void setIdProvee(String idProvee) {
        this.idProvee = idProvee;
    }

    public String getNumIde() {
        return numIde;
    }

    public void setNumIde(String numIde) {
        this.numIde = numIde;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
   
    public int getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(int estadoP) {
        this.estadoP = estadoP;
    }
    
    
    
}

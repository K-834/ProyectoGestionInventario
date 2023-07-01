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
   private String tipoDoc;
   private int numDoc;
   private int estadoP;

    public Proveedores() {
    }

    public Proveedores(String nombre, String string1, String string2, String string3, String string4, String string5, int aInt) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.notas = notas;
        this.idProvee = idProvee;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
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

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(int numDoc) {
        this.numDoc = numDoc;
    }

    public int getEstadoP() {
        return estadoP;
    }

    public void setEstadoP(int estadoP) {
        this.estadoP = estadoP;
    }

   
    
    
}

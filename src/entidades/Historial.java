/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author antho
 */
public class Historial {
    private int idCambio;
    private int idStock;
    private String idUsuario;
    private String historial;
    private String fechaCambio;
    private String descripcion; 

    public Historial() {
    }

    public Historial(int idCambio, int idStock, String idUsuario, String historial, String fechaCambio, String descripcion) {
        this.idCambio = idCambio;
        this.idStock = idStock;
        this.idUsuario = idUsuario;
        this.historial = historial;
        this.fechaCambio = fechaCambio;
        this.descripcion = descripcion;
    }

    
    public String getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(String fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public int getIdCambio() {
        return idCambio;
    }

    public void setIdCambio(int idCambio) {
        this.idCambio = idCambio;
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}

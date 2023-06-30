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
    
    //Grafico
    private String historialELiminar;
    private String historialRecuperado;
    private String historialEditado;
    private String historialAñadir;
    private String historialLogeado;
    private String historialReporte;

    public Historial() {
    }

    public Historial(int idCambio, int idStock, String idUsuario, String historial, String fechaCambio, String descripcion, String historialELiminar, String historialRecuperado, String historialEditado, String historialAñadir, String historialLogeado, String historialReporte) {
        this.idCambio = idCambio;
        this.idStock = idStock;
        this.idUsuario = idUsuario;
        this.historial = historial;
        this.fechaCambio = fechaCambio;
        this.descripcion = descripcion;
        this.historialELiminar = historialELiminar;
        this.historialRecuperado = historialRecuperado;
        this.historialEditado = historialEditado;
        this.historialAñadir = historialAñadir;
        this.historialLogeado = historialLogeado;
        this.historialReporte = historialReporte;
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

    public String getHistorialELiminar() {
        return historialELiminar;
    }

    public void setHistorialELiminar(String historialELiminar) {
        this.historialELiminar = historialELiminar;
    }

    public String getHistorialRecuperado() {
        return historialRecuperado;
    }

    public void setHistorialRecuperado(String historialRecuperado) {
        this.historialRecuperado = historialRecuperado;
    }

    public String getHistorialEditado() {
        return historialEditado;
    }

    public void setHistorialEditado(String historialEditado) {
        this.historialEditado = historialEditado;
    }

    public String getHistorialAñadir() {
        return historialAñadir;
    }

    public void setHistorialAñadir(String historialAñadir) {
        this.historialAñadir = historialAñadir;
    }

    public String getHistorialLogeado() {
        return historialLogeado;
    }

    public void setHistorialLogeado(String historialLogeado) {
        this.historialLogeado = historialLogeado;
    }

    public String getHistorialReporte() {
        return historialReporte;
    }

    public void setHistorialReporte(String historialReporte) {
        this.historialReporte = historialReporte;
    }
    
}

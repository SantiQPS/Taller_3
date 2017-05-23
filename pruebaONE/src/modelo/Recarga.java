/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author santiago
 */
public class Recarga {
    
    private String idRecarga;
    private String fecha;
    private String hora;
    private String valor;

    public Recarga(String idRecarga, String fecha, String hora, String valor) {
        this.idRecarga = idRecarga;
        this.fecha = fecha;
        this.hora = hora;
        this.valor = valor;
    }

    public String getIdRecarga() {
        return idRecarga;
    }

    public void setIdRecarga(String idRecarga) {
        this.idRecarga = idRecarga;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}

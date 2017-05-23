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
public class Oferta {
    
    private String fechaInicial;
    private String fechaFinal;
    private String porcentaje;

    public Oferta(String fechaInicial, String fechaFinal, String porcentaje) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.porcentaje = porcentaje;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}

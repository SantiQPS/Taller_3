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
public class Libro {
    
    private String texto;
    private String numPaginas;
    private String titulo;
    private String resumen;
    private String autor;
    private String precio;
    private String categoria;
    private String edadPublico;
    private boolean bestSellet;

    public Libro(String texto,String numPaginas, String titulo, String resumen, String autor, String precio, String categoria, String edadPublico, boolean bestSellet) {
        this.texto = texto;
        this.numPaginas = numPaginas;
        this.titulo = titulo;
        this.resumen = resumen;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
        this.edadPublico = edadPublico;
        this.bestSellet = bestSellet;
    }
    
    public String getTexto(){
        return texto;
    }
    
     public void setTexto(String texto){
         this.texto = texto;
    }
     
    public String getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEdadPublico() {
        return edadPublico;
    }

    public void setEdadPublico(String edadPublico) {
        this.edadPublico = edadPublico;
    }

    public boolean isBestSellet() {
        return bestSellet;
    }

    public void setBestSellet(boolean bestSellet) {
        this.bestSellet = bestSellet;
    }
    
    
}

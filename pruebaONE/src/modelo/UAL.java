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
public class UAL {
    
    private String nombre;
    private String cargo;
    private String celular;
    private String email;
    private boolean autorizadoOferta;
    private String password;
    
    public UAL(String nombre, String cargo, String celular, String email, boolean autorizadoOferta, String password) {
        this.password = password;
        this.nombre = nombre;
        this.cargo = cargo;
        this.celular = celular;
        this.email = email;
        this.autorizadoOferta = autorizadoOferta;
    }
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAutorizadoOferta() {
        return autorizadoOferta;
    }

    public void setAutorizadoOferta(boolean autorizadoOferta) {
        this.autorizadoOferta = autorizadoOferta;
    }
    
    
}

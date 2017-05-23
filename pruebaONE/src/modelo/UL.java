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
public class UL {
    
    private String nombre;
    private String celular;
    private String fechaCumple;
    private String email;
    private String edad;
    private String saldo;
    private String password;

    public UL(String nombre, String celular, String fechaCumple, String email, String edad, String saldo, String password) {
        this.nombre = nombre;
        this.celular = celular;
        this.fechaCumple = fechaCumple;
        this.email = email;
        this.edad = edad;
        this.saldo = saldo;
        this.password = password;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFechaCumple() {
        return fechaCumple;
    }

    public void setFechaCumple(String fechaCumple) {
        this.fechaCumple = fechaCumple;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
    
}

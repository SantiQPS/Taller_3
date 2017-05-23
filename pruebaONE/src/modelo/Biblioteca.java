/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

/**
 *
 * @author Usuario
 */
public class Biblioteca {
    private final HashSet objLibro;
    private final HashSet objClienteAdmin;
    private final HashSet objClienteUser;
    
    public Biblioteca(){
        this.objLibro = new HashSet();
        this.objClienteAdmin = new HashSet();
        this.objClienteUser = new HashSet();
    }
    
    public boolean AgregarLibro(Libro libro){
        boolean a;
        if(objLibro.add(libro)){ 
            a=true;
        }else{
            a=false;
        }
        return a;
    }
    
    public Libro ConsultarLibro(String titulo){
        Libro mostrar = null;
        Iterator i = objLibro.iterator();
        while(i.hasNext()){
            Libro busca = (Libro)i.next();
            if(busca.getTitulo().equals(titulo)){
                mostrar = busca;
            }
        }
        return mostrar;
    }
    
    public boolean ConsultarUser(String correo, String password){
        
        boolean a = false;
        Iterator i = objClienteUser.iterator();
        while(i.hasNext()){
            UL busca = (UL)i.next();
            if(busca.getEmail().equals(correo) && busca.getPassword().equals(password)){
                a=true;
            }else{
                a=false;
            }
        }
        return a;
    }
    
    public boolean EliminarLibro(String titulo){
        boolean a;
        a=this.objLibro.remove(titulo);
        return a;
    }
    
    public boolean ModificarLibro(Libro libro){
        
        boolean a = false;
        Iterator i = objLibro.iterator();
        while(i.hasNext()){
            Libro busca = (Libro)i.next();
            if(busca.getTitulo().equalsIgnoreCase(libro.getTitulo())){
                busca.setBestSellet(libro.isBestSellet());
                busca.setEdadPublico(libro.getEdadPublico());
                busca.setPrecio(libro.getPrecio());
                
                a = true;
            }else{
                a = false;
            }    
        }
        return a;
    }
    
    public boolean AgregarCLienteAdmin(UAL a){
        boolean e;
        if(objClienteAdmin.add(a)){
            e = true;
        } else{
            e = false;
        }
        return e;
    }
    
    public boolean AgregarClienteUser(UL a){
        boolean e;
        if(objClienteUser.add(a)){
            e = true;
        } else{
            e = false;
        }
        
        return e;
    }
}
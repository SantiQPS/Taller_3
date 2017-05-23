package Servidor;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;
import java.util.*;
/**
 *
 * @author yesidospitiamedina
 */
public class Servidor {
    
    private Socket cliente;
    private ServerSocket servidor;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    private Biblioteca biblioteca;
    
    public Servidor(int puerto)throws IOException{
        this.servidor = new ServerSocket(puerto);
        this.cliente = servidor.accept();
        this.entrada = new ObjectInputStream (cliente.getInputStream());
        this.salida = new ObjectOutputStream (cliente.getOutputStream());
        this.biblioteca = new Biblioteca();
    }
    
    public void conectarCliente(Libro libro)throws IOException{
        salida.writeObject(libro);
        salida.flush();
    }
    
    public void conectarClienteUAL(UAL ual)throws IOException{
        salida.writeObject(ual);
        salida.flush();
    }
    
    public void conectarClienteString(String mensaje)throws IOException{
        salida.writeObject(mensaje);
        salida.flush();
    }
    
    public void recibirInfo()throws IOException, ClassNotFoundException{
        String metodo;
        metodo= (String)entrada.readObject();
        Libro libro;
        libro = (Libro)entrada.readObject();
        
        switch(metodo){
            case "agregarLibro":
                biblioteca.AgregarLibro(libro);
                conectarClienteString("Libro Agregado Correctamente");
                break;
            case "eliminarLibro":
                biblioteca.EliminarLibro(libro.getTitulo());
                conectarClienteString("Libro Eliminaro Correctamente");
                break;
            case "modificarLibro":
                biblioteca.ModificarLibro(libro);
                conectarClienteString("Libro Modificado Correctamente");
                break;
            case"consultarLibro":
                conectarCliente(biblioteca.ConsultarLibro(metodo));
                break;
        }
    } 
    
    public void recibirInfoAdmins()throws IOException, ClassNotFoundException{
        String metodo;
        metodo = (String)entrada.readObject();
        UAL ual;
        ual = (UAL)entrada.readObject();
        
        switch(metodo){
            case"agregarAdmin":
                biblioteca.AgregarCLienteAdmin(ual);
                conectarClienteString("Cliente Agregado Correctamente");
                break;
        }
    }
    
    public void recibirInfoUser()throws IOException, ClassNotFoundException{
        String metodo;
        metodo = (String)entrada.readObject();
        UL ul;
        ul = (UL)entrada.readObject();
        
        switch(metodo){
            case"agregarUser":
                biblioteca.AgregarClienteUser(ul);
                conectarClienteString("Cliente Agregado Correctamente");
                break;
        }
    }
}

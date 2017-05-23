/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;


import java.io.*;
import java.net.*;
import java.util.*;
import modelo.*;
/**
 *
 * @author yesidospitiamedina
 */
public class Cliente {
    private Socket cliente;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
            
            
    public Cliente (int puerto) {
        try {
          
          this.cliente = new Socket ("127.0.0.1", puerto);
          System.out.println("Listo conexion");
          this.salida = new ObjectOutputStream (cliente.getOutputStream());
          this.entrada = new ObjectInputStream (cliente.getInputStream());
           
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void conectarConServidor(Libro libro, String metodo)throws IOException{
        //entrada.readObject();
        salida.writeObject(metodo);
        salida.flush();
        salida.writeObject(libro);
        salida.flush();
    }
}

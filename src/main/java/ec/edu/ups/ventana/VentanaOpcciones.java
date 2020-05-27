/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventana;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author linar
 */
public class VentanaOpcciones extends Frame {
    
   
    private Panel Ventana;
    private Panel Boton;
    private Panel Blanco;

    
  
    private Button AgregarTelefono;
    private Button BuscarTelefono;
    private Button ListarTelefonos;
    private Button MostrarTelefonos;
    private Button ModificarTelefono;
    private Button EliminarTelefono;
    private Button CerrarSesion;


    public VentanaOpcciones() {
        
        this.setTitle("Opcciones - Guia Telefonica");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        Ventana = new Panel(new GridLayout(0, 4));
        Blanco = new Panel();
        Boton = new Panel(new GridLayout(8, 1, 10,30));

        AgregarTelefono = new Button("Añadir Telefono");
        BuscarTelefono = new Button("Buscar Telefono");
        ListarTelefonos = new Button("Listar Telefonos");
        MostrarTelefonos = new Button("Mostrar Telefonos");
        ModificarTelefono = new Button("Modificar Telefono");
        EliminarTelefono = new Button("Eliminar Telefonos");
        CerrarSesion = new Button("Cerrar Sesion");
        

        Boton.add(AgregarTelefono);

        Boton.add(BuscarTelefono);

        Boton.add(ListarTelefonos);

        Boton.add(MostrarTelefonos);

        Boton.add(ModificarTelefono);

        Boton.add(EliminarTelefono);

        Boton.add(CerrarSesion);

        Ventana.add(Blanco);
        Ventana.add(Boton);
    
        this.add(Ventana);
    }
    
}

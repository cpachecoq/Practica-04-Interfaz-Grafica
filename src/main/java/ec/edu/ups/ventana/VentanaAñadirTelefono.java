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
public class VentanaAñadirTelefono extends Frame {
    
    private Panel Ventana;
    private Panel AgregarTelefono;
    private Panel Boton;

    
    private Button GuardarDatos;
    private Button Volver;

    
    private Label codigo;
    private Label tipo;
    private Label numero;
    private Label operadora;

    public VentanaAñadirTelefono() {
        
        this.setTitle("Agregar Telefono");
        this.setSize(600, 400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        
        Ventana = new Panel(new BorderLayout());
        AgregarTelefono = new Panel(new GridLayout(8, 2, 5, 20));
        Boton = new Panel();

        GuardarDatos = new Button("Guardar Datos");
        Volver = new Button("Volver");

        codigo = new Label("Codigo del telefono:", Label.CENTER);
        tipo = new Label("Tipo de telefono:", Label.CENTER);
        numero = new Label("Numero e telefono:", Label.CENTER);
        operadora = new Label("Nombre de la operadora:", Label.CENTER);
        
        
        AgregarTelefono.add(codigo);
        AgregarTelefono.add(new TextField());
        
        AgregarTelefono.add(tipo);
        AgregarTelefono.add(new TextField());
        
        AgregarTelefono.add(numero);
        AgregarTelefono.add(new TextField());
        
        AgregarTelefono.add(operadora);
        AgregarTelefono.add(new TextField());
        
        Boton.add(GuardarDatos);
        Boton.add(Volver);
        
       
        Ventana.add(AgregarTelefono, BorderLayout.CENTER);
        
        Ventana.add(Boton, BorderLayout.SOUTH);
        
        Ventana.add(new Panel(), BorderLayout.EAST);
        Ventana.add(new Panel(), BorderLayout.WEST);

        this.add(Ventana);
    }
    
    
}

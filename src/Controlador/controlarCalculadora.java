/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import model.Calculadora;
import vista.vistaCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author anthony.ricse
 */
public class controlarCalculadora {
    
    private Calculadora model ;
   private vistaCalculadora vista;

    public controlarCalculadora( vistaCalculadora vista) {
      
        this.vista = vista;
        
   
    }
   
     public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
   
 
}

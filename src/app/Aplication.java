/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.Calculadora;
import Controlador.controlarCalculadora;
import vista.vistaCalculadora;
/**
 *
 * @author anthony.ricse
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        vistaCalculadora frmCalculadora = new vistaCalculadora();
                
          controlarCalculadora controlaCal = new controlarCalculadora(frmCalculadora);
          controlaCal.iniciar();
          
    }
    
}

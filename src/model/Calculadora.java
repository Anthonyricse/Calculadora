/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author anthony.ricse
 */
public class Calculadora implements Operaciones {
    private String cadenaNumeros = "" ; 
    private String operacion = "nula";
    private boolean activado = true ; 
    private float  num1 ; 
    private float num2 ; 
    private float  resultado ; 

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Calculadora() {
     
    }
    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
 
     public String getCadenaNumeros() {
        return cadenaNumeros;
    }

    public void setCadenaNumeros(String cadenaNumeros) {
        this.cadenaNumeros = cadenaNumeros;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public boolean isActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
 
    @Override
    public void LimpiarTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void LimpiarCaracter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Sumar(float Num1, float Num2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Restar(float Num1, float Num2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Multiplicar(float Num1, float Num2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Dividir(float Num1, float Num2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ElevarPotencia(float Num1, float Num2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}

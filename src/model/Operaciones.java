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
public interface Operaciones {
    public void Sumar (float Num1 , float Num2);
    public void Restar(float Num1 , float  Num2);
    public void Multiplicar (float Num1 ,float  Num2);
    public void Dividir (float Num1 , float Num2) ; 
    public void ElevarPotencia(float Num1 , float Num2);     
    public void LimpiarTodo();
    public void LimpiarCaracter();
}

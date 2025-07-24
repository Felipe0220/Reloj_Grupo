/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cronometros;

import ClaseBaseReloj.Tiempo;

/**
 *
 * @author UTN
 */
public class cronometro extends Tiempo implements Controlable {

    @Override
    public void inicar() {
        this.activo=true;
    }

    @Override
    public void detener() {
         this.activo=false;
    }
}
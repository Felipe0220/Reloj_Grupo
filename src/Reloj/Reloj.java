/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;

/**
 *
 * @author kevin
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reloj {

    // Devuelve la hora actual en formato HH:mm:ss
        public static SimpleDateFormat obtenerHoraActual() {
        SimpleDateFormat formato = new SimpleDateFormat("hh:mm:ss");
        return formato;
    }
}

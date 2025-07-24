/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseBaseReloj;

/**
 *
 * @author Luisf
 */
public abstract class Tiempo {

    protected int hora;
    protected int minuto;
    protected int segundo;
    protected boolean activo;

    public Tiempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
        this.activo= false;
    }
    public void avanzar(){
        if(this.activo){
        segundo++;
        if (segundo == 60){
            segundo = 0;
            minuto++;
            if (minuto == 60){
                minuto = 0;
                hora++;
                if (hora == 24){
                    hora = 0;
                }
            }
        }
    }
    }
    
    public String toString(){
        String h, m, s;
        h = String.valueOf(hora);
        if (hora < 10){
            h = "0".concat(h);
        }
        m = String.valueOf(minuto);
        if (minuto < 10){
            h = "0".concat(m);
        }
        s = String.valueOf(segundo);
        if (segundo < 10){
            h = "0".concat(s);
        }
        return h+":"+m+":"+s;
    }
}

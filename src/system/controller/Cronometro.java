
package system.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 * @author matth
 */
public class Cronometro extends Thread{
    private JLabel labelI;
    //static int valorFinal = 0;
    private static int tiempoTranscurrido = 0;
    private static boolean detener; 

    public Cronometro(){
    }
    
    public Cronometro(JLabel labelI) {
        this.labelI = labelI;
    }    
    
    public void run(){
        HiloSalida hiloSalida = new HiloSalida();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(!detener){
            tiempoTranscurrido++;
            int minutos = tiempoTranscurrido / 60;
            int segundos = tiempoTranscurrido % 60;
            labelI.setText(String.format("%02d:%02d", minutos, segundos));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void detenerCronometro(){
        detener = true;        
    }
    
    public void resetTime(){        
        tiempoTranscurrido = 0;
        detener = false;
    }
}


package system.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import system.beam.Circulo;
import system.beam.SectorBase;

/**
 * @author matth
 */
public class HiloEmpaquetado extends Thread{
    private JLabel labelIn;
    private JPanel panelIn;
    private JPanel panel;
    private static int cantidadPelota = 0;
    private int x = 70;
    private int y = 55;
    private int salidaX = 178;
    private int salidaY = 185;

    public HiloEmpaquetado(JPanel panel) {
        this.panel = panel;
    }    
    
    //INSTANCIAS    
    static SectorBaseController sectorController = new SectorBaseController(); 
    static SectorBase empaquetado = sectorController.getEmpaquetadoSector();
    
    public void run(){
        labelIn = sectorController.getLabelEm();
        panelIn = sectorController.getPanelEm();
        
        cantidadPelota++;
        labelIn.setText("EMPAQUETADO: " + cantidadPelota);
        Circulo cInventario = new Circulo(panelIn.getGraphics(),x,y,"#DE28B3",45,45);
        int tiempoEspera = 1000*empaquetado.getTiempo();
        
        try {
            Thread.sleep(tiempoEspera);
            cantidadPelota -=1;
            labelIn.setText("EMPAQUETADO: " + cantidadPelota);
            if(cantidadPelota == 0) {
                panelIn.repaint();
            }
            
            while(salidaY < 240){
                Circulo cInicial = new Circulo(panel.getGraphics(),salidaX,salidaY,"#DE28B3");
                salidaY +=2;
                Thread.sleep(15);
                Circulo cRelleno = new Circulo(panel.getGraphics(),salidaX,salidaY-2,"#CCFFCC");
            }
            salidaY = 178;
            HiloSalida hiloSalida = new HiloSalida();
            hiloSalida.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloEmpaquetado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

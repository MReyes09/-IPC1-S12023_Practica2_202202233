
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
public class HiloProduccion extends Thread{
    private static int cantidadPelota = 0;
    private JLabel labelIn;
    private JPanel panelIn;
    private JPanel panel;
    private int x = 70;
    private int y = 55; 
    private int salidaX = 360;
    private int salidaY = 100;
    
    public HiloProduccion(JLabel labelIn, JPanel panelIn, JPanel panel) {
        this.labelIn = labelIn;
        this.panelIn = panelIn;
        this.panel = panel;
    }   
    
    //INSTANCIAS
    static SectorBaseController sectorController = new SectorBaseController();
    static SectorBase produccion = sectorController.getProduccionSector();
    
    public void run(){
        cantidadPelota++;
        labelIn.setText("PRODUCCIÓN: " + cantidadPelota);
        Circulo cInventario = new Circulo(panelIn.getGraphics(),x,y,"#31B404",45,45);
        int tiempoEspera = 1000*produccion.getTiempo();
        
        try {
            Thread.sleep(tiempoEspera);
            cantidadPelota -=1;
            labelIn.setText("PRODUCCIÓN: " + cantidadPelota);
            if(cantidadPelota == 0) {
                panelIn.repaint();
            }
            
            while(salidaX > 283){
                Circulo cInicial = new Circulo(panel.getGraphics(),salidaX,salidaY,"#31B404");
                salidaX-=2;
                Thread.sleep(15);
                Circulo cRelleno = new Circulo(panel.getGraphics(),salidaX+2,salidaY,"#CCFFCC");
            }
            salidaX = 360;
            HiloEmpaquetado hiloEmpaquetado = new HiloEmpaquetado(panel);
            hiloEmpaquetado.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloProduccion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

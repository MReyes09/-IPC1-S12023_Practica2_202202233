
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
public class HiloInventario extends Thread{
    private static int cantidadPelota = 0;
    private JLabel labelIn;
    private JPanel panelIn;
    private JLabel labelPr;
    private JPanel panelPr;
    private JPanel panel;
    private int x = 70;
    private int y = 55; 
    private int salidaX = 480;
    private int salidaY = 240;

    public HiloInventario(JLabel labelIn, JPanel pI, JPanel pS, JLabel lP, JPanel pP) {
        this.labelIn = labelIn;
        this.panelIn = pI;
        this.panel = pS;
        this.labelPr = lP;
        this.panelPr = pP;
    }
    
    //INSTANCIAS
    static SectorBaseController sectorController = new SectorBaseController();
    static SectorBase inventario = sectorController.getInventarioSector();
    
    public void run(){
        cantidadPelota++;
        labelIn.setText("INVENTARIO: " + cantidadPelota);
        Circulo cInventario = new Circulo(panelIn.getGraphics(),x,y,"#0101DF",45,45);
        int tiempoEspera = 1000*inventario.getTiempo();
        
        try {
            Thread.sleep(tiempoEspera);
            cantidadPelota -=1;
            labelIn.setText("INVENTARIO: " + cantidadPelota);
            if(cantidadPelota == 0){
                panelIn.repaint();
            }
            while(salidaY > 180){
                Circulo cInicial = new Circulo(panel.getGraphics(),salidaX,salidaY,"#0101DF");
                salidaY-=2;
                Thread.sleep(15);
                Circulo cRelleno = new Circulo(panel.getGraphics(),salidaX,salidaY+2,"#CCFFCC");                
            }
            salidaX = 480;
            salidaY = 240;
            HiloProduccion hiloProduccion = new HiloProduccion(labelPr, panelPr, panel);
            hiloProduccion.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


package system.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import system.beam.Circulo;
import system.beam.SectorBase;

/**
 * @author matth
 */
public class HiloSalida extends Thread{
    private JLabel labelIn;
    private JPanel panelIn;
    private JPanel panel;
    private JLabel finalizar;
    private static int cantidadPelota = 0;
    private static int valorFinal = 0;
    private int x = 70;
    private int y = 55;
    private int salidaX = 125;
    private int salidaY = 240;
    private int cantidadSalida = 0;
    
    static SectorBaseController sectorController = new SectorBaseController();
    static SectorBase salida = sectorController.getSalidaSector();
    
    public void run(){
        labelIn = sectorController.getLabelSa();
        panelIn = sectorController.getPanelSa();
        panel = sectorController.getPanelBase();
        finalizar = sectorController.getLabelFinalizar();
        
        cantidadPelota++;
        labelIn.setText("SALIDA: " + cantidadPelota);
        Circulo cInventario = new Circulo(panelIn.getGraphics(),x,y,"#8B487B",45,45);
        int tiempoEspera = 1000*salida.getTiempo();
        
        try {
            Thread.sleep(tiempoEspera);
            cantidadPelota -=1;
            labelIn.setText("SALIDA: " + cantidadPelota);
            if(cantidadPelota == 0) {
                panelIn.repaint();
            }
            
            while(salidaY > 190){
                Circulo cInicial = new Circulo(panel.getGraphics(),salidaX,salidaY,"#8B487B");
                salidaY -=2;
                Thread.sleep(15);
                Circulo cRelleno = new Circulo(panel.getGraphics(),salidaX,salidaY+2,"#CCFFCC");
            }
            
            while(salidaX > 50){
                Circulo cInicial = new Circulo(panel.getGraphics(),salidaX,salidaY,"#8B487B");
                salidaX -=2;
                Thread.sleep(15);
                Circulo cRelleno = new Circulo(panel.getGraphics(),salidaX+2,salidaY,"#CCFFCC");
            }
            
            if(valorFinal >= 30){
                valorFinal = 1;
                finalizar.setText(""+valorFinal);
            } else {
                valorFinal++;
                finalizar.setText(""+valorFinal);            
            }
            
            if(valorFinal == 30){
                Cronometro cronometro = new Cronometro();
                cronometro.detenerCronometro();
                valorFinal = 0; 
                JOptionPane.showMessageDialog(null, "¡¡Todos los procesos se han finalizado con exito!!!");                
            }
            salidaX = 125;
            salidaY = 240;
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setValorFinal(){
        valorFinal = 0;
    }
}

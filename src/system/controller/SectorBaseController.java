
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
public class SectorBaseController extends Thread{
    private JPanel panel;
    private JLabel label;
    private JLabel labelIn;
    private JPanel panelIn;
    private int x = 595;
    private int y = 190;

    public SectorBaseController(){
    }
    
    public SectorBaseController(JPanel p, JLabel l, JLabel lI, JPanel pI) {
        this.panel = p;
        this.label = l;
        this.labelIn = lI;
        this.panelIn = pI;
    }
    
    private static SectorBase produccion = new SectorBase();
    private static SectorBase empaquetado = new SectorBase();
    private static SectorBase inventario = new SectorBase();
    private static SectorBase salida = new SectorBase();
    
    public void setData(int CEmpaquetado, int CInventario, int CProduccion, int CSalida,         
        int TEmpaquetado, int TInventario, int TProduccion, int TSalida){
        //Agregar Datos a produccion
        produccion.setTiempo(TProduccion);
        produccion.setCosto(CProduccion);
        //Agregar Datos a empaquetado
        empaquetado.setTiempo(TEmpaquetado);
        empaquetado.setCosto(CEmpaquetado);
        
        inventario.setTiempo(TInventario);
        inventario.setCosto(CInventario);
        
        salida.setTiempo(TSalida);
        salida.setCosto(CSalida);
    }
    
    public SectorBase getProduccionSector() {
    return produccion;
    }

    public SectorBase getEmpaquetadoSector() {
        return empaquetado;
    }

    public SectorBase getInventarioSector() {
        return inventario;
    }

    public SectorBase getSalidaSector() {
        return salida;
    }
    
    //Hilo inicial
    public void run(){
        try {
            for(int i = 0; i < 30; i++){
                int bolitas = 30-i-1; 
                label.setText(""+bolitas);
                while(x > 530){
                    Circulo cInicial = new Circulo(panel.getGraphics(),x,y,"#000000");
                    x-=2;
                    Thread.sleep(10);//325
                    Circulo cRelleno = new Circulo(panel.getGraphics(),x+2,y,"#CCFFCC");
                }
                while(y < 240){
                    Circulo cInicial = new Circulo(panel.getGraphics(),x,y,"#000000");
                    y+=2;
                    Thread.sleep(15);//150
                    Circulo cRelleno = new Circulo(panel.getGraphics(),x,y-2,"#CCFFCC");
                }
                x = 595;
                y = 190;
                HiloInventario hiloInventario = new HiloInventario(labelIn,panelIn,panel);
                hiloInventario.start();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(SectorBaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    private class hiloInventario extends Thread{
//        private int x = 560;
//        private int y = 240;
//        public void run(){
//            while(y < 120){
//                Circulo cInicial = new Circulo(panel.getGraphics(),x,y,"#000000");
//                y-=2;
//                try {
//                    Thread.sleep(15);//150
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(SectorBaseController.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                Circulo cRelleno = new Circulo(panel.getGraphics(),x,y+2,"#CCFFCC");
//            }
//        }
//    }
}

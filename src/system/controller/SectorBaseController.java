
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
    private static JPanel panel;
    private JLabel label;
    //Para el hilo de invenario
    private JLabel labelIn;
    private JPanel panelIn;
    //Para el hilo de produccion
    private JPanel panelPr;
    private JLabel labelPr;
    //Para el hilo de empaquetado
    private static JPanel panelEm;
    private static JLabel labelEm;
    //Para el hilo de salida
    private static JPanel panelSa;
    private static JLabel labelSa;
    private static JLabel finalizar;
    
    
    private int x = 595;
    private int y = 190;

    public SectorBaseController(){
    }
    
    public SectorBaseController(JPanel p, JLabel l, JLabel lI, JPanel pI, JLabel lP, JPanel pP,
            JLabel lE, JPanel pE, JLabel lS, JPanel pS, JLabel s) {
        this.panel = p;
        this.label = l;
        this.labelIn = lI;
        this.panelIn = pI;
        this.labelPr = lP;
        this.panelPr = pP;
        this.labelEm = lE;
        this.panelEm = pE;
        this.labelSa = lS;
        this.panelSa = pS;
        this.finalizar = s;
    }
    
    private static SectorBase produccion = new SectorBase();
    private static SectorBase empaquetado = new SectorBase();
    private static SectorBase inventario = new SectorBase();
    private static SectorBase salida = new SectorBase();
    
    public void setData(int CEmpaquetado, int CInventario, int CProduccion, int CSalida,         
        int TEmpaquetado, int TInventario, int TProduccion, int TSalida){
        int bolitas = 30;
        //Agregar Datos a produccion
        produccion.setTiempo(TProduccion);
        produccion.setCosto(CProduccion);
        int totalP = (TProduccion*CProduccion*bolitas);        
        produccion.setTotalSector(totalP);       
        
        //Agregar Datos a empaquetado
        empaquetado.setTiempo(TEmpaquetado);
        empaquetado.setCosto(CEmpaquetado);
        int totalE = TEmpaquetado * CEmpaquetado * bolitas;
        empaquetado.setTotalSector(totalE);        
        
        inventario.setTiempo(TInventario);
        inventario.setCosto(CInventario);
        int totalI = TInventario*CInventario*bolitas;
        inventario.setTotalSector(totalI);
        
        salida.setTiempo(TSalida);
        salida.setCosto(CSalida);
        int totalS = TSalida*CSalida*bolitas;
        salida.setTotalSector(totalS);
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
                while(x > 532){
                    Circulo cInicial = new Circulo(panel.getGraphics(),x,y,"#000000");
                    x-=2;
                    Thread.sleep(17);//0.5525
                    Circulo cRelleno = new Circulo(panel.getGraphics(),x+2,y,"#CCFFCC");
                }
                while(y < 242){
                    Circulo cInicial = new Circulo(panel.getGraphics(),x,y,"#000000");
                    y+=2;
                    Thread.sleep(17);//0.425
                    Circulo cRelleno = new Circulo(panel.getGraphics(),x,y-2,"#CCFFCC");
                }
                x = 595;
                y = 190;
                HiloInventario hiloInventario = new HiloInventario(labelIn,panelIn,panel, labelPr, panelPr);
                hiloInventario.start();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(SectorBaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JPanel getPanelEm() {
        return panelEm;
    }

    public JLabel getLabelEm() {
        return labelEm;
    }
    
    public JPanel getPanelBase(){
        return panel;
    }

    public static JPanel getPanelSa() {
        return panelSa;
    }

    public static JLabel getLabelSa() {
        return labelSa;
    }
    
    public static JLabel getLabelFinalizar(){
        return finalizar;
    }
    
}
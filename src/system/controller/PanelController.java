
package system.controller;

import system.system.PracticaMain;
import system.view.MenuPrincipal;
import system.view.Reporte;
import system.view.Simulacion;

/**
 * @author matth
 */

public class PanelController {
    
    //control de estancias para los paneles
    public PracticaMain getPracticaMain(){
        PracticaMain practicaMain = new PracticaMain();
        return practicaMain;
    }
    
    public MenuPrincipal getMenuPrincipal(){
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        return menuPrincipal;
    }
    
    public Simulacion getSimulacion(){
        Simulacion simulacion = new Simulacion();
        return simulacion;
    }
    
    public Reporte getReporte(){
        Reporte reporte = new Reporte();
        return reporte;
    }
}

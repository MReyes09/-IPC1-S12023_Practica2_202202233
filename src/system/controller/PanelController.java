
package system.controller;

import system.system.PracticaMain;
import system.view.MenuPrincipal;
import system.view.VentanaBase;

/**
 * @author matth
 */

public class PanelController {
    private MenuPrincipal menuPrincipal = new MenuPrincipal();
    private PracticaMain practicaMain = new PracticaMain();
    
    //control de estancias para los paneles
    public PracticaMain getPracticaMain(){
        return practicaMain;
    }
    
    public MenuPrincipal getMenuPrincipal(){
        return menuPrincipal;
    }
}


package system.controller;

import system.beam.SectorBase;

/**
 * @author matth
 */
public class SectorBaseController extends Thread{
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
        for(int i = 0; i < 5; i++){
            System.out.println("valor i: " + i);
        }
    } 
}


package system.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import system.beam.SectorBase;

/**
 * @author matth
 */
public class Reporte {
    private int cantidad = 1;
    private static SectorBaseController sector = new SectorBaseController();
    private static SectorBase produccion = sector.getProduccionSector();
    private static SectorBase empaquetado = sector.getEmpaquetadoSector();
    private static SectorBase inventario = sector.getInventarioSector();
    private static SectorBase salida = sector.getSalidaSector();
    
    public void crearReporte(){
        
        int costoInventario = inventario.getTotalSector();
        int costoProduccion = produccion.getTotalSector();
        int costoEmpaquetado = empaquetado.getTotalSector();
        int costoSalida = salida.getTotalSector();
        int total = produccion.getTotalSector()
                + empaquetado.getTotalSector()
                + inventario.getTotalSector()
                + salida.getTotalSector();
        try{
            // Crear el archivo HTML
        String fileName = "Reporte_" + cantidad + ".html";
        cantidad++;
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("C:\\Users\\matth\\Downloads\\" + fileName));
        outputStreamWriter.write("<!DOCTYPE html>\n");
        outputStreamWriter.write("<html>\n");
        outputStreamWriter.write("<head>\n");
        outputStreamWriter.write("<title>Costo Total por Sector</title>\n");
        outputStreamWriter.write("<style>\n");
        outputStreamWriter.write("body {\n");
        outputStreamWriter.write("background-color: #f2f2f2;\n");
        outputStreamWriter.write("font-family: Arial, sans-serif;\n");
        outputStreamWriter.write("font-size: 16px;\n");
        outputStreamWriter.write("line-height: 1.5;\n");
        outputStreamWriter.write("color: #333;\n");
        outputStreamWriter.write("margin: 0;\n");
        outputStreamWriter.write("padding: 0;\n");
        outputStreamWriter.write("}\n");
        outputStreamWriter.write("h1 {\n");
        outputStreamWriter.write("font-size: 32px;\n");
        outputStreamWriter.write("font-weight: bold;\n");
        outputStreamWriter.write("margin: 20px 0;\n");
        outputStreamWriter.write("text-align: center;\n");
        outputStreamWriter.write("}\n");
        outputStreamWriter.write("p {\n");
        outputStreamWriter.write("margin: 10px 0;\n");
        outputStreamWriter.write("text-align: center;\n");
        outputStreamWriter.write("}\n");
        outputStreamWriter.write("table {\n");
        outputStreamWriter.write("border-collapse: collapse;\n");
        outputStreamWriter.write("width: 100%;\n");
        outputStreamWriter.write("max-width: 600px;\n");
        outputStreamWriter.write("margin: 20px auto;\n");
        outputStreamWriter.write("}\n");
        outputStreamWriter.write("th, td {\n");
        outputStreamWriter.write("padding: 10px;\n");
        outputStreamWriter.write("text-align: center;\n");
        outputStreamWriter.write("border: 1px solid #ccc;\n");
        outputStreamWriter.write("}\n");
        outputStreamWriter.write("th {\n");
        outputStreamWriter.write("background-color: #eee;\n");
        outputStreamWriter.write("}\n");
        outputStreamWriter.write("</style>\n");
        outputStreamWriter.write("</head>\n"
        + "<body>"
                + "<h1>Costo Total por Sector</h1>"
                + "<table>"
                + "<tr><th>Sector</th><th>Costo</th></tr>"
                + "<tr><td>Inventario</td><td>Q " + costoInventario + "</td></tr>"
                + "<tr><td>Producción</td><td>Q " + costoProduccion + "</td></tr>"
                + "<tr><td>Empaquetado</td><td>Q " + costoEmpaquetado + "</td></tr>"
                + "<tr><td>Salida</td><td>Q " + costoSalida + "</td></tr>"
                + "<tr><td>Total</td><td>Q " + total + "</td></tr>"
                + "</table>"
                + "<p>Matthew Emmanuel Reyes Melgar 202202233</p>"
                + "</body></html>");
        outputStreamWriter.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Error al descargar el reporte");
        }
        JOptionPane.showMessageDialog(null, "Se ha descargado el reporte con exito");
    }
    
}

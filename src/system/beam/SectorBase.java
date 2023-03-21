
package system.beam;

/**
 * @author matth
 */
public class SectorBase {
    private int tiempo;
    private int costo;
    private double totalSector;
    private String color;

    public SectorBase() {
    }    

    public SectorBase(int tiempo, int costo, double totalSector, String color) {
        this.tiempo = tiempo;
        this.costo = costo;
        this.totalSector = totalSector;
        this.color = color;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public double getTotalSector() {
        return totalSector;
    }

    public void setTotalSector(double totalSector) {
        this.totalSector = totalSector;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

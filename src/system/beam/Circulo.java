
package system.beam;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author matth
 */
public class Circulo {
    int x;
    int y;

    public Circulo(Graphics g,int x, int y, String color) {
        this.x = x;
        this.y = y;        
        g.setColor(Color.decode(color));
        g.fillOval(x, y, 30, 30);
    }
    
    public Circulo(Graphics g, int x, int y, String color, int width, int height){
        this.x = x;
        this.y = y;        
        g.setColor(Color.decode(color));
        g.fillOval(x, y, width, height);
    }
}

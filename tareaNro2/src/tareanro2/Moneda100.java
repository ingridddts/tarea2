package tareanro2;

/**
 * clase que hereda de clase abstracta Moneda
 * @param color: color que recibe en la grafica de la maquina expendedora
 */

import java.awt.Color;
import java.awt.Graphics;

class Moneda100 extends Moneda{
    private Color brown = new Color(153, 102, 0);
    
    //constructor
    public Moneda100(int serie, int x, int y){
        super(serie, x, y);
    }

    /**
     * @return devuelve cual es el valor de la moneda
     */
    public int getValor(){
        return 100;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(brown);
        g.fillOval(x, y, 50, 50);
        g.setColor(Color.black);
        g.drawOval(x, y, 50, 50);
        g.setColor(Color.white);
        g.drawString(Integer.toString(100), x + 15, y+30);
    }
}

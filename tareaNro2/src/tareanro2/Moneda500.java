package tareanro2;

//clase que hereda de clase abstracta Moneda

import java.awt.Color;
import java.awt.Graphics;

class Moneda500 extends Moneda{
    private Color grey = new Color(204,204, 204);
    
    public Moneda500(int serie, int x, int y){
        super(serie, x, y);
    }
    
    //devuelve su valor
    public int getValor(){
        return 500;
    }
    
    public void paint(Graphics g) {
        g.setColor(grey);
        g.fillOval(x, y, 50, 50);
        g.setColor(Color.black);
        g.drawOval(x, y, 50, 50);
        g.setColor(Color.white);
        g.drawString(Integer.toString(500), x + 15, y+30);
    }
}

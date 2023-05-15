package tareanro2;

//clase que hereda de clase abstracta Moneda

import java.awt.Color;
import java.awt.Graphics;

class Moneda1000 extends Moneda{
    private Color gold = new Color(255, 204, 51);
    
    public Moneda1000(int serie, int x, int y){
        super(serie, x, y);
    }
    
    //devuelve su valor
    public int getValor(){
        return 1000;
    }
    
    public void paint(Graphics g) {
        g.setColor(gold);
        g.fillOval(x, y, 50, 50);
        g.setColor(Color.black);
        g.drawOval(x, y, 50, 50);
        g.setColor(Color.white);
        g.drawString(Integer.toString(100), x + 15, y+30);
    }
}

package tareanro2;

import java.awt.Color;
import java.awt.Graphics;

class Fanta extends Bebida{

    public Fanta(int serie, int x,int y){
        super(serie, x, y);
    }
    
    @Override
    public String sabor(){
        return "Fanta";
    }
    @Override
    public void paint (Graphics g){
        Color o=new Color(255,153,0);
        g.setColor(o);
        g.fillRect(x+4, y+4, 142, 25);
        g.setColor(Color.white);
        g.drawString(Integer.toString(getSerie()), x+60, y+21);
    }
}

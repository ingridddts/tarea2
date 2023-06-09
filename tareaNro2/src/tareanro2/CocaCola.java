package tareanro2;
/**
 * Esta clase hereda de clase abstracta bebida y devuelve el sabor de la bebida
 */

import java.awt.Color;
import java.awt.Graphics;

class CocaCola extends Bebida{
    //constructor clase CocaCola
    public CocaCola(int i, int x, int y){
        super(i, x, y);
    }
    
    /**
     * @param s, contiene el sabor de la bebida
     * @return devuelve el sabor de la bebida, en este caso, coca cola
    */
    public String sabor(){
        String s = "cocacola";
        return s;
    }
    
    /**
     * se representa, de forma gráfica, una cocacola
    */
    @Override
    public void paint(Graphics g){ 
        g.setColor(Color.red);
        g.fillRect(x+4, y+4, 142, 25);
        g.setColor(Color.white);
        g.drawString(Integer.toString(getSerie()), x+60, y+21);
    }
}
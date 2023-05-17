package tareanro2;
/**
 * Esta clase Fanta hereda de clase abstracta bebida y devuelve el sabor de la bebida
 */
import java.awt.Color;
import java.awt.Graphics;

class Fanta extends Bebida{

    public Fanta(int serie, int x,int y){
        super(serie, x, y);
    }
    
    @Override
    /**
     * @param s, contiene el sabor de la bebida
     * @return devuelve el sabor de la bebida, en este caso, fanta
    */
    public String sabor(){
        return "Fanta";
    }
    @Override
    /**
     * se representa, de forma gráfica, una fanta
    */
    public void paint (Graphics g){
        Color o=new Color(255,153,0);
        g.setColor(o);
        g.fillRect(x+4, y+4, 142, 25);
        g.setColor(Color.white);
        g.drawString(Integer.toString(getSerie()), x+60, y+21);
    }
}

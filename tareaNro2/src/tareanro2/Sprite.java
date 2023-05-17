package tareanro2;
/**
 * Esta clase Sprite hereda de clase abstracta bebida y devuelve el sabor de la bebida
 */
import java.awt.Color;
import java.awt.Graphics;

class Sprite extends Bebida{
    public Sprite(int serie, int x, int y){
        super(serie, x, y);
}
    @Override
    /**
     * @param s, contiene el sabor de la bebida
     * @return devuelve el sabor de la bebida, en este caso, sprite
    */
    public String sabor(){
        String s= "sprite";
        return s;
    }  
    
    @Override
    /**
     * se representa, de forma gráfica, una sprite
    */
    public void paint (Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(x+4, y+4, 142, 25);
        g.setColor(Color.white);
        g.drawString(Integer.toString(getSerie()), x+60, y+21);
    }
}

package tareanro2;

//Clase que hereda de clase abstracta bebida
import java.awt.Color;
import java.awt.Graphics;

class Sprite extends Bebida{
    public Sprite(int serie, int x, int y){
        super(serie, x, y);
}
    @Override
    //devuelve el nombre de su sabor
    public String sabor(){
        String s= "sprite";
        return s;
    }  
    
    @Override
    public void paint (Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(x+4, y+4, 142, 25);
        g.setColor(Color.white);
        g.drawString(Integer.toString(getSerie()), x+60, y+21);
    }
}

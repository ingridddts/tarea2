package tareanro2;
/**
 * clase abstracta que contiene/hereda 4 subclases: Moneda100, Moneda500, Moneda1000, Moneda1500
 * @param serie : indica el número de serie de la moneda
 */

import java.awt.Graphics;

abstract class Moneda{
    protected int serie, x, y;
    
    //constructor
    public Moneda(int serie, int x, int y){
        this.serie = serie;
        this.x = x;
        this.y = y;      
    }
    
    /**
     * @return devuelve el número de serie de la moneda
     */
    public int getSerie (){
        return serie;
    }
    
    public abstract int getValor(); //retorna la cantidad que devuelve la moneda
    
    public abstract void paint(Graphics g);
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}

package tareanro2;

import java.awt.Graphics;

/**
 * Esta clase define los atributos de una bebida
 * que, a su vez, hereda de la clase Producto
 * @param serie: contiene el código propio de la bebida
 * @param x,y: propios de la gráfica de casa bebida
 */

abstract class Bebida extends Producto{
    private int serie; //codigo bebida
    protected int x,y;
    
    //constructor de la clase bebida
    public Bebida(int serie, int x, int y){
        super(serie);
        this.serie = serie;
        this.x = x;
        this.y = y;
    }
    
    /**
     * @return devuelve el número de seride de la bebida
     */
    public int getSerie(){
        return serie;
    }
    
    /**
     * @return devuelve el sabor de la bebida
     */
    public abstract String sabor();
    
    
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public abstract void paint(Graphics g);
    
}



package tareanro2;

import java.awt.Graphics;

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
    
    //obtiene/retorna el número de serie de la bebida
    public int getSerie(){
        return serie;
    }
    
    //obtiene/retorna el sabor de la bebida
    public abstract String sabor();
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public abstract void paint(Graphics g);
    
}



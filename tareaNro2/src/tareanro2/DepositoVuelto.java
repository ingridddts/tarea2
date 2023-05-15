package tareanro2;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

class DepositoVuelto{
    private ArrayList<Moneda> deposito;
    private int x, y, aux;
    
    //constructor, inicializa array tipo moneda
    public DepositoVuelto(int x, int y){
        deposito = new ArrayList<Moneda>();
        this.x = x;
        this.y = y;
    }
    
    public void addMoneda(Moneda moneda){
        deposito.add(moneda);  //agrega una moneda al arraylist de tipo moneda  
        moneda.setXY(x+255+aux, y+15);
        aux -= 3;
    }
    
    //determinar el vuelto
    public Moneda getMoneda(){
        if(deposito.isEmpty()){ 
            return null; //si no se inserta una moneda devuelve null
        }
        else{
            Moneda vuelto = deposito.get(0);
            deposito.remove(0); 
            return vuelto; //si se inserta moneda valida, devuelve el vuelto
        }
        
    }
    
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(x, y, 310,80);
        g.setColor(Color.white);
        g.fillRect(x+1, y+1, 309, 79);

        for(Moneda moneda:deposito){
            moneda.paint(g);
        }
    }
}
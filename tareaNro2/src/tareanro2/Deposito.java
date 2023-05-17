package tareanro2;
/**
 * Esta clase contiene la existencia de cada uno de los productos vendidos por la máquina expendedora.
 * @param deposito contiene un arreglo del tipo bebida
 * @param deposito1 contiene un arreglo del tipo dulces
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> deposito;
    private ArrayList<Dulce> deposito1;
    private int x, y , aux;
    
    /**
     * constructor para crear el deposito y los arraylist de cada tipo
     */
    public Deposito(int x, int y){
        deposito = new ArrayList<Bebida>();
        deposito1 = new ArrayList<Dulce>();
        this.x = x;
        this.y = y;
    }
    
    //agrega una bebida al arraylist de bebidas
    public void addBebida(Bebida bebida){
        deposito.add(bebida);
        bebida.setXY(x, y+315+aux);
        aux -= 35;
    }
   
    //agrega un dulce al arraylist de dulces
    public void addDulce(Dulce dulce){
        deposito1.add(dulce);
    }
    
    /**
     * se verifica si hay bebidas
     * @return devuelve la bebida seleccionada
     */
    public Bebida getBebida(){
        if(deposito.isEmpty()){
            System.out.println("Deposito Vacio");
             return null; //si no hay bebidas
        }
        else{ //en el caso que hay dicponibilidad de bebida, se realiza la compra
            Bebida bebida = deposito.get(0);
            deposito.remove(0);
            aux = 0;
            return bebida;
        }
    }

    /**
     * se verifica si hay dulces
     * @return devuelve el dulce seleccionado
     */
    public Dulce getDulce(){
        if(deposito1.size() == 0){
             return null; //si el deposito de dulces esta vacio
        }
        else{ //si hay stock, el dulce es comprado
            Dulce dulce = deposito1.get(0);
            deposito1.remove(0);
            return dulce;
        }
    }
    
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(x, y, 150,350);
        g.setColor(Color.white);
        g.fillRect(x+1, y+1, 149, 349);
        for (int i = deposito.size() - 1; i >= 0; i--) {
            Bebida p = deposito.get(i);
            p.paint(g);
        }
    }
   
}

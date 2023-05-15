package tareanro2;

//1: tipo bebida:

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
//import javax.swing.JPanel;

    //1:cocacola
    //2:sprite
//2: tipo dulce
    //1: snickers
    //2: super8

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    private DepositoMonedas dm;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private DepositoVuelto vuelto;
    private DepositoUnico du;
    private int precio;
    private final int x;
    private final int y;
    private int serieMon100;
    private int numProductos;
    int serieCoca = 100;
    int serieSprite = 200;
    int serieFanta = 300;
    
    public Expendedor(int numProductos, int precio, int x, int y){
        this.precio = precio;
        dm=new DepositoMonedas(x,y);
        du= new DepositoUnico(x,y);
        vuelto = new DepositoVuelto(x-108,y+469);
        coca = new Deposito(x-109,y+19);
        sprite = new Deposito(x+60, y+19);
        fanta = new Deposito(x+230, y+19);
        this.x=x; this.y=y;
        this.numProductos=numProductos;
        
        rellenarCoca();
        rellenarSprite();
        rellenarFanta();
    }
    public void paint(Graphics g){
        Color lb=new Color(51,153,255);
        g.setColor(Color.white);
        g.drawRect(x-130, y-1, 530, 601);
        g.setColor(lb);
        g.fillRect(x-129, y, 529, 600);
        coca.paint(g);
        sprite.paint(g);
        fanta.paint(g);
        dm.paint(g);
        du.paint(g);
        vuelto.paint(g);
    }
      
    public void comprarProducto(ArrayList<Moneda> m, int cual) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        int vueltoDep=0;
        if(!m.isEmpty()){
            for(Moneda moneda:m){
                vueltoDep+=moneda.getValor();
                dm.addMoneda(moneda);
            }
        
        if(vueltoDep < precio){
            throw new PagoInsuficienteException("SALDO INSUFICIENTE PARA COMPRAR PRODUCTO");
        }
        
        Bebida cocaColaBebida;
        Bebida spriteBebida;
        Bebida fantaBebida;
        
        if(cual==COCA && vueltoDep >= precio){
            cocaColaBebida=coca.getBebida();
            if(cocaColaBebida!=null){
                vueltoDep -= precio;
                du.addBebida(cocaColaBebida);
            }
        }
        if(cual == SPRITE && vueltoDep >= precio){
            spriteBebida=sprite.getBebida();
            if(spriteBebida!=null){
                vueltoDep-=precio;
                du.addBebida(spriteBebida);
            }
        }
        if(cual==FANTA && vueltoDep >= precio){
            fantaBebida=fanta.getBebida();
            if(fantaBebida!=null){
                vueltoDep-=precio;
                du.addBebida(fantaBebida);
            }
        }
        
        while(vueltoDep>0){
            vuelto.addMoneda(new Moneda100(serieMon100,0,0));
            vueltoDep-=100;
            serieMon100++;
        }
    }else{
            throw new PagoInsuficienteException("INGRESE MÁS DINERO PARA COMPRAR");
        }
}

    public void rellenarCoca(){
        for(int i=0; i<numProductos;i++){
            coca.addBebida(new CocaCola(serieCoca++,x,y));
        }System.out.println("Depósito Coca Cola rellenado");
    }
    
    public void rellenarSprite(){
        for(int i=0; i<numProductos;i++){
            sprite.addBebida(new Sprite(serieSprite++,x,y));
        }System.out.println("Depósito Sprite rellenado");
    }
    
    public void rellenarFanta(){
        for(int i=0; i<numProductos;i++){
            fanta.addBebida(new Fanta(serieFanta++,x,y));
        }System.out.println("Depósito Fanta rellenado");
    }
    
    public Bebida getDepUnico(){
        return du.getBebida();
    }
    
    public Moneda getVuelto(){
        return vuelto.getMoneda();
    }
    /*
    public boolean isEmptyCoca(){
        return coca.isEmpty();
    }
    
    public boolean isEmptySprite(){
        return sprite.isEmpty();
    }
    
    public boolean isEmptyFanta(){
        return fanta.isEmpty();
    }
    */
    public int getPrecioBebida(){
        return this.precio;
    }
}
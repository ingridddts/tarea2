package tareanro2;

class Comprador{
    private String sabor;
    private int monedavuelto;
    
    //el constructor resive como parametros con qué moneda se compra
    //el tipo de producto comprado: dulce o bebida
    //qué producto se compró: cocacola, sprite, snickers o super8
    public Comprador(Moneda moneda, int tipoProducto, int cualProducto, Expendedor exp){        
        this.monedavuelto=0;
        //Bebida a = exp.comprarBebida(moneda, cualBebida);
        Producto varProducto;
        
        //execepcion de la compra
        try{
            //si la compra es realizada, se muestran los datos
            varProducto = exp.comprarProducto(moneda, tipoProducto,cualProducto);
            sabor = varProducto.sabor();
            System.out.println("Compra realizada");
        } catch(PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e){
            sabor = null; //se muestra null porque no se realizó la compra
            System.out.println(e.getMessage());
        }
        
        Moneda vMoneda = exp.getVuelto();
        while(vMoneda != null){
            monedavuelto = monedavuelto + vMoneda.getValor();
            vMoneda = exp.getVuelto();
        }
    }
    
    //devuelve cuánto es el vuelto del comprador
    public int cuantoVuelto(){
        return monedavuelto;
    }
    
    //devuelve cuál bebida o dulce compró
    public String queCompraste() {
        return sabor;
    }
}
package tareanro2;

//1: tipo bebida:
    //1:cocacola
    //2:sprite
//2: tipo dulce
    //1: snickers
    //2: super8

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private Deposito snickers;
    private Deposito super8;
    private DepositoVuelto dv;
    private int precio; //precio del producto que puede ser dulce o bebida
    
    //constructor expendedor tiene como parametros el stock de productos y el precio de ellos.
    public Expendedor(int numProducto, int precioProducto){
        this.precio = precioProducto;
        coca = new Deposito();
        sprite = new Deposito();
        snickers = new Deposito();
        super8 = new Deposito();
        dv = new DepositoVuelto();
        this.precio = precio;
              
        //Rellenar máquina con bebidas y dulces 
        for (int i = 0; i < numProducto; i++) { 
            CocaCola a= new CocaCola(100+i);
            coca.addBebida(a);
            Sprite b = new Sprite(200+i);
            sprite.addBebida(b);    
            Snickers s = new Snickers(300+i);
            snickers.addDulce(s);
            Super8 sup = new Super8(400+i);
            super8.addDulce(sup);
        }
    }
    
    public Producto comprarProducto(Moneda moneda, int tipo, int cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException{
        /*Vuelto en multiplos de 100*/
        switch(tipo){
            case 1: //si es tipo bebida entra a este switch
                Bebida bebida = null;
                //se verifica que se insertó una moneda
                if(moneda == null){ //no se insertó moneda
                    throw new PagoIncorrectoException("Inserte dinero para comprar");
                }
                else{ //moneda correcta
                    if(moneda.getValor() >= precio){
            
                        switch(cual){
                            case 1 : //si es cocacola
                                bebida = coca.getBebida();
                                if(bebida != null){ //si hay stock dicponible de cocacola
                                    //calcularVuelto
                                    int vuelto = moneda.getValor()- precio;
                                    while(vuelto > 0){
                                        dv.addMoneda(new Moneda100());
                                        vuelto = vuelto - 100;
                                    }
                                    return bebida;
                                }
                                else{ //si no hay stock se lanza excepción
                                    throw new NoHayProductoException("Bebida no disponible");
                                }
                            case 2 : //si es sprite
                                bebida = sprite.getBebida();
                                if(bebida != null){ //si hay sprite en stock
                                    //calcularVuelto
                                    int vuelto = moneda.getValor()- precio;
                                    while(vuelto > 0){
                                        dv.addMoneda(new Moneda100() );
                                        vuelto = vuelto - 100;
                                    }
                                    return bebida;
                                }
                                else{ //si no hay stock, se lanza excepción
                                    throw new NoHayProductoException("Bebida no disponible");
                                }  
                            //caso numero erroneo
                            default:
                                throw new NoHayProductoException("No hay bebida disponible");
                        } //switch
                    }
                else{ //excepcion si se ingresa una moneda de menor valor al de la bebida
                    throw new PagoIncorrectoException("Saldo insuficiente");
                }

            }  //else
        
        case 2: //si es tipo dulce entra a este switch
            Dulce dulce = null;
        
            if(moneda == null){ //si no se inserta moneda, lanza excepcion
                throw new PagoIncorrectoException("Inserte dinero para comprar");
            }
            else{ //si la moneda es correcta
                if(moneda.getValor() >= precio){
                    switch(cual){
                        case 1 : //si compra un snickers
                            dulce = snickers.getDulce();
                            if(dulce != null){ //si hay stock
                                //calcularVuelto
                                int vuelto= moneda.getValor()- precio;
                                while(vuelto > 0){
                                    dv.addMoneda(new Moneda100());
                                    vuelto = vuelto - 100;
                                }
                                return dulce;
                            }
                            //si no hay dulce en stock, se lanza excepcion
                            else{ 
                                throw new NoHayProductoException("Bebida no disponible");
                            }
                        case 2 : //si se compra un super8
                            dulce = super8.getDulce();
                            if(dulce != null){ //se verifica que haya stock
                            //calcularVuelto
                                int vuelto= moneda.getValor()- precio;
                                while(vuelto > 0){
                                    dv.addMoneda(new Moneda100() );
                                    vuelto = vuelto - 100;
                                }
                                return dulce;
                            }
                            else{ //no hay stock, se lanza excepcion
                                throw new NoHayProductoException("Bebida no disponible");
                            }  
                        //caso numero erroneo
                        default:
                            throw new NoHayProductoException("No hay bebida disponible");
                    } //switch
                } //if
                else{ //la moneda es de menos valor que un super8
                    throw new PagoIncorrectoException("Saldo insuficiente");
                }

            } //else
            default:
                 throw new NoHayProductoException("No hay producto disponible");
        }   
    }    
  
    //devuelve una moneda del deposito
    public Moneda getVuelto(){
        return dv.getMoneda();    
    }     
    
    //devuelve el precio de la bebida
    public int getPrecioBebida(){
        return this.precio;
    }
    
    //devuelve el precio del dulce
    public int getPrecioDulce(){
        return this.precio;
    }
}


package tareanro2;

abstract class Bebida extends Producto{
    private int serie; //codigo bebida
    
    //constructor de la clase bebida
    public Bebida(int serie){
        super(serie);
    }
    
    //obtiene/retorna el número de serie de la bebida
    public int getSerie(){
        return serie;
    }
    
    //obtiene/retorna el sabor de la bebida
    public abstract String sabor();
}

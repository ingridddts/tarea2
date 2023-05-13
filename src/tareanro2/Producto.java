package tareanro2;

abstract class Producto {
    private int serie;
    private int tipo;
    
    public Producto(int i){
        this.serie = i;
    }

    public int getSerie(){
        return serie;
    }
    
    public int getTipo(){
        return tipo;
    }
    public abstract String sabor();
        
}
package tareanro2;

//clase Dulce que hereda de clase producto. 
abstract class Dulce extends Producto{
    private int serie; //codigo dulce
    
    //constructor
    public Dulce(int serie){
        super(serie);
    }
    
    //obtiene/retorna el número de serie del dulce
    @Override
    public int getSerie(){
        return serie;
    }
    
    //obtiene/retorna el sabor del dulce (snickers, super8)
    @Override
    public abstract String sabor();
}


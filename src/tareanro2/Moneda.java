package tareanro2;

//clase abstracta que hereda 4 subclases: Moneda100, Moneda500, Moneda1000, Moneda1500
abstract class Moneda{
    public Moneda(){
        
    }
    
    //devuelve el numero de serie de la moneda
    public Moneda getSerie (){
        return this;
    }
    
    public abstract int getValor(); //retorna la cantidad que devuelve la moneda
}

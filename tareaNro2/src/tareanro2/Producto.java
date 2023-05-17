package tareanro2;
/**
 * Clase que define objetos que contienen tipos de productos (bebidas)
 * @param serie: contiene el codigo del producto
 * @param tipo: define el tipo de producto del cual se trata
 */
abstract class Producto {
    private int serie;
    private int tipo;
    
    public Producto(int i){
        this.serie = i;
    }

    /**
     * @return devuelve el número de serie del producto
     */
    public int getSerie(){
        return serie;
    }
    
    /**
     * @return devuelve el tipo de producto
     */
    public int getTipo(){
        return tipo;
    }
    
    public abstract String sabor();
        
}
package tareanro2;

import java.util.ArrayList;

class DepositoVuelto{
    private ArrayList<Moneda> deposito;
    
    //constructor, inicializa array tipo moneda
    public DepositoVuelto(){
        deposito = new ArrayList<Moneda>();
    }
    
    public void addMoneda(Moneda m){
        deposito.add(m);  //agrega una moneda al arraylist de tipo moneda  
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
}
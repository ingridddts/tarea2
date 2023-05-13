package tareanro2;

//Clase que hereda de clase abstracta dulce
public class Snickers extends Dulce{
   public  Snickers(int i){
        super(i);
}
    public String sabor(){
        String s= "Snickers";
        return s; //devuelve el nombre de su sabor
    }  
}

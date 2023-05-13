package tareanro2;

//Clase CocaCola que hereda de clase abstracta bebida
class CocaCola extends Bebida{
    //constructor clase CocaCola
    public CocaCola(int i){
        super(i);
    }
    //devuelve el sabor de la bebida, en ese caso coca cola
    public String sabor(){
        String s = "cocacola";
        return s;
    }
}
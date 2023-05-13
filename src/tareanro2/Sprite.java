package tareanro2;

//Clase que hereda de clase abstracta bebida
class Sprite extends Bebida{
    public  Sprite(int z){
        super(z);
}
    @Override
    //devuelve el nombre de su sabor
    public String sabor(){
        String s= "sprite";
        return s;
    }  
}

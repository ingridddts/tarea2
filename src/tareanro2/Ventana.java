package tareanro2;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana() throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        super();
        PanelPrincipal pp=new PanelPrincipal();
        this.setLayout(new BorderLayout());
        this.setTitle("Expendedora de Bebidas");
        this.add(pp);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100,900); 
        this.setVisible(true); 
    }
}
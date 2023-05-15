package tareanro2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelPrincipal extends JPanel implements MouseListener{
    private Comprador com;
    private Expendedor exp;
    
    public PanelPrincipal() throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        exp=new Expendedor(10,3000,600,120);
        com=new Comprador(exp,70,120);
        this.setBackground(Color.darkGray);
        this.addMouseListener(this);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        if(exp!=null)exp.paint(g);
        if(com!=null);com.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX()>=87 && e.getX()<=87+120 && e.getY()>=150 && e.getY()<=150+25){
            try {
                com.cualProducto(1,1);
            } catch (PagoIncorrectoException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PagoInsuficienteException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoHayProductoException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getX()>=87 && e.getX()<=87+120 && e.getY()>=180 && e.getY()<=180+25){
            try {
                com.cualProducto(1,2);
            } catch (PagoIncorrectoException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PagoInsuficienteException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoHayProductoException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getX()>=87 && e.getX()<=87+120 && e.getY()>=120+90 && e.getY()<=210+25){
            try {
                com.cualProducto(1,3);
            } catch (PagoIncorrectoException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PagoInsuficienteException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoHayProductoException ex) {
                Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if(e.getX()>=492 && e.getX()<=492+310 && e.getY()>=589 && e.getY()<= 589+80){
            if(SwingUtilities.isRightMouseButton(e)){
                while(com.getVuelto()!=null){
                    com.getVuelto();
                }
            }
            if(SwingUtilities.isLeftMouseButton(e)){
                com.getVuelto();
            }
        }
        if(e.getX()>= 830 && e.getX()<= 830+150 && e.getY()>=590 && e.getY()<=590+33){
            com.getBebida();
        }
        if(e.getX()>= 90 && e.getX()<= 90+50 && e.getY()>= 270 && e.getY()<= 270+50){
            com.addMoneda100();
        }
        if(e.getX()>=150 && e.getX()<=150+50 && e.getY()>=270 && e.getY()<= 270+50){
            com.addMoneda500();
        }
        if(e.getX()>=210 && e.getX()<=210+50 && e.getY()>=270 && e.getY()<= 270+50){
            com.addMoneda1000();
        }
        this.repaint();
    }
    

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) { 
    }

    @Override
    public void mouseExited(MouseEvent e) { 
    }
}

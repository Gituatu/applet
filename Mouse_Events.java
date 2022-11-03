import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Mouse_Events extends Applet implements MouseListener//, MouseMotionListener
{
    int x,y;
    String event;

    public void init(){
        addMouseListener(this);
        //addMouseMotionListener(this);
    }

    public void paint(Graphics g){
        g.drawString("Mouse is "+event+ "at : " +x+"," +y , x, y);
        //g.fillOval(x, y, 50, 50);
    }

    public void mousePressed(MouseEvent e){
        x= e.getX();
        y= e.getY();
        event= "pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e){
        x= e.getX();
        y= e.getY();
        event= "released";
        repaint();
    }

    public void mouseClicked(MouseEvent e){
        x= e.getX();
        y= e.getY();
        event= "clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent e){
        showStatus("Mouse entered applet area");
    }

    public void mouseExited(MouseEvent e){
        showStatus("Mouse exited applet area");
    }

    public void mouseMoved(MouseEvent e){
        x= e.getX();
        y= e.getY();
        event= "moving";
        repaint();
    }

    public void mouseDragged(MouseEvent e){
        x= e.getX();
        y= e.getY();
        event= "dragging";
        repaint();
    }

    /*public void update(Graphics g){
        paint(g);
    }*/
}

/*<applet code="Mouse_Events" width=200 height=60></applet>*/
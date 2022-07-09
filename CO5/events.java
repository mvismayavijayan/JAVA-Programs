import java.awt.*;
import java.awt.event.*;
public class events extends Frame implements MouseListener,MouseMotionListener{
  Label l=new Label();
   events() {
     addMouseListener(this);
     addMouseMotionListener(this);
     l.setBounds(100,100,100,200);
     add(l);
     setSize(300,300);
     setLayout(null);
     setVisible(true);
  }
public void mouseEntered(MouseEvent me) {
      setBackground(Color.red);
         l.setText("Mouse entered");
   }
public void mouseExited(MouseEvent me) {
   
    setBackground(Color.red);
      l.setText("Mouse Exited");
     
   }
public void mousePressed(MouseEvent me) {
 
       
    setBackground(Color.yellow);
      l.setText("Mouse pressed");
     
   }
public void mouseReleased(MouseEvent me) {
 
       
    setBackground(Color.green);
      l.setText("Mouse released");
     
   }
public void mouseMoved(MouseEvent me) {
 
       
    setBackground(Color.cyan);
      l.setText("Mouse moved");
     
   }
public void mouseDragged(MouseEvent me) {
 
       
    setBackground(Color.white);
      l.setText("Mouse dragged");
     
   }

public void mouseClicked(MouseEvent me) {
 
       
   
      l.setText("Mouse clicked");
     
   }

public static void main (String args[]) {

new events();

}
}

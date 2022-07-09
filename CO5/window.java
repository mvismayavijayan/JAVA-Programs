import java.awt.*;
import java.awt.event.*;
public class window extends Frame implements WindowListener{
   window() {
     addWindowListener(this);
     setSize(300,300);
     setLayout(null);
     setVisible(true);
  }

 public void windowClosed(WindowEvent e) {
      System.out.println("window closed");
   }
 public void windowClosing(WindowEvent e) {
      System.out.println("closing the window");
   }
 public void windowDeactivated(WindowEvent e) {
      System.out.println("window Deacivated");
   }
public void windowActivated(WindowEvent e) {
      System.out.println("window Acivated");
   }
 public void windowDeiconified(WindowEvent e) {
      System.out.println("window Deiconified");
   }
 public void windowIconified(WindowEvent e) {
      System.out.println("window Iconified");
   }
 public void windowOpened(WindowEvent e) {
      System.out.println("window opened");
   }

public static void main (String args[]) {

new window();
}
}

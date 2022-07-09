import java.awt.*;
import java.awt.event.*;
public class key extends Frame implements KeyListener{
   key() {
    TextArea area=new TextArea();
     area.setBounds(20,80,300,300);
     area.addKeyListener(this);
     add(area);
     setSize(300,300);
     setLayout(null);
     setVisible(true);
  }

 public void keyPressed(KeyEvent ke) {
      System.out.println("key pressed");
   }
 public void keyReleased(KeyEvent ke) {
      System.out.println("key released");
   }
 public void keyTyped(KeyEvent ke) {
       String msg="hello everyone";
        msg+=ke.getKeyChar();
      System.out.println("key typed");
   }
public static void main (String args[]) {

new key();
}
}

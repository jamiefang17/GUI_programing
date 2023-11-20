import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Hello World!");//create a instance need to use new.

        JFrame window = new JFrame();
        window.setSize(500,500);
        window.setLocation(600,600);
        window.setVisible(true);

        TestJFRame test = new TestJFRame();

        
    
    }
}
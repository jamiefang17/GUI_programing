import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class MyJPanel extends JPanel{
    
    @Override
    protected void paintComponenet(Graphics g){
        super.paintComponent(g);
        g.setColor(getBackground(Color.BLACK));
    
        g.drawString("Hello World"，20， 30)；
    }
}

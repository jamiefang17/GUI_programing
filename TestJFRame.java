import javax.swing.JFrame;

public class TestJFRame extends JFrame{


    public TestJFRame() {
        super("GUI Test");
        setContentPane(new MyJPanel());
        setSize(600,600);
        setLocation(500,500);
        setVisible(true);
    }
}

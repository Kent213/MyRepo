import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
public class GUI{

    private int count = 0;
    
    public GUI(){
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton("Click Me");
    JLabel label = new JLabel("Number of Clicks: 0");

    panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
    panel.setLayout(new GridLayout(0,1));
    panel.add(button);
    panel.add(label);

    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("My GUI");
    frame.pack();
    frame.setVisible(true);
}

    public static void Main (String[] args){
        new GUI();
    }
}
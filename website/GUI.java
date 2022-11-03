import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JFrame implements ActionListener{
private JFrame frame;
private JPanel panel;
private JButton button;
private JLabel label;
    private int count = 0;

    public GUI(){
    frame = new JFrame();
    panel = new JPanel();
    button = new JButton("Click Me");
    button.addActionListener(this);
    label = new JLabel("Number of Clicks: 0");

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
    public static void main(String[] args){
        new GUI();
    }

    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of clicks: " + count);
    }
}
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JFrame implements ActionListener{
private JFrame frame;
private JPanel panel;
private JButton button;
private JLabel label;
private JLabel labelTwo;
private int count = 0;

    public GUI(){
    frame = new JFrame();
    panel = new JPanel();
    button = new JButton("Don't Click Me");
    button.addActionListener(this);
    label = new JLabel("");
    labelTwo = new JLabel("");


    panel.setBorder(BorderFactory.createEmptyBorder(25,40,10,40));
    panel.setLayout(new GridLayout(0,1));
    panel.add(button);
    panel.add(labelTwo);
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
        labelTwo.setText(labelTwo.getText()+"D: ");
    }
}
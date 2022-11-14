package DST;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GamePanel extends  JPanel implements ActionListener{
    static final int boardHeight = 650;
    static final int boardWidth = 650;
    static final int unitSize = 25;
    final int delay = 10;
    private Timer timer;
    boolean running = true;
    int xPosition = 50;
    int yPosition = 50;
    int dx;
    int dy;
    GamePanel(){
        this.setPreferredSize(new Dimension(boardWidth,boardWidth));
        this.setBackground(Color.black);
        this.setFocusable(false);
        timer = new Timer(delay, this);
        timer.start();

    }
    public void draw (Graphics g) {
        g.setColor(Color.red);
        g.fillOval(xPosition, yPosition, unitSize, unitSize);
    }
    public void move(){
        xPosition += dx;
        yPosition += dy;
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT){
            dx = -2;
        }
        if(key == KeyEvent.VK_RIGHT){
            dx = 2;
        }
        if(key == KeyEvent.VK_UP){
            dy = 2;
        }
        if(key == KeyEvent.VK_DOWN){
            dy = -2;
        }

    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT){
            dx = 0;
        }
        if(key == KeyEvent.VK_RIGHT){
            dx = 0;
        }
        if(key == KeyEvent.VK_UP){
            dy = 0;
        }
        if(key == KeyEvent.VK_DOWN){
            dy = 0;
        }
    }
    public void actionPerformed(ActionEvent e){
        move();
    }
    public static void main (String[] args){
        new GameFrame();
    }
}

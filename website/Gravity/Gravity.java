import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.Timer;
public class Gravity implements ActionListener{

    private int delay = 0;
    private Timer timer; 
    private ArrayList <String> terms = new ArrayList<String>();
    private ArrayList <String> answers = new ArrayList<String>();
    private String current;
    private int index;
    private int score = 0;
    private Scanner scan = new Scanner(System.in);

    public void createSet(){
        System.out.println("Press anything to conintue");
        while(!scan.nextLine().equals("q")){
            System.out.println("Please enter your term:");
            terms.add(scan.nextLine());
            System.out.println("Please enter your answer:");
            answers.add(scan.nextLine());
            System.out.println("Press any button to continue or press 'q' to confirm your study set");

        }
        System.out.println("How many seconds would you like per term?");
        delay = scan.nextInt()*1000;
        timer = new Timer(delay,this);
    }

    public void displayTerm(){
        //make them do line below
        index = (int)(Math.random()*terms.size());
        current = terms.get(index);
        System.out.println("Your term is: " + current);
        guess();
    }

    private void guess(){
        timer.start();
        //make them do some stuff below
        while(!scan.nextLine().equals(answers.get(index))){
            scan.nextLine();
        }
            score+=100;
            System.out.println("Your score is: " + score);
            displayTerm();
            timer.restart();
    }


    public void actionPerformed(ActionEvent e) {
        System.out.println("Game Over");
        System.exit(0);
    }
}

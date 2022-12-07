import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.Timer;
public class incompleteGravity implements ActionListener{

    private int delay = 0;
    private Timer timer; 
    private String current;
    private int index;
    private int score = 0;
    private Scanner scan = new Scanner(System.in);
    //please complete the ArrayLists
    private ArrayList <> terms = new ArrayList<>();
    private ArrayList <> answers = new ArrayList<>();

    public void createSet(){
        System.out.println("Press anything to conintue");
        while(!scan.nextLine().equals("q")){
            System.out.println("Please enter your term:");
            //add what is stored in the scanner to the terms array list

            System.out.println("Please enter your answer:");

            //add what is stored in the scanner to the answers array list

            System.out.println("Press any button to continue or press 'q' to confirm your study set");

        }
        System.out.println("How many seconds would you like per term?");
        delay = scan.nextInt()*1000;
        timer = new Timer(delay,this);
    }

    public void displayTerm(){
        //sets index equal to a random index of the terms array
        index = (int)(Math.random()*terms.size());

        //TODO: set current equal to the term at the index above
        current = ???;
        System.out.println("Your term is: " + current);
        guess();
    }

    private void guess(){
        timer.start();
        //make them do some stuff below
        while(!scan.nextLine().equals(/*fill in here*/)){
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


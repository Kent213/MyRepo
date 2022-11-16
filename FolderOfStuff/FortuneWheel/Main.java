package FolderOfStuff.FortuneWheel;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void gameSetup(){
        System.out.println("Player 1 please enter your name: ");
        Player player1 = new Player("temp", 0);
        player1.setName(scan.nextLine());
        System.out.println("Player 1 please enter your name: ");
        Player player2 = new Player("temp", 0);
        player2.setName(scan.nextLine());
    }
    
    public static void main(String args[]){
        
        WheelGamePanel.rewrite();
        player1.guessing();
    }
}

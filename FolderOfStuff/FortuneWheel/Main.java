package FolderOfStuff.FortuneWheel;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static boolean invalid = true;
    private static String input;
    
    public static void main(String args[]){
        WheelGamePanel game = new WheelGamePanel(new Player("temp", 0),new Player("temp", 0));
        game.gameSetup();
        game.rewrite();
        while(game.getRunning()){
            while(game.getTurn()){
                System.out.println(game.player1.getName() + "'s turn: (GUESS) (SOLVE)");
                while(invalid){
                    input = scan.nextLine().toUpperCase();
                    if(input.equals("GUESS")){
                        game.guessing();
                        break;
                    }
                    else if(input.equals("SOLVE")){
                        game.solvePhrase();
                        break;
                    }
                    else{
                        System.out.println("Invalid input. Please try again.");
                    }
                }
            }
            while(!game.getTurn()){
                System.out.println(game.player2.getName() + "'s turn: (GUESS) (SOLVE)");
                game.guessing();
            }
        }
    }
}

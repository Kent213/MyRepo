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
        System.out.println(game.getRunning());
            if(game.getTurn()){
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
            if(!game.getTurn()){
                System.out.println(game.player2.getName() + "'s turn: (GUESS) (SOLVE)");
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
        }
        System.out.println("Congratulations, " + game.player1.getName() + " won $" + game.player1.getScore());
        System.out.println("Congratulations, " + game.player2.getName() + " won $" + game.player2.getScore());
        
    }
}

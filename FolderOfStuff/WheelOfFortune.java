package FolderOfStuff;

import java.util.Random;
import java.util.Scanner;
public class WheelOfFortune {
    int totalScore;
    boolean currentTurn = true;
    Scanner scan = new Scanner(System.in);

        public void setup(){
    System.out.println("How many players do you have?");
    int numPlayers = scan.nextInt();
        for(int i = 1; i<numPlayers;i++){
            System.out.println("Player" + i + " please enter your name:");
            
        }


    }
        
    public class spinner{
        int spinScore = 0;
        public void spin(){
            spinScore = (int)(Math.random()*17);
            if(spinScore!=16){
            spinScore*=1000;
            }else{
                System.out.println("You are bankrupt");
                //end turn
            }
        }
        private int getSpin(){
            return spinScore;
        }
    }

    public class displayGuesses{
        String phrase;
        String display;
        public void rewrite(){
            while(phrase.contains(" ")){
                display += phrase.substring(0,phrase.indexOf(" "));
                phrase.replaceFirst(" ", "");
            }
        }
    }

    public static void main(String args[]){
        
    }
}

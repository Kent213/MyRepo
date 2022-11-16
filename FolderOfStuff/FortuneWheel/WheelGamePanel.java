package FolderOfStuff.FortuneWheel;
import java.util.Scanner;
public class WheelGamePanel extends Player{
    //make all of these not static later
        static final String phrase = "Hi my name is Kent";
        static String tempPhrase;
        static String display = "";
        static Scanner scan = new Scanner(System.in);
        static String guess;
        static int guessIndex;
        static int displayIndex;
        static int numHits;
        static int spinScore;
        boolean running;
        boolean turn;

        Player player1 = new Player("temp", 0);
        Player player2 = new Player("temp", 0);
        public void gameSetup(){
            System.out.println("Player 1 please enter your name: ");
            player1.setName(scan.nextLine());
            System.out.println("Player 1 please enter your name: ");
            player2.setName(scan.nextLine());
        }
        
        public static void rewrite(){
            //add an extra space so it gets the last word
            tempPhrase = phrase + " ";
            while(tempPhrase.contains(" ")){
                for(int i = 0; i < tempPhrase.indexOf(" "); i++){
                    display += "_ ";
                }
                tempPhrase = tempPhrase.substring(tempPhrase.indexOf(" ")+1,tempPhrase.length());
                display += "  ";
            }
            //gets rid of extra space at the end
            display = display.substring(0,display.length()-1);
            System.out.println(display);
    }
       
        public void guessing(){
            tempPhrase = "";
            for(int i = 0; i<phrase.length(); i++){
                tempPhrase += phrase.substring(i,i+1) + " ";
            }
            tempPhrase = tempPhrase.toUpperCase();
            System.out.println(tempPhrase);
            while(display.contains("_")){
            System.out.println("Please guess a letter");
            guess = scan.nextLine().toUpperCase();
            if(tempPhrase.contains((guess))){
                while(tempPhrase.contains((guess))){
                  guessIndex = tempPhrase.indexOf(guess);
                  display = display.substring(0,guessIndex) + guess + display.substring(guessIndex+1,tempPhrase.length());
                  tempPhrase = tempPhrase.replaceFirst(guess,"~");
                  numHits++;
                }
            }
            else{
                System.out.println("Sorry, that was not in the phrase.");
            }
            System.out.println(display);
            System.out.println(tempPhrase);
        }
    }
    public static void solvePhrase(){
        if(scan.nextLine().equals(phrase)){
            //win
        }
        else{
            //lose turn
        }
    }
    
public int spinner(){
        int spinScore = 0;
        spinScore = (int)(Math.random()*16);
        if(spinScore!=0){
            spinScore*=1000;
        }else{
            System.out.println("You are bankrupt");
            //player.setScore(0)
            //ends turn
        }
        return spinScore;
}



    public void playing(){
        while(running){
            if(turn){
               //player1.guessing();
            }
            else{
               //player 2 guesses
            }
        }
    }

    

    public static void main(String args[]){
        
    }
}

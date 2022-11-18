package FolderOfStuff.FortuneWheel;
import java.util.Scanner;
public class WheelGamePanel{
    //make all of these not static later
        private final String phrase = "This is my super duper unbreakable military grade encrypted secret message that you will never guess";
        private String tempPhrase;
        private String display = "";
        private Scanner scan = new Scanner(System.in);
        private String guess;
        private int guessIndex;
        private int numHits;
        private int spinScore;
        private int score;
        private boolean running = true;
        private boolean turn = true;
        
        Player player1 = new Player("temp", 0);
        Player player2 = new Player("temp", 0);
        public WheelGamePanel(Player a, Player b){
            player1 = a;
            player2 = b;
        }
        
        public void gameSetup(){
            System.out.println("Player 1 please enter your name: ");
            player1.setName(scan.nextLine());
            System.out.println("Player 2 please enter your name: ");
            player2.setName(scan.nextLine());
        }
        
        public void rewrite(){
            //add an extra space so it finds the last word
            tempPhrase = phrase + " ";
            while(tempPhrase.contains(" ")){
                for(int i = 0; i < tempPhrase.indexOf(" "); i++){
                    display += "_ ";
                }
                tempPhrase = tempPhrase.substring(tempPhrase.indexOf(" ")+1,tempPhrase.length());
                display += "  ";
            }
            //delete extra space at the end
            display = display.substring(0,display.length()-1);
            System.out.println(display);
    }
       
        public void guessing(){
            if(display.contains("_")){
                tempPhrase = "";
                guess = "";
            for(int i = 0; i<phrase.length(); i++){
                tempPhrase += phrase.substring(i,i+1) + " ";
            }
            tempPhrase = tempPhrase.toUpperCase();
            //System.out.println(tempPhrase);
            //while(display.contains("_")){
            spin();
            if(spinScore!=0){
            numHits = 0;
                while(guess.length()!=1){
            System.out.println("Please guess a letter");
            guess = scan.nextLine().toUpperCase();
                }
            if(tempPhrase.contains((guess))){
                //updates display and finds number of occurances of guess
                while(tempPhrase.contains((guess))){
                  guessIndex = tempPhrase.indexOf(guess);
                  display = display.substring(0,guessIndex) + guess + display.substring(guessIndex+1,tempPhrase.length());
                  tempPhrase = tempPhrase.replaceFirst(guess,"~");
                  numHits++;
                }
                calculateScore();
            }
            else{
                System.out.println("Sorry, that was not in the phrase.");
                System.out.println(player1.getName() + "'s score: " + player1.getScore());
                System.out.println(player2.getName() + "'s score: " + player2.getScore());
                if(turn){
                    turn = false;
                }
                else{
                    turn = true;
                }
            }
            System.out.println(display);
        }
    }
        else{
            running = false;
        }
}
    public void solvePhrase(){
        spin();
        System.out.println("What is the phrase?");
        //if guess is correct
        if(scan.nextLine().toUpperCase().equals(phrase.toUpperCase())){
            for(int i = 0; i<display.length(); i++){
                if(display.charAt(i)=='_'){
                    numHits++;
                }
            }
            calculateScore();
            //prints out filled out display
            tempPhrase = "";
            for(int i = 0; i<phrase.length(); i++){
                tempPhrase += phrase.substring(i,i+1) + " ";
            }
            tempPhrase = tempPhrase.toUpperCase();
            System.out.println(tempPhrase);
            running = false;
        }
        else{
            System.out.println("Sorry that is incorrect");
            if(turn){
                turn = false;
            }
            else{
                turn = true;
            }
        }
    }
    
    public void spin(){
        spinScore = (int)(Math.random()*16);
        if(spinScore!=0){
            spinScore*=100;
        }else{
            System.out.println("You are bankrupt");
            player1.setScore(0);
            //swaps turns
            if(turn){
                turn = false;
            }
            else{
                turn = true;
            }
        }
        System.out.println("You spun a " + spinScore);
    }
       public boolean getTurn(){
        return turn;
       }

       public boolean checkRunning(){
        if(display.contains("_")){
            running = true;
        }
        else{
            running = false;
        }
        return running;
       }
       public boolean getRunning(){
        return running;
       }
public String getDisplay(){
    return display;
}
       public void calculateScore(){
        //adds score
        if(spinScore!=0){
        System.out.println("numhits: " + numHits);
        score = spinScore*numHits;
            if(turn){
                player1.setScore(player1.getScore() + score);
            }
            else{
                player2.setScore(player2.getScore() + score);
            }
        }
        //bankrupt
        else{
            if(turn){
                player1.setScore(0);
            }
            else{
                player2.setScore(0);
            }
        }
            System.out.println(player1.getName() + "'s score: " + player1.getScore());
            System.out.println(player2.getName() + "'s score: " + player2.getScore());
    }
}

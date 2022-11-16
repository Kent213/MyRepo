package FolderOfStuff.FortuneWheel;
import java.util.Scanner;
public class WheelGamePanel{
    //make all of these not static later
         final String phrase = "Hi my name is Kent";
         String tempPhrase;
         String display = "";
         Scanner scan = new Scanner(System.in);
         String guess;
         int guessIndex;
         int displayIndex;
         int numHits;
         int spinScore;
        boolean running;
        boolean turn;

        public WheelGamePanel(){
        }
        //obj creation and game setup
        WheelGamePanel user1 = new WheelGamePanel();
        WheelGamePanel user2 = new WheelGamePanel();
        Player player1 = new Player("temp", 0);
        Player player2 = new Player("temp", 0);
        public void gameSetup(){
            System.out.println("Player 1 please enter your name: ");
            player1.setName(scan.nextLine());
            System.out.println("Player 1 please enter your name: ");
            player2.setName(scan.nextLine());
        }
        //I want this to be static
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
    public void solvePhrase(){
        if(scan.nextLine().equals(phrase)){
            //fill out entire phrase
            running = false;
            System.out.println("Game Over");
        }
        else{
            if(turn){
                turn = false;
            }
            else{
                turn = true;
            }
        }
    }
    
public int spin(){
        int spinScore = 0;
        spinScore = (int)(Math.random()*16);
        if(spinScore!=0){
            spinScore*=1000;
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
        return spinScore;
}

    public void playing(){
        while(running){
            while(turn){
                user1.spin();
                user1.guessing();
                player1.setScore(player1.getScore()+(spinScore*numHits));
            }
            while(!turn){
                user2.spin();
                user2.guessing();
                player2.setScore(player1.getScore()+(spinScore*numHits));
            }
        }
    }
    

    public static void main(String args[]){
        
    }
}

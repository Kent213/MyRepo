package FolderOfStuff;
import java.util.Scanner;
public class test {

        static final String phrase = "Hi my name is Kent";
        static String tempPhrase;
        static String display = "";
        static Scanner scan = new Scanner(System.in);
        static String guess;
        static int guessIndex;
        static int displayIndex;

        public static void rewrite(){
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
        //code guessing letters here
        public static void guessing(){
            tempPhrase = "";
            for(int i = 0; i<phrase.length(); i++){
                tempPhrase += phrase.substring(i,i+1) + " ";
            }
            tempPhrase = tempPhrase.toUpperCase();
            System.out.println(tempPhrase);
            System.out.println("Please guess a letter");
            guess = scan.nextLine().toUpperCase();
            if(tempPhrase.contains((guess))){
                while(tempPhrase.contains((guess))){
                  guessIndex = tempPhrase.indexOf(guess);
                  display = display.substring(0,guessIndex) + guess + display.substring(guessIndex+1,tempPhrase.length());
                  tempPhrase = tempPhrase.replaceFirst(guess,"~");
                }
            }
            else{
                System.out.println("Sorry, that was not in the phrase.");
            }
            System.out.println(display);
            System.out.println(tempPhrase);
        }
    public static void main(String args[]){
        rewrite();
        guessing();
    }
}

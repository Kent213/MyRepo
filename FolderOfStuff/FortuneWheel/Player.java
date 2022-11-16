package FolderOfStuff.FortuneWheel;

import java.util.Scanner;
public class Player {
    int totalScore;
    String name;
    int score;
    boolean turn = true;
    static Scanner scan = new Scanner(System.in);

    public Player(){

    }

        public Player(String name, int score){
            this.name = name;
            this.score = score;
        }

        public void setName(String name){
            this.name = name;
        }
        public void setScore(int score){
            this.score = score;
        }
        public String getName(){
            return name;
        } 
        public int getScore(){
            return score;
        } 

        

    public static void main(String args[]){
        
    }
}

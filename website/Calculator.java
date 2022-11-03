import java.util.Scanner;
class Calculator{
/*
    TO-DO
 * Parenthesis
 * Exponent
 * Muliplication
 * Division
 * Addition
 * Subtraction
 * Recursion - ?
 */
static Scanner scan = new Scanner(System.in);
private static double firstNum;
private static double secondNum;
private static double answer;
private static int temp;
static String equation;

public static void calculate(){
System.out.println("What would you like to calculate?");
equation = scan.nextLine();
equation = equation.replace(" ", "");
checkProgress();
}
public static void checkProgress(){
    try{
        answer = Double.parseDouble(equation);
        System.out.println(answer);
    }
    catch(NumberFormatException ex){
        doMath();
    }
}
public static void checkParenthesis(){

}
public static void doAddition(){
    while(equation.indexOf("+")!=-1){
    temp = equation.indexOf("+")-1;

        //finds end index of first number
        
        while(Character.isDigit(equation.charAt(temp))||equation.substring(temp--,temp).equals(".")){
            //temp--;
            //keeps going out of bounds
        }
    }
        //creates first number
        //firstNum = Double.parseDouble(equation.substring(temp, equation.indexOf("+")));
}

public static void doSubtraction(){

}
public static void doMultiplication(){

}
public static void doDivision(){

}
public static void doExponent(){

}
public static void doMath(){
doExponent();
doMultiplication();
doDivision();
doAddition();
doSubtraction();
}
public static void main(String[] args){
calculate();
}
}
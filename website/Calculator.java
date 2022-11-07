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
//have not used arrays below
static String[] numbers = new String[]{"1","2","3","4","5","6","7","8","9","0","."};
static String[] operands = new String[]{"+","-","*","/","^","(",")"};

public static void calculate(){
System.out.println("What would you like to calculate?");
equation = scan.nextLine();
equation = equation.replace(" ", "");
equation = equation.replace("--", "+");
equation = equation.replace("+-", "-");
System.out.println("Equation: " + equation);
doMath();
//another method to code it
//add all terms to an array list and seperate numbers and operators

}
//idk rly know what this is for - maybe to check if invalid input
public static void checkProgress(){
    try{
        answer = Double.parseDouble(equation);
        System.out.println("Answer: " + answer);
    }
    catch(NumberFormatException ex){
        doMath();
    }
}

public static void checkParenthesis(){

}

public static void doAddition(){
    if(equation.indexOf('+')!=-1){
    temp = equation.indexOf('+')-1;

        //finds end index of first number
        while(Character.isDigit(equation.charAt(temp))||equation.substring(temp--,temp).equals(".")){
            if(temp-1>=0){
                temp--;
            } 
            else{
                break;
            }
            //might need more conditions for else - break statement
        }
        //creates first number
        firstNum = Double.parseDouble(equation.substring(temp, equation.indexOf('+')));
        System.out.println("1st = " + firstNum);

        temp = equation.indexOf('+')+1;

        //finds end index of first number
        while(Character.isDigit(equation.charAt(temp))||equation.substring(temp,temp++).equals(".")){
            if(temp++<equation.length()-1){
                temp++;
            System.out.println("temp = " + temp);
            } 
            else{
                break;
            }
            //might need more conditions for else - break statement
        }
        //creates first number
        secondNum = Double.parseDouble(equation.substring(equation.indexOf('+')+1,temp));
        System.out.println("2nd = " + secondNum);
        answer = firstNum+=secondNum;
        System.out.println("answer = " + answer);

    }
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
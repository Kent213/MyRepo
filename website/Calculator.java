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
private static int firstIndex;
private static int secondIndex;
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

public static void quadraticSolver(){
    double a = 1;
    double b = 0;
    double c = 0;
    System.out.println("Quadratic Calculator: ax^2+bx+c");
    System.out.println("Please Enter a: ");
    a = scan.nextDouble();
    System.out.println("Please Enter b: ");
    b = scan.nextDouble();
    System.out.println("Please Enter c: ");
    c = scan.nextDouble();
    //formula
    double root1 = -b+Math.sqrt(b*b-4*a*c)/(2*a);
    double root2 = -b-Math.sqrt(b*b-4*a*c)/(2*a);
    System.out.println("The roots of " + a + "(x^2) + " + b + "x + " + c + " are: " + root1 + ", " + root2);

}

public static void doAddition(){
    boolean beginning = false;
    while(equation.indexOf('+')!=-1){
        firstIndex = equation.indexOf('+')-1;
        //finds end index of first number
        while(Character.isDigit(equation.charAt(firstIndex))||equation.charAt(firstIndex)==('.')){
            if(firstIndex==1){
                firstIndex--;
                break;
            } 
            else if(firstIndex>0){
                firstIndex--;
            }
            else{
                break;
            }
        }
        if(firstIndex == 0){
            beginning = true;
        }
        //creates first number
        firstNum = Double.parseDouble(equation.substring(firstIndex, equation.indexOf('+')));
        System.out.println("firstIndex = " + firstIndex);
        System.out.println("firstNum = " + firstNum);

        secondIndex = equation.indexOf('+')+1;
        //finds end index of first number
        while(Character.isDigit(equation.charAt(secondIndex))||equation.charAt(secondIndex)==('.')||equation.charAt(secondIndex)==('-')){
            if(secondIndex==equation.length()-1){
                secondIndex++;
                break;
            }
            else if(secondIndex<equation.length()){
                secondIndex++;
            } 
            else{
                break;
            }
            //might need more conditions for else - break statement
        }
        //creates second number
        secondNum = Double.parseDouble(equation.substring(equation.indexOf('+')+1,secondIndex));
        System.out.println("secondIndex = " + secondIndex);
        System.out.println("secondNum = " + secondNum);

        //adds two numbers
        answer = (firstNum+secondNum);
        System.out.println("answer = " + answer);
        System.out.println("firstIndex: " + firstIndex + " " + "secondIndex: " + secondIndex + " " + "Boolean: " + beginning);

        //rewrites equation
            if(!beginning){
            equation = equation.substring(0,firstIndex+1)+answer+equation.substring(secondIndex,equation.length());
            }
            else{
            equation = answer+equation.substring(secondIndex,equation.length());
            }
        System.out.println("Equation: " + equation);
        System.out.println("----------------------------");
    }
}

public static void doSubtraction(){
    boolean putBack = false;
    if(equation.indexOf("-")==0){
        putBack = true;
        equation = equation.replaceFirst("-","");
    }
    equation = equation.replace("-","+-");
    if(putBack){
        equation = "-"+equation;
    }
    System.out.println("Equation: " + equation);
}

public static void doMultiplication(){
    boolean beginning = false;
    while(equation.indexOf('*')!=-1){
        firstIndex = equation.indexOf('*')-1;
        //finds end index of first number
        while(Character.isDigit(equation.charAt(firstIndex))||equation.charAt(firstIndex)==('.')){
            if(firstIndex==1){
                firstIndex--;
                break;
            } 
            else if(firstIndex>0){
                firstIndex--;
            }
            else{
                break;
            }
        }
        if(firstIndex == 0){
            beginning = true;
        }
        System.out.println("firstIndex = " + firstIndex);
        //creates first number
        firstNum = Double.parseDouble(equation.substring(firstIndex, equation.indexOf('*')));
        System.out.println("firstNum = " + firstNum);

        secondIndex = equation.indexOf('*')+1;
        //finds end index of first number
        while(Character.isDigit(equation.charAt(secondIndex))||equation.charAt(secondIndex)==('.')||equation.charAt(secondIndex)==('-')){
            if(secondIndex==equation.length()-1){
                secondIndex++;
                break;
            }
            else if(secondIndex<equation.length()){
                secondIndex++;
                System.out.println("2nd index = " + secondIndex);
            } 
            else{
                break;
            }
        }
        System.out.println("secondIndex = " + secondIndex);

        //creates second number
        secondNum = Double.parseDouble(equation.substring(equation.indexOf('*')+1,secondIndex));
        System.out.println("secondNum = " + secondNum);

        answer = (firstNum*secondNum);
        System.out.println("answer = " + answer);
        System.out.println("firstIndex: " + firstIndex + " " + "secondIndex: " + secondIndex + " " + "Boolean: " + beginning);

        if(!beginning){
            if(equation.charAt(firstIndex)==('-')){
                equation = equation.substring(0,firstIndex) + "+" + answer + equation.substring(secondIndex, equation.length());
            }
            else{
                equation = equation.substring(0,firstIndex+1)+answer+equation.substring(secondIndex,equation.length());
            }
        }
        else{
        equation = answer+equation.substring(secondIndex,equation.length());
        }
        System.out.println("Equation: " + equation);
        System.out.println("----------------------------");
    } 
}

public static void doDivision(){
    boolean beginning = false;
    while(equation.indexOf('/')!=-1){
        firstIndex = equation.indexOf('/')-1;
        //finds end index of first number
        while(Character.isDigit(equation.charAt(firstIndex))||equation.charAt(firstIndex)==('.')){
            if(firstIndex==1){
                firstIndex--;
                break;
            } 
            else if(firstIndex>0){
                firstIndex--;
            }
            else{
                break;
            }
        }
        if(firstIndex == 0){
            beginning = true;
        }
        System.out.println("firstIndex = " + firstIndex);
        //creates first number
        firstNum = Double.parseDouble(equation.substring(firstIndex, equation.indexOf('/')));
        System.out.println("firstNum = " + firstNum);

        secondIndex = equation.indexOf('/')+1;
        //finds end index of first number
        while(Character.isDigit(equation.charAt(secondIndex))||equation.charAt(secondIndex)==('.')||equation.charAt(secondIndex)==('-')){
            if(secondIndex==equation.length()-1){
                secondIndex++;
                break;
            }
            else if(secondIndex<equation.length()){
                secondIndex++;
                System.out.println("2nd index = " + secondIndex);
            } 
            else{
                break;
            }
        }
        System.out.println("secondIndex = " + secondIndex);

        //creates second number
        secondNum = Double.parseDouble(equation.substring(equation.indexOf('/')+1,secondIndex));
        System.out.println("secondNum = " + secondNum);

        answer = (firstNum/secondNum);
        System.out.println("answer = " + answer);
        System.out.println("firstIndex: " + firstIndex + " " + "secondIndex: " + secondIndex + " " + "Boolean: " + beginning);

        System.out.println("LOOK HERE: " + equation.charAt(firstIndex));
        if(!beginning){
            if(equation.charAt(firstIndex)==('-')){
                equation = equation.substring(0,firstIndex) + "+" + answer + equation.substring(secondIndex, equation.length());
            }
        else{
            equation = equation.substring(0,firstIndex+1)+answer+equation.substring(secondIndex,equation.length());
        }
    }
        else{
        equation = answer+equation.substring(secondIndex,equation.length());
        }
        
        System.out.println("Equation: " + equation);
        System.out.println("----------------------------");
    }
}

public static void doExponent(){
    boolean beginning = false;
    while(equation.indexOf('^')!=-1&&equation.indexOf('^')!=0){
        firstIndex = equation.indexOf('^')-1;
        //finds end index of first number
        while(Character.isDigit(equation.charAt(firstIndex))||equation.charAt(firstIndex)==('.')){
            //have to check if first number is negative
            if(firstIndex==1){
                firstIndex--;
                break;
            } 
            else if(firstIndex>0){
                firstIndex--;
            }
            else{
                break;
            }
            //might need more conditions for else - break statement
        }
        if(firstIndex == 0){
            beginning = true;
        }
        //creates first number
        firstNum = Double.parseDouble(equation.substring(firstIndex, equation.indexOf('^')));
        System.out.println("firstIndex = " + firstIndex);
        System.out.println("firstNum = " + firstNum);

        secondIndex = equation.indexOf('^')+1;
        //finds end index of first number
        while(Character.isDigit(equation.charAt(secondIndex))||equation.charAt(secondIndex)==('.')||equation.charAt(secondIndex)==('-')){
            if(secondIndex==equation.length()-1){
                secondIndex++;
                break;
            }
            else if(secondIndex<equation.length()){
                secondIndex++;
            } 
            else{
                break;
            }
            //might need more conditions for else - break statement
        }
        //creates second number
        secondNum = Double.parseDouble(equation.substring(equation.indexOf('^')+1,secondIndex));
        System.out.println("secondIndex = " + secondIndex);
        System.out.println("secondNum = " + secondNum);

        //adds two numbers
        answer = (Math.pow(firstNum,secondNum));
        System.out.println("answer = " + answer);
        System.out.println("firstIndex: " + firstIndex + " " + "secondIndex: " + secondIndex + " " + "Boolean: " + beginning);

        //rewrites equation
            if(!beginning){
            equation = equation.substring(0,firstIndex+1)+answer+equation.substring(secondIndex,equation.length());
            }
            else{
            equation = answer+equation.substring(secondIndex,equation.length());
            }
        System.out.println("Equation: " + equation);
        System.out.println("----------------------------");
    }
}

public static void doMath(){
doExponent();
doDivision();
doMultiplication();
doSubtraction();
doAddition();
}

public static void main(String[] args){
calculate();
//quadraticSolver();
}

}
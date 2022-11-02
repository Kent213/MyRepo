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
Scanner scan = new Scanner(System.in);
private double num;

public void calculate(){
String equation = scan.nextLine();

}
public void checkParenthesis(){

}
public double doAddition(){

return num;
}

public double doSubtraction(){
    return num;

}
public double doMultiplication(){
    return num;

}
public double doDivision(){
    return num;

}
public double doExponent(){
    return num;
}
public void doMath(){
//might need to say string.doAddition, string.doSubtraction, etc
doAddition();
doSubtraction();
doMultiplication();
doDivision();
doExponent();
}
public static void main(String[] args){
calculate();
}
}
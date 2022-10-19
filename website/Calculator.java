package website;
import java.util.Scanner;
public class Calculator {
    Scanner scan = new Scanner(System.in);
    //make variables protected
public void calculate(){
    while(!scan.nextLine().equals("stop")){
        String nextIn = scan.nextLine();
        nextIn = nextIn.replace(" ", "");
        for(int i = 0; i<nextIn.length(); i++){
            //do in parenthesis first
        if(nextIn.substring(i,i++).equals("(")){
        String inParen = nextIn.substring(nextIn.indexOf("(")+1,nextIn.indexOf(")"));
        //line below rewrites the equation replacing parenthesis with a numebr
        nextIn = nextIn.substring(0,nextIn.indexOf("(")-1)+math(inParen)+nextIn.substring(nextIn.indexOf(")")-1,nextIn.length());
        calculate();
    }
    else{
        System.out.println(math(nextIn));
    }
}
    }
}
            public double math(String nextIn){
        double answer;
        int b;
        int e;
        while(nextIn.contains("^")||nextIn.contains("*")||nextIn.contains("/")||nextIn.contains("+")||nextIn.contains("-")){
        for(int i = 0; i<nextIn.length(); i++){
        if(nextIn.substring(i,i++).equals("^")){
            //do powers
            b = i;
            e = i;
            while(b!=-1||!nextIn.substring(b,b++).equals("^")||!nextIn.substring(b,b++).equals("*")||!nextIn.substring(b,b++).equals("/")||!nextIn.substring(b,b++).equals("+")||!nextIn.substring(b,b++).equals("-")){
                b--;
            }
            while(b!=nextIn.length()+1||!nextIn.substring(e,e++).equals("^")||!nextIn.substring(e,e++).equals("*")||!nextIn.substring(e,e++).equals("/")||!nextIn.substring(e,e++).equals("+")||!nextIn.substring(e,e++).equals("-")){
                e++;
            }
            //int exponent = substring from ^ to e
            for (int exponent = Integer.parseInt(nextIn.substring(nextIn.indexOf("^"),e));
            exponent>=0; exponent--){
                //multiplies by itself (exponent) times
            answer = Integer.parseInt(nextIn.substring(b,nextIn.indexOf("^")))*Integer.parseInt(nextIn.substring(b,nextIn.indexOf("^")));
            }
            //rewrites equation after doing math
            nextIn = nextIn.substring(0,e-1)+math(nextIn.substring(b,e)+nextIn.substring(e,nextIn.length()));

        }
        else if(nextIn.substring(i,i++).equals("*")){
            //do multiplication
            b = i;
            e = i;
            while(b!=-1||!nextIn.substring(b,b++).equals("^")||!nextIn.substring(b,b++).equals("*")||!nextIn.substring(b,b++).equals("/")||!nextIn.substring(b,b++).equals("+")||!nextIn.substring(b,b++).equals("-")){
                b--;
            }
            while(b!=nextIn.length()+1||!nextIn.substring(e,e++).equals("^")||!nextIn.substring(e,e++).equals("*")||!nextIn.substring(e,e++).equals("/")||!nextIn.substring(e,e++).equals("+")||!nextIn.substring(e,e++).equals("-")){
                e++;
            }
            //multiplies first number by second --- 
            answer = Double.parseDouble(nextIn.substring(b,nextIn.indexOf("*")))*Double.parseDouble(nextIn.substring(e,nextIn.length()));
            //rewrites equation after doing math
            nextIn = nextIn.substring(0,e-1)+math(nextIn.substring(b,e)+nextIn.substring(e,nextIn.length()));
        }
        else if(nextIn.substring(i,i++).equals("/")){
            //do division
            b = i;
            e = i;
            while(b!=-1||!nextIn.substring(b,b++).equals("^")||!nextIn.substring(b,b++).equals("*")||!nextIn.substring(b,b++).equals("/")||!nextIn.substring(b,b++).equals("+")||!nextIn.substring(b,b++).equals("-")){
                b--;
            }
            while(b!=nextIn.length()+1||!nextIn.substring(e,e++).equals("^")||!nextIn.substring(e,e++).equals("*")||!nextIn.substring(e,e++).equals("/")||!nextIn.substring(e,e++).equals("+")||!nextIn.substring(e,e++).equals("-")){
                e++;
            }
            //divide first # by second
            answer = Double.parseDouble(nextIn.substring(b,nextIn.indexOf("/")))/Double.parseDouble(nextIn.substring(e,nextIn.length()));
            //rewrites equation after doing math
            nextIn = nextIn.substring(0,e-1)+math(nextIn.substring(b,e)+nextIn.substring(e,nextIn.length()));

        }
        else if(nextIn.substring(i,i++).equals("+")){
            //do addition
            b = i;
            e = i;
            while(b!=-1||!nextIn.substring(b,b++).equals("^")||!nextIn.substring(b,b++).equals("*")||!nextIn.substring(b,b++).equals("/")||!nextIn.substring(b,b++).equals("+")||!nextIn.substring(b,b++).equals("-")){
                b--;
            }
            while(b!=nextIn.length()+1||!nextIn.substring(e,e++).equals("^")||!nextIn.substring(e,e++).equals("*")||!nextIn.substring(e,e++).equals("/")||!nextIn.substring(e,e++).equals("+")||!nextIn.substring(e,e++).equals("-")){
                e++;
            }
            answer = Double.parseDouble(nextIn.substring(b,nextIn.indexOf("+")))+Double.parseDouble(nextIn.substring(e,nextIn.length()));
            //rewrites equation after doing math
            nextIn = nextIn.substring(0,e-1)+math(nextIn.substring(b,e)+nextIn.substring(e,nextIn.length()));

        }
        else if(nextIn.substring(i,i++).equals("-")){
            //do subtraction
            b = i;
            e = i;
            while(b!=-1||!nextIn.substring(b,b++).equals("^")||!nextIn.substring(b,b++).equals("*")||!nextIn.substring(b,b++).equals("/")||!nextIn.substring(b,b++).equals("+")||!nextIn.substring(b,b++).equals("-")){
                b--;
            }
            while(b!=nextIn.length()+1||!nextIn.substring(e,e++).equals("^")||!nextIn.substring(e,e++).equals("*")||!nextIn.substring(e,e++).equals("/")||!nextIn.substring(e,e++).equals("+")||!nextIn.substring(e,e++).equals("-")){
                e++;
            }
            answer = Double.parseDouble(nextIn.substring(b,nextIn.indexOf("-")))-Double.parseDouble(nextIn.substring(e,nextIn.length()));
            //rewrites equation after doing math
            nextIn = nextIn.substring(0,e-1)+math(nextIn.substring(b,e)+nextIn.substring(e,nextIn.length()));

        }
        }
        math(nextIn);
    }
        return answer;
        System.out.println(nextIn);
    }
}

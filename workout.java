/*Write a Java program that simulates a simple calculator. Your program should take two numbers and an 
operator (+, -, *, /) as input from the user. Implement exception handling to handle potential errors such
as division by zero and invalid operators.
*/
package javaapplication1;
import java.util.*;

public class calculator {
    public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the digits:");
    String a = obj.next();
    String b = obj.next();
  
     
    try{ double num1 = Double.parseDouble(a);
         double num2 = Double.parseDouble(b); 
             System.out.println("You entered: "
                                   + num1 +" "+num2);
            }
             catch (NumberFormatException e) {
 
                System.out.println(
                    "NumberFormatException occurred");
            }
  
   double num1 = Double.parseDouble(a);
   double num2 = Double.parseDouble(b); 
    System.out.println("\nenter your choice(+,-,*,/)");
    char opr = obj.next().charAt(0);
    try{
        if(opr != '+'&& opr!= '-' && opr!= '*' && opr!='/')
        {
            throw new operatorexception("enter valid operators");
        }
        
    }
    catch(operatorexception o){
                 System.out.println(o);
    }
    switch(opr){
        case '+':
            
	    System.out.println(num1 +"+"+num2+"= "+(num1+num2));
	    break;
        case '-':
	    System.out.println(num1 +"-"+num2+" = "+(num1-num2));
	    break; 
        case '*':
	    System.out.println(num1 +"*"+num2+" = "+num1*num2);
	    break; 
        case '/':
            try{
                if (num2==0){
                    throw new divisionException("error can't divide");
                }
                else{
                    System.out.println(num1 +"/"+num2+"= "+num1/num2);

                }
            }
            catch(divisionException e){
                System.out.println(e);

            }
	    break;
    }
}
}
class divisionException extends Exception {
   
   public divisionException(String msg) {
        super(msg);
      }
}
class NumberException extends Exception {
   
   public NumberException(String msg) {
        super(msg);
      }
}
class operatorexception extends Exception {
   
   public operatorexception(String msg) {
        super(msg);
      }
}

/*rite a Java program for handling the following exceptions
(i) Arithmetic Exception (ii) ArrayIndexOutOfBounds Exception
(iii) NumberFormatException (iv) StringIndexOutOfBound Exception*/

package javaapplication1;
import java.util.*;

public class NewClass1 {
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string");
                String n = obj.next();            

        System.out.println("Enter array of string");

        String a[] = new String[5];
        for(int i=0;i<a.length;i++){
            a[i] = obj.next();
        }

	    try {
                char c = n.charAt(20);
            }
	    catch(StringIndexOutOfBoundsException ex) {
	    
	        System.out.println(ex);
	    }
            
            try {
                int i = Integer.parseInt(n);
            }
            catch(NumberFormatException e){
                System.out.println(e);
            }
            try{
                 String sub =  a[10] ;
                 
            }
            catch(ArrayIndexOutOfBoundsException arr){
                
               System.out.println(arr);

            }
            System.out.println("enter two numbers:");
            int a1= obj.nextInt();
            int a2= obj.nextInt();

            try{
                int res = a1/a2;
            }
            catch(ArithmeticException u){
                   System.out.println(u);
            }
       
	}
}

package java1;

import java.util.*;

public class java1 {

    public static void main(String[] args) {  
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        String n = obj.next();
        int l;
        l= n.length();
        for(int i=0;i<l;i++){
           switch(n.charAt(i)){
               case '0':
                System.out.print("zero ");
                break;
                
                case '1':
                System.out.print("one ");
                break;
                case '2':
                System.out.print("two ");
                break;
                case '3':
                System.out.print("three ");
                break;
                case '4':
                System.out.println("four ");
                break;
       
                case '5':
                System.out.print("five ");
                break;
                 case '6':
                System.out.print("six ");
                break;
                case '7':
                System.out.print("seven ");
                break;
                case '8':  
                System.out.print("eight ");
                break;
                case '9':
                System.out.print("nine ");
                break;
           }


        }
 }
}

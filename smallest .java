package java1;
import java.util.*;
public class Java1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a value ");

        int a = obj.nextInt();
        System.out.println("enter a value ");
        int b = obj.nextInt();
        int c;


        c = a<b?a:b;
        System.out.println(c +" is small ");
 
   }

}

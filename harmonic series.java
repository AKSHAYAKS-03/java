
import java.util.*;

public class Main {

   
    public static void main(String[] args) {
        
        Scanner obj= new Scanner (System.in);
        System.out.println("enter a number");
        int n = obj.nextInt();
        int i;
        float sum=0.0f;
        System.out.println("harmonic series");
        for(i=1;i<=n;i++)
        {
            sum+=(float)1/i;
            
        }
         System.out.println(String.format("%.2f",sum));
        }
    }


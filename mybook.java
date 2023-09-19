import java.util.*;
public class Main{

    public static void main(String[] args) {
        // TODO code application logic
        Scanner S = new Scanner(System.in);
        System.out.println("enter no of bks");
        int n = S.nextInt();
        int total =0;

        MyBook m[] = new MyBook[n];
        for(int i=0;i<n;i++){

        System.out.println("enter book title:");
        String t = S.next();
        System.out.println("enter book author:");
        String a = S.next();
        System.out.println("enter book price:");
        int p = S.nextInt();
        m[i] = new MyBook();
        m[i].setdetails(t,a,p);
        m[i].getdetails();
        m[i].display();
        total = total +p;
        }
        System.out.println("Total price : "+total);
  
}
}
abstract class book{
     String title,author;
     int price ;

    public abstract void setdetails(String book,String author,int price);
    public abstract String getdetails();

  }
  class MyBook extends book{
 
         public String getdetails(){
             return title;
         }

         public void setdetails(String t,String a,int p){
             title=t;
             author=a;
             
                  }
         void display(){
                 System.out.println("title: "+getdetails());

         }
  }


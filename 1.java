import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("enter your input:");
        String s = obj.nextLine();
       
        String m[] = new String[5];
        for(int i=0;i<s.length();i++)
        {  
            m = s.split(" ");
            
        }
        try{
            if(m.length!=3){
               
              throw new invalidexception("Not valid");

            }
            else{
                            System.out.print("ACRONYM : ");

               for(String j :m){
   
                  char res =j.charAt(0);
                   System.out.print(Character.toUpperCase(res));
       } 
            }
        }
        catch(invalidexception e){
                        System.out.println(e.getMessage());
            }
    }
}
class invalidexception extends Exception{
    invalidexception(String msg){
        super(msg);
    }
}

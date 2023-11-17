
package javaapplication1;

import java.util.*;
import java.lang.*;

 class exp13ii {
    public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
        String name;int rollno; double cgpa;
        ArrayList<student> details = new ArrayList<student>();
        System.out.print("Enter the elements(String)...\n");
        for(int i=0;i<20;i++)
        {
         System.out.print("Enter the name,rollno and cgpa...\n");
         name = obj.next();
         rollno = obj.nextInt();
         cgpa = obj.nextDouble();
         
          details.add(new student(name,rollno,cgpa));
          
        }
   for (int i = 0; i < details.size(); i++){
            System.out.println(details.get(i));
    
    }
   Sortbyname s = new Sortbyname();
     Collections.sort(details,s);
     System.out.println("\nSorted by name");
         for (int i = 0; i < details.size(); i++)
            System.out.println(details.get(i));
    }
    
}
   
class student {
    String name;
    int rollno;
    double cgpa;
   public student(String name,int rollno,double cgpa){
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
       
    }
    public String toString()
    {
 
        // Returning attributes of Student
        return this.rollno + " " + this.name + " "  + this.cgpa;
    }
}
class Sortbyname implements Comparator<student> {
    public int compare(student a, student b)
    {
 
        return a.name.compareTo(b.name);
    }
}

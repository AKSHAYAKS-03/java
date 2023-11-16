package javaapplication1;

import java.util.*;
public class exp12i {
    public static <T> void oddinteger(T[] eles)
    {
        int count =0;
        int i;
        for(i=0;i<eles.length;i++){
            Integer num = (Integer)eles[i];
            if(num%2!=0){
                count+=1;
            }
        }
       System.out.println("\nno of odd integers :"+count);
    }
    public static <T> void swap (T[] a, int i, int j) {
  T t = a[i];
  a[i] = a[j];
  a[j] = t;
}
     public static <T> Integer max (T[] a,int s,int e) {

  Integer maxi1 = (Integer)a[0];
  for(int i=s;i<e;i++){
      Integer num = (Integer)a[i];
      if(num>maxi1){
          maxi1 = (Integer) a[i];
      }
  }
  return maxi1; 
  
  
}
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Integer[] arr = {1,2,0,33,40,44,45,6};
        System.out.println("original array ");
        
         for(int i=0;i<arr.length;i++){
            
        System.out.print(arr[i]+" ");

    }
        oddinteger(arr);
        System.out.println("\nenter positions to exchange");
        int n = s.nextInt();
        int m = s.nextInt();
        swap(arr,n,m);
        System.out.print("new array ");

        for(int i=0;i<arr.length;i++){
            
        System.out.print(arr[i]+" ");

    }   System.out.print("\nEnter Start index:");
        int start = s.nextInt();
        System.out.print("Enter end index:");
        int end = s.nextInt();
       System.out.println("maximal element :"+max(arr,start,end));
       
       
        
    }
      

       }

   

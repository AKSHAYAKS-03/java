/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.*;

import java.util.Collections;
public class exp13i {
    public static void main(String[] args)
    {       

        Scanner obj = new Scanner(System.in);
        double n = 12,sum=0,avg;
        List<Double> bill = new ArrayList<Double>(12);
        System.out.print("Enter the elements(String)...\n");
        for(int i=0;i<n;i++)
        {
            bill.add(obj.nextDouble());
        }
        for(int i=0;i<n;i++)
        {
            sum+= bill.get(i);
        }
        avg = sum/n;
       System.out.println(String.format("Average : %.4f",avg));
       System.out.println("Minimum element: "+Collections.min(bill));
       System.out.println("Maximun element: "+Collections.max(bill));
         
    }
}

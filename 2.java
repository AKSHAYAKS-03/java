/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author aksha
 */
import java.util.*;

public class exp12ii {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter No.of elements:");
        int n = obj.nextInt();
        String[] str = new String[n];
        System.out.print("Enter the elements(String)...\n");
        for(int i=0;i<n;i++)
        {
            str[i]=obj.next();
        }
        System.out.print("Enter the search element:");
        String ele = obj.next();
        search(str, ele);
        Integer[] int_arr = new Integer[n];
        System.out.print("Enter No.of elements:");
        int n1 = obj.nextInt();
        System.out.print("Enter the elements(Integer)...\n");
        for(int i=0;i<n1;i++)
        {
            int_arr[i]=obj.nextInt();
        }
        System.out.print("Enter the search element:");
        Integer el = obj.nextInt();  
        search(int_arr, el);
        
    }
   public static <T> void search(T obj[], T s)
    {
        int c=0;
        String ele = s.toString();
        for(int i=0;i<obj.length;i++)
        {
            String ob = obj[i].toString();
            if(ob.equals(ele))
            {
                c=1;
                break;
            }
        }
        if(c==1)
            System.out.println("FOUND!");
        else
            System.out.println("NOT FOUND!");
    }
    }



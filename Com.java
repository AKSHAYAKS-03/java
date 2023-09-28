package com;
import java.util.*;
import loan.LoanAccount;

public class Com {

    
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter nos");       
        int s = S.nextInt();
        int c = S.nextInt();
        int d = S.nextInt();
        
      LoanAccount la = new LoanAccount();
        la.Transaction(s,c,d);
}    
}

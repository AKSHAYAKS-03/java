package com;
import java.util.*;
import loan.LoanAccount;

public class Com {

    
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("enter nos");       
        int s = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);
        
        
      LoanAccount la = new LoanAccount();
        la.Transaction(s,c,d);
}    
}


// Transactio.java

package transact;
public class Transaction {
   int salary;

    public Transaction(int s){
        this.salary = s;
    }

    public int credits(int c){
        int res= salary+c;
       return res;
    }
    public int debits(int d){
        int res1 =  salary-d;
        return res1;
 }
}


//LoanAccount.java

package loan;
import transact.*;

public class LoanAccount {
    
    public void Transaction(int s,int c,int d) {
        Transaction ta = new Transaction(s);
        System.out.println("the initial amount:"+s);

        System.out.println("the amount after credit:"+ta.credits(c));
        System.out.println("the amount after debit:"+ta.debits(d));
    }
}

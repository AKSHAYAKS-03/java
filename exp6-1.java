  
package javaapplication1;

public class UsedCarException {
    String vin;

    UsedCarException(String vin){
        this.vin = vin;
    }
    public int UsedCarException(String vin,int res){
        
      try{
          int vin1 = Integer.parseInt(vin);
          if(vin.length() != 4){
              throw new vinException("\nenter digit 4 digit number");
        }
          else{
                res =  1;
          }
          }
       catch(vinException v) {
	    
	      System.out.println(v.getMessage());    }
      return res;
    }
}

class vinException extends Exception{
       
   public vinException(String msg) {
        super(msg);
      }
}


/////////////////////////////////////////////////////////////////
package javaapplication1;
import java.util.*;

public class UsedCar {
   
    String vin,make,year,mileage,price;
    
     UsedCar(){
         
     }
     
    UsedCar(String v,String mi,String y,String m,String pi){
    this.vin =v;
    this.make = mi;this.year = y;this.mileage = m;this.price = pi;
    }
    int res=0;
    public List<String> list1=new ArrayList<String>(5);  

    public int UsedCar(String vin,String make,String year,String mileage,String price){
        res = this.res;
    UsedCarException u = new UsedCarException(vin);
    int u1 = u.UsedCarException(vin ,res);
    
    String[] m ={"ford","honda","toyota","chrysler"};
    int c=0;
        try{
         for(String i : m){
	       if(i.equals(make)){
	           c = 1;
	           break; }
        }
        if(c==0){
            throw new makeException("enter valid company name ");
            
        }
        else{
            res=1;
        }
        
        int year1 = Integer.parseInt(year);

        if(!(year1 >= 1990 && year1<= 2014)){
            throw new yearException("enter valid year bt 1990 - 2014");
         }
         else{
             res=1;
         }
        int mileage1 = Integer.parseInt(mileage);

         if(!(mileage1>0)){
                   throw new negativeException("enter positive input");
               }
         else{
             res=1;             
         }
         int price1 = Integer.parseInt(price);

         if(!(price1 >0)){
             throw new negativeException("enter positive input");
               }
         else{
             res=1;             
             }
        }
        catch(negativeException | yearException | makeException n) {
	    	        System.out.println(n.getMessage());
	    }
        
        if(res!=0 && u1!=0){
            return 1;
        }
        else{
            return 0;
        }
        
  }
}  
///////////////////////////////////////////////////////////////

class makeException extends Exception{
        makeException(String msg) {
        super(msg);
      }
}
class yearException extends Exception{
        yearException(String msg) {
        super(msg);
      }
}class negativeException extends Exception{
        negativeException(String msg) {
        super(msg);
      }
}


/////////////////////////////////////////////////////////////////

package javaapplication1;
import java.util.*;

public class ThrowUsedCarExceptions {
    public static void main(String[] args){
        
    Scanner obj = new Scanner(System.in);
    UsedCar[] car = new UsedCar[8];
    int i;
    List<String> list = new ArrayList<String>();

    for(i=0;i<car.length;i++){
            List<String> c = new ArrayList<String>();

    System.out.print("\nenter vin, make, year, mileage, and price ");
    String vin = obj.next();
    
    String make = obj.next();
    String year = obj.next();    
    String mileage = obj.next();

    String price = obj.next();
        c.add(vin);
        c.add(make);
        c.add(year);
        c.add(mileage); c.add(price);
        car[i] = new UsedCar(vin,make,year,mileage,price);
    int n = car[i].UsedCar(vin,make,year,mileage,price);
    if(n == 1){
        list.add("[");
        list.addAll(c);
        list.add("]");
    }
    }
System.out.print(list);
 } 
    }
    
    



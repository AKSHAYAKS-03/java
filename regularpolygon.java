import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number of elements: ");
        int n = input.nextInt();
        
        System.out.print("Input the  sides of triangle: ");
        int ts = input.nextInt();

        System.out.print("Input the side of square: ");
        int ss = input.nextInt();
        RegularPolygon tq = new EquilateralTriangle(ts);
        System.out.print(tq);

        RegularPolygon sq = new Square(ss);
        System.out.print(sq);
        RegularPolygon.totalSides(ts,ss);

    }
     
}
 interface RegularPolygon { 
    
   int getNumSides();
   int getSideLength();
   
   static void totalSides(int ts,int ss){
                     System.out.print("\nTotal sides "+ (ts+ss) );

        }
 } 
class EquilateralTriangle implements RegularPolygon{
   private int ts;
    
    public EquilateralTriangle(int ts){
    
       this.ts=ts;

    }
   
    public int getNumSides(){
    return 3;
    }
   public int getSideLength(){
       return ts;
   }
     int getPerimeter() {
              return 3*ts;
  }
    double getInteriorAngle(){
      double res=0.0f;
      res = ((ts-2)*3.14)/ts;
      return res;
}
  
    public String toString() {
        return "\nperimterter of triangle " + getPerimeter() +"\nInteriorAngle of triangle " + getInteriorAngle();
    
    }
}
 class Square implements RegularPolygon{
      private int ss;
    
       public Square(int ss){
       this.ss=ss;

    }
 public int getNumSides(){
    return 4;
    }
  public int getSideLength(){
       return ss ;
   }
 
    int getPerimeter() {
              return 4*ss;
  }

  double getInteriorAngle(){
      double res;
      res = ((ss-2)*3.14)/ss;
      return res;
}
     public String toString() {
        return "\nperimterter of square " + getPerimeter() +"\nInteriorAngle of square " + getInteriorAngle() ;
    
    }
 }
 

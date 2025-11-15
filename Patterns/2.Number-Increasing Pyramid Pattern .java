import java.util.*;
public class Number-Increasing Pyramid Pattern  {
   public static void printpatern(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
         System.out.print( j+" ");
         }
         System.out.println( );
      }
   }
      
   public static void main(String[] args) {
      Scanner sc= new Scanner (System.in);
      int n=sc.nextInt();
      printpatern(n);
         
      
   }
}

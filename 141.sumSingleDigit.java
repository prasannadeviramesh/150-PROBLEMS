import java.util.*;
public class Sum {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    while(n>9){
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        n=sum;
    }
    System.out.println(n);

    }
}
    
   
        
   

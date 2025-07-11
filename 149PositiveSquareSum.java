import java.util.*;
public class  PositiveSquareSum{
    public static void main (String []arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]input=new int[n];
        for(int i=0;i<input.length;i++){
         input[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=input[i]*input[i];
        }
        System.out.println("Final answer in :" +sum);
            
        }
    }


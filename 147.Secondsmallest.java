import java.util.Scanner;
public class Secondsmallest {
    public static void main (String []arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]input=new int[n];
        for(int i=0;i<input.length;i++){
         input[i]=sc.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(input[i] < smallest){
                secondsmallest=smallest;
                smallest=input[i];
            }
            else if(input[i]<secondsmallest && input[i] != smallest){
                secondsmallest=input[i];
            }}
             if(secondsmallest == Integer.MAX_VALUE){
                System.out.println("there is no second smallest number");
             }
             else{
                System.out.println("The Second Smallest Number is :  "+ secondsmallest);
             
        }
        sc.close();
}
}


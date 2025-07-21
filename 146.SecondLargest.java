import java.util.Scanner;
public class SecondLargest {
    public static void main (String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int[]input=new int[n];
        System.out.println(" Enter the elements : ");
        for(int i=0;i<input.length;i++){
         input[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(input[i] >largest){
                secondlargest=largest;
                largest=input[i];
            }
            else if(input[i]>secondlargest && input[i] != largest){
                secondlargest=input[i];
            }
             
             
             else{
                System.out.println("The Second Smallest Number is :  "+ secondlargest);
             }
        }
        sc.close();
}
}


import java.util.Scanner;

public class EvenOrOdd {
     static int[] evenORodd(int []arr){
        int countodd=0;
        int counteven=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2==0){
                counteven++;
            }
            else{
                countodd++;
            }
        }
        return new int [] {countodd,counteven};
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of an array : ");
        int size= sc.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter any "+ size +" numbers : " );
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int [] ans=evenORodd(arr);
        System.out.println("  count of the odd number :"+ ans[0]);
         System.out.println("  count of the even number :"+ ans[1]);
         sc. close();
     }
}

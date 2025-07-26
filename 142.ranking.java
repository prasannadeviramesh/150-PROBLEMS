import java.util.*;
public class ranking {
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[]sorted=arr.clone();// copy the previous orginal array
        Arrays.sort(sorted);
        int [] rank=new int [n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]== sorted[j]){
            rank[i]=j+1;
            break;
                }
            }
        }
        for(int r:rank){
            System.out.print(r + " ");
        }
        }
        
        }



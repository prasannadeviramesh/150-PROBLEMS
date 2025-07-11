import java.util.*;
public class SORT {
    public static void main (String []arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]input=new int[n];
        for(int i=0;i<input.length;i++){
         input[i]=sc.nextInt();
        }
        System.out.println("Un Sorted Array :" + Arrays.toString(input));
        Arrays.sort(input);
        System.out.println("Un Sorted Array :" + Arrays.toString(input));

    }
    
}

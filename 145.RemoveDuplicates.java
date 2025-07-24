import java.util.*;
public class RemoveDup {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Set <Integer>uniqueElements=new LinkedHashSet<>();
        for(int num: arr){
            uniqueElements.add(num);
        }
        System.out.println("Elements after removing duplicates");
        for(int num:uniqueElements){
            System.out.print(num + " ");
        }
        sc.close();
    }
    
}

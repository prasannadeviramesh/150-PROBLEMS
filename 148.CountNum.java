import java.util.*;
public class CountNum {
    public static void main (String []arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]input=new int[n];
        for(int i=0;i<input.length;i++){
         input[i]=sc.nextInt();
        }
        int pc=0;
        int nc=0;
        int Zc=0;
        for(int i=0; i<n;i++){
            if(input[i]>0){
                pc++;
            }
            else if(input[i]<0){
                nc++;
            }
            else {
                Zc++;
            }
        }
        System.out.println("Postive numbers count :"+ pc);
        System.out.println("negative numbers count :"+ nc);
        System.out.println("Zeros count :"+ Zc);
    }
}

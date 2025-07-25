import java.util.*;
public class findKey{
public static int findSmallestDigit(int num){
int smallest=9;
while(num>0){
    int digit=num%10;
    if(digit <smallest){
        smallest=digit;
    }
    num /=10;  
}
return smallest;
}
public static  int findLargestDigist(int num){
    int Largest=0;
    while(num>0){
        int digit=num%10;
        if(digit >Largest){
            Largest=digit;
        }
        num/=10;
    }
    return Largest;
}
public static void main(String[]arg){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter input1 :");
    int input1=sc.nextInt();
    int input2=sc.nextInt();
    int input3=sc.nextInt();
int smallest1=findSmallestDigit(input1);
int smallest2=findSmallestDigit(input2);
int smallest3=findSmallestDigit(input3);

int largest1=findLargestDigist(input1);
int largest2=findLargestDigist(input2);
int largest3=findLargestDigist(input3);
int sum=smallest1+smallest2+smallest3+largest1+largest2+largest3;
System.out.println(sum);
sc.close();
}

}

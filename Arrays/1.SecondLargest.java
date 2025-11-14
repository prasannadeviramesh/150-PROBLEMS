import java.util.*;//naive approach
class Main{
    static int getSecondLargest(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i =n-2;i>=0;i--){
            if(arr[i] != arr[n-1]){
                return arr[i];
            }
           
        }
         return -1;
    }
    public static void main(String [] args){
        int [] arr={1,56,89,99,466,786};
    System.out.println(getSecondLargest(arr));
    }
}

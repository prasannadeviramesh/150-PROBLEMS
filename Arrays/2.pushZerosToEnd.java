class Solution {
    void pushZerosToEnd(int[] arr) {
       int n=arr.length;
       int[]temp=new int [n];
       int j=0;
       for (int i=0;i<n;i++){//strore non zeros
           if(arr[i]!=0){
               temp[j++]=arr[i];
           }
       }
       while(j<n)// remaing place fill zeros 
           temp[j++]=0;
       
       for(int i=0;i<n;i++)// final transfer the temp values to arr
           arr[i]=temp[i];     
}
}

 

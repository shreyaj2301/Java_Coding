//Question : Count frequency of each element in the array


 import java.util.*;

 class FrequencyArray {
    public static void main(String[]args){
        int arr[]={10,5,10,15,10,5};
         int n = arr.length;
        countFreq(arr,n);
    }
    public static void countFreq(int arr[],int n){
        boolean visited[]=new boolean[n];
        for (int i = 0;i<n;i++){
            //skip this element if already visited
            if (visited[i]==true)
            continue;
            //count frequnce
            int count =1;
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    visited[j]= true;
                    count++;
                }
            }
            System.out.println(arr[i] + " Frequency  " + count);
        }
    }
}
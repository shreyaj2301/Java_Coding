 // Question : Calculate Sum of the Elements of the Array
 
 
 import java.util.*;
 class SumArray {
    public static void main(String[]args){
        int n =5;
        int arr[] ={1,2,3,4,5};
        int sum =0;
        for (int i =0;i<n;i++){
            sum+=arr[i];
        
        }
        System.out.println("the sum of the element of the array is:"+sum);
    }
}
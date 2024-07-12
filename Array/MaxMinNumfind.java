// Question : Maximum and minimum of an array using minimum number of comparisons



import java.util.Arrays;
 public class MaxMinNumfind{
   public static int setmini(int[]A,int N)
   {
    int mini= Integer.MAX_VALUE;
    for(int i=0;i<N;i++){
        if(A[i]<mini){
            mini =A[i];
        }
    }
    return mini;
   } 
   public static int setmaxi(int[]A,int N)
   {
    int maxi =Integer.MIN_VALUE;
    for(int i =0;i<N;i++){
        if(A[i]>maxi){
            maxi=A[i];
        }
    }
    return maxi;
   }
   public static void main(String[]args){
    int[]A ={4,9,6,5,2,3};
    int N =A.length;
    System.out.println("Minimum element is: "+ setmini(A,N));
    System.out.println("Maximum element is: "+ setmaxi(A,N));
   }
 }
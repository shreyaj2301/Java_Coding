import java.io.*;
import java.util.Arrays;

class SecondSmallLarge {
    static private void getElement(int[]arr,int n)
    {
        if ( n==0|| n==1)
        {
            System.out.println(-1);
            System.out.println("");
            System.out.println(-1);
            System.out.println("\n");
        }
        Arrays.sort(arr);
        int small =arr[1];
        int large =arr[n-2];
        System.out.println("Second smallest is"+small);
        System.out.println("Second largest is "+large);
    }
    
        public static void main(String[]args){
            int[]arr ={1,2,3,4,5,6,7};
            int n=arr.length;
            getElement(arr,n);
    }
}

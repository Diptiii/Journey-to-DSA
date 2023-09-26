//minimum and maximum in java

import java.util.*;
public class Solve{
    public static void main(String[] args) {
        
        int []numbers={4,2,3,6,8,95};
        int max=maximum(numbers,6);
        int min=minimum(numbers,6);
        System.out.println(max);
        System.out.println(min);
    }

    static int minimum(int[] arr, int n){
        n=arr.length;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int maximum(int[] arr, int n){
         n=arr.length;
         int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

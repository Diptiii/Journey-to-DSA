public class Solve{
    public static void main(String[] args) {
        int []numbers= {4,2,3,6,8,95};
reverse(numbers,6);
printA(numbers,6);
    }
    static void printA(int[]arr,int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
static void reverse(int[] arr, int n){
        n=arr.length;
        int start=0;
        int end=n-1;
        int temp=0;
       while(start<=end){ 
           temp=arr[start]  ;
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
       }
}
}

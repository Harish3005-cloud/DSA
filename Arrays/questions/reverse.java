package questions;
import java.util.*;
public class reverse {
    public int[] reverseBrute(int arr[]){
        int n=arr.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=arr[n-1-i];
        }
        return res;

    }
    public void reverseOptimized(int arr[]){
        int n=arr.length;
       int l=0;
       int r=n-1;
       while(l<r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
       }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        int []arr=new int [n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse ra=new reverse();
        System.out.println("Reversing of array using brute force method :-- ");
        int[] bruteResult = ra.reverseBrute(arr);
        for(int i=0;i<n;i++){
            System.out.print(bruteResult[i]+" ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Reversing of array using Optimized method :-- ");
       
        ra.reverseOptimized(arr);
          for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
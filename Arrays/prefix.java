import java.util.*;
public class prefix {
    public static void calculateprefixSum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
        calculateprefixSum(arr);
        System.out.println("The prefix sum array is : \n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

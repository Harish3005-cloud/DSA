package Arrays;
import java.util.*;
public class quicksort {
    static int partition(int a[],int l,int r){
        int pivot=a[l];
        int i=l-1;
        int j=r+1;
        while(true){
            do{
                i++;
            }while(a[i]<pivot);
            do{
                j--;
            }while(a[j]>pivot);
            if(i>=j) 
                return j;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    static void quicksort1(int a[],int l,int r){
        if(l<r){
            int s=partition(a, l, r);
            quicksort1(a, l, s);
            quicksort1(a, s+1, r);
        }
    }
    public static void main(String[]args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\n---QuickSorting....---\n");
        quicksort1(arr, 0, n-1);
          System.out.println("The sorted elements are:");
        for(int i=0;i<n;i++){
           System.out.print(arr[i]);
        }
        System.out.println();
        sc.close();
    }
}

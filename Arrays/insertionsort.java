package Arrays;
import java.util.*;
public class insertionsort {
    public void insertion(int arr[],int n){
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }    
            arr[j+1]=curr;
        
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[]args){
          int n;

        insertionsort sort = new insertionsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : \n");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\n----Insertion-sort----\n");
        sort.insertion(arr, n);
        System.out.println("Worst Case Complexity: O(N)");
        sc.close();
    }
}

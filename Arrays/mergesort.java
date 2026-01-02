package Arrays;

import java.util.*;

public class mergesort {
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merger[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merger[x++] = arr[idx1++];
            } else {
                merger[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merger[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merger[x++] = arr[idx2++];
        }

            for(int i=0, j=si;i<merger.length;i++,j++){
       
                arr[j]=merger[i];
       6
            }



    }


    public static void main(String[] args) {
        int n;

        // mergesort sort = new mergesort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : \n");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\n----Merged-sort----\n");
        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        System.out.println("Worst Case Complexity: O(Nlog(N))");
        sc.close();
    }
}

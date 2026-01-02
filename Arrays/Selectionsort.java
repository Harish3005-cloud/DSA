package Arrays;

import java.util.*;

public class Selectionsort {
    public void selection(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[temp] > arr[j]) {
                    temp = j;
                }

            }
            int temp1 = arr[i];
            arr[i] = arr[temp];
            arr[temp] = temp1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n;

        Selectionsort sort = new Selectionsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : \n");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\n----Selection-sort----\n");
        sort.selection(arr, n);
        System.out.println("Worst Case Complexity: O(N**2)");
        sc.close();
    }
}

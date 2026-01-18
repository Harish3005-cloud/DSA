import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public void bubble(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                    //  for DESC--> if (arr[j] < arr[j + 1]) {
                if (arr[j] >arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int n;

        bubblesort sort = new bubblesort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements : \n");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\n----Bubble-sort----\n");
        sort.bubble(arr, n);
        System.out.println("Worst Case Complexity: O(N**2)");
        sc.close();
    }
}
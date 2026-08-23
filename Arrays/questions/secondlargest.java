package questions;
import java.util.*;
public class secondlargest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;

    for (int value : a) {
        if (value > largest) {
        secondLargest = largest;
        largest = value;
        } else if (value > secondLargest && value != largest) {
        secondLargest = value;
         }
    }

System.out.println(secondLargest);   
    }
}


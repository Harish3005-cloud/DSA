package ArrayLists.list;

import java.util.Scanner;

public class binay {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        int high,low;
        int target;
        n=sc.nextInt();
        target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        high=n-1;
        low=0;
        while(low<=high){
           int mid=low+(high-low)/2;
           if(arr[mid]==target){
            System.out.println("Element found at index "+mid+"");
        }
        if(target>arr[mid]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }

}
}
}
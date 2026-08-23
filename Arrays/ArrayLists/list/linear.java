package ArrayLists.list;
import java.util.*;
public class linear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        int target;
        n=sc.nextInt();
        target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Searching the target .....");
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("element found at index "+i+".");
            }
            else{
                System.out.println("Element not found");
                break;
            }

        }
        
    }
}

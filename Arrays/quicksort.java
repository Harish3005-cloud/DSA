import java.util.*;
public class quicksort{
    static int partition(int a[],int low,int high){
        int pivot=a[low],temp ,i=low+1,j=high;
        while(true){
            while(i<=high && a[i]<=pivot){
                i++;
            }
            while(j>=low && a[j]>pivot){
                j--;
            }
            if(i<j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            } else {
                temp=a[low];
                a[low]=a[j];
                a[j]=temp;
                return j;
            }
        }
    }
static void sort(int a[],int low,int high ){
    int j;
    if(low < high){
        j=partition(a, low, high);
        sort(a,low,j-1);
        sort(a,j+1,high);    
    }



}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
     
        System.out.println("Enter the length of the array : ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements: \n");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Sorting .....");
        sort(a,0,n-1);
        System.out.println("After Sorting: \n");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }

}
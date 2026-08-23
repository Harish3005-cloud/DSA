import java.util.*;
class mergesort{
    static void merge(int b[],int c[],int a[]){
        int p=b.length;
        int q=c.length;
        int i=0,j=0,k=0;
        while(i<p && j<q ){
            if(b[i]<=c[j]){
                a[k++]=b[i++];
            }else{
                a[k++]=c[j++];
            }
        }
        System.arraycopy(b, i, a, k, p-i);
        System.arraycopy(c, j, a, k+(p-i), q-j);
    }
    static void sort(int a[]){
        if(a.length<2){
            return;
        }
            int b[]=new int[a.length/2];
            int c[]=new int[a.length-a.length/2];
            System.arraycopy(a, 0, b, 0, b.length);
            System.arraycopy(a,b.length,c,0,c.length);
            sort(b);
            sort(c);
            merge(b,c,a);
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
        sort(a);
        System.out.println("After Sorting: \n");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }


}
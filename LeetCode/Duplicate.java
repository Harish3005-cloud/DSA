import java.util.Scanner;
public class Duplicate{
  
public boolean isduplicate(int a[]){
    int n=a.length;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]==a[j]){
                return true;
            }
        }
    }

    return false;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the Array: \n ");
   int  n=sc.nextInt();
    int a[]=new int [n]; 
    System.out.println("Enter the array elements: \n");
    for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
    }
    Duplicate id=new Duplicate();
     System.out.println ("Duplicate: "+id.isduplicate(a));


}
}
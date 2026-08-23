import java.util.*;
public class Palinfrome{
    public static boolean checkpalin(int n){
        int rev=0;
        int org=n;
        while(n!=0){
            int digit = n%10;
            rev=rev *10 +digit;
            n = n/10;
        }
        if(rev==org){
            return true;
        }

        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        Palinfrome cp=new Palinfrome();
        boolean palin = Palinfrome.checkpalin(n);
        if(palin){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not palindrome");
        }
    }
}
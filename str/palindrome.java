import java.util.*;
public class palindrome{
    public boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
    return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        palindrome s=new palindrome();
        System.out.println("Entered string is Palindrome  : ");
        Boolean ans=s.isPalindrome(str);
        System.out.println(ans);

    }
}
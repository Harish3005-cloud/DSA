import java.util.*;
public class reverse{
    public String rev(String str){
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }
        
        
        return res;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        reverse s=new reverse();
        System.out.println("Entered string's reverse order is : ");
        String ans=s.rev(str);
        System.out.println(ans);

    }
}
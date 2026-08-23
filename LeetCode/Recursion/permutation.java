package Recursion;
import java.util.*;
public class permutation {
    static int totalCount = 0;
    public static void printpermutation(String str,String per){
        if(str.length()==0){
            totalCount++;
            System.out.println(per);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            
            printpermutation(newstr, per+curr);
           
        }
       

    }
    public static void main(String[]args){
        String input="HAR";
        printpermutation(input, "");
        System.out.println("Total permutations: " + totalCount);
    }
}

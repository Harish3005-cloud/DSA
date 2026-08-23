import java.util.*;
public class characterFreq{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println(" Letter Frequcy Count  (Enter you word or sentence):   ");
        String str=sc.next();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            freq[ch-'a']++;
        }
        System.out.println("Character Frequnecies :");
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                char ch=(char)(i+'a');
                System.out.println(ch+ " : "+freq[i]);

            }
        }
        sc.close();
    }

}
import java.util.Scanner;
public class anagram {
    public boolean isanagram(String s , String t){
        if(s.length()!=t.length()){
            return false;
        }
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
            char ch1=t.charAt(i);
            freq[ch1-'a']--;

        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }


        return true;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Anagram Check----\n");
        System.out.println("Enter the First anagram :- \n");
        String s=sc.nextLine();
        System.out.println("Enter the Second anagram :- \n");
        String t=sc.nextLine();
        anagram ag=new anagram();
        boolean isanagram=ag.isanagram(s, t);
        System.out.println("Anagram : "+isanagram);
        sc.close();
        
    }
}

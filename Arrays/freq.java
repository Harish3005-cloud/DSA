import java.util.*;
public class freq{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int a[]=new int [10];
        System.out.println("Enter 10 elements to find out the freq");
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();            
        }
        for(int num:a){
            if(!map.containsKey(num)){
                map.put(num,0);
            }
            map.put(num,map.getOrDefault(num,0)+1);

        }
        map.forEach((key,value)-> {
            System.out.println(key + " = "+value);
        });
        sc.close();
    }
}
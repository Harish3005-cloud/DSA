package Arrays.ArrayLists;
import java.util.*;
public class listoperations {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Adding elements into the list\n");
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        System.out.println("Getting  elements from the  list\n");
        int ele=list.get(1);
        System.out.println("--> "+ele);
        System.out.println(list);
        System.out.println("Adding elements in between  the list\n");
        list.add(3,10);
        System.out.println(list);
        System.out.println("Adding elements into the list\n");
        System.out.println("Setting elements into the list\n");
        list.set(3,6);
        System.out.println(list);
        System.out.println("Deleting elements into the list\n");
        list.remove(0);
        System.out.println(list);
        System.out.println("Iterrating over the list \n");
        int n=list.size();
        for(int i=0;i<n;i++){
            System.out.print("--> "+list.get(i));
        }
        System.out.println();
    }
}

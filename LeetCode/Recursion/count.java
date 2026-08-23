package Recursion;
import java.util.*;
public class count {
    static int totalCount = 0;
    public static int countTotalPahts(int i,int j, int m, int n){
        if(i==n || j==m){
            return 0;

        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downPath=countTotalPahts(i+1, j, m, n);
        int rightPAth=countTotalPahts(i, j+1, m, n);
        return downPath+rightPAth;
       

    }
    public static void main(String[]args){
      int m=3;
      int n=3;
      int totalCount=countTotalPahts(0, 0, m, n);
      System.out.println(totalCount);
    }
}

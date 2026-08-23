import java.util.*;
public class Knapsack{
static float m;
static int n;
static float p[],w[];
static void greedy(){
    float u=m;
    float profit=0;
    boolean used[]=new boolean[n];
    
    System.out.println("Items selected \n");
    for(int i=0;i<n;i++){
        float max=-1;
        int k=-1;
        for(int j=0;j<n;j++){
            if(!used[j]){
                if(p[j]/w[j]>max){
                    max=p[j]/w[j];
                    k=j;
                }
            }
        }
        if(k==-1) break;
        used[k]=true;
        if(w[k]>u){
            System.out.println("\n Item "+(k+1)+" Selected Partially \n");
            float fraction=u/w[k];
            profit+=p[i]*fraction;
            System.out.println("Selected fraction "+fraction);
            u=0;
            break;
        } else{
            System.out.println("Item "+(k+1)+"selected fully");
            u=u-w[k];
            profit+=p[k];

        }
    }
    System.out.println("\n Total knapsack Profit "+profit);
}
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of items");
        n=sc.nextInt();
        w=new float[n];
        p=new float[n];
        System.out.println("\n Enter the weights");
        for(int i=0;i<n;i++){
        System.out.println("\n Enter the weight of "+(i+1)+"Item");
        w[i]=sc.nextFloat();
        }
        System.out.println("\n Enter the Profits");
        for(int i=0;i<n;i++){
        System.out.println("\n Enter the profit of "+(i+1)+"Item");
        p[i]=sc.nextFloat();
        }
        System.out.println("Enter the max capacity : " );
        m=sc.nextFloat();
        greedy();
    }
}
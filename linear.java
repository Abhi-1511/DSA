//getting the index of the required key using liner search
//for t test cases
import java.util.*;
class linear{
    public static int p;
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int t= sc.nextInt();
        int[] gh = new int[10];
        p=0;
        int u=0;
        int q=t;
        while (t > 0){
            gh[u] = insert();
            t--;
            u++;
        }
        for(int i=0;i<q;i++)
            System.out.println(gh[i]);
    }
    static int insert(){
        int n,m;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt ();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        m = sc.nextInt ();
        for (int i = 0; i < n; i++)
            if(arr[i]==m)
                return i;
        return -1;
        }
}

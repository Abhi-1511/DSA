//swapping the k-th index with (n-k)th index
import java.util.*;
class swapping{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int i,j,temp;
        int[] arr = new int[n+1];
        for(i=0;i<n;i++)
           arr[i]=sc.nextInt();
        int k=sc.nextInt();
        temp=arr[k-1];
        arr[k-1]=arr[n-k];
        arr[n-k]=temp;
        for(j=0;j<n;j++)
          System.out.print(arr[j]+" ");
}
}

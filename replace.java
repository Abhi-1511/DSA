//replacing 1 in the place of even number and 0 in the place odd number in an array
import java.util.*;
class replace {
    public static void main(String[] args) {
        int n , temp;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
         int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
            }
            for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
            
        }
    }

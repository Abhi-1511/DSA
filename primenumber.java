import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr =new int[11];
         boolean f = true;
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            f = true;
            if(arr[i]==0||arr[i]==1)
                {
                
                    continue;
                }
            for(int j=2;j<arr[i];j++){
                
                 if(arr[i]%j==0){
                    f=false;
                    break;
                }
            }
            if(f==true){
            System.out.println(arr[i]);
            }
        }
    }
}

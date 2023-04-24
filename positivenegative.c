//+ve -ve seperation

#include <stdio.h>
#include <stdlib.h>
void tenn(int a[],int left,int right){
        int temp;
        temp=a[left];
        a[left]=a[right];
        a[right]=temp;
    }
    
void fun(int a[]){
        int left= 0,temp;
        int right=4;
        while(left < right){
        if(a[left]>0 && a[right]<0){
        tenn(a,left,right);
        left++;
        right--;
        }
        else if(a[left]<0 && a[right]>0){
            left++;
            right--;
        }
        else if(a[left]>0 && a[right]>0){
            right--;
        }
        else
        left++;
    }
}
    
void main(){
    int a[]={-1,7,-4,5,-3};
    
    fun(a);
    for(int j=0;j<5;j++)
        printf("%d ",a[j]);
}

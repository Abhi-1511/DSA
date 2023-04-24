//finding kth largest element in the qsorted array

#include <stdio.h>
#include <stdlib.h>

int compare(const void *aa,const void *bb)
{
    int n1=*(int*)aa;
    int n2=*(int*)bb;
    return n2-n1;
}
int main(){
    int a[]={1,7,4,5,3};
    int k;
    qsort(a,5,sizeof(int),compare);
    for(int i=0;i<5;i++)
    printf("%d",a[i]);
    scanf("%d",&k);
    printf("%d",a[k-1]);
    return 0;
}

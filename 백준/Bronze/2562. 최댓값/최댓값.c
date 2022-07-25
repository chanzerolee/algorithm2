#include<stdio.h>
#include<limits.h>
int main(){
    int a[9],i,max=INT_MIN;
    for(i=0;i<=8;i++){
    scanf("%d",&a[i]);
        if(max<a[i])
            max=a[i];
    }
    for(i=1;i<=9;i++){
        if(max==a[i-1])
            break;
    }
    printf("%d\n%d",max,i);
}
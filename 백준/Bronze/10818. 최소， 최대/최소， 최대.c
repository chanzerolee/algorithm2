#include<stdio.h>
#include<limits.h>
int main(){
    int a,max=INT_MIN,min=INT_MAX;
    scanf("%d",&a);
    int b[a];
    for(int i=0;i<a;i++){
        scanf("%d",&b[i]);
        if(max<b[i])
            max=b[i];
        if(min>b[i])
            min=b[i];
            
    }
    printf("%d %d",min,max);
}
#include<stdio.h>
int main(){
    int a,count=0;
    scanf("%d",&a);
    while(1){
        if(a%5==0){
            count+=a/5;
            break;
        }
        a-=3;
        count++;
        if(a==0)
            break;
        if(a<0){
            printf("%d",-1);
            break;
        }
    }
    if(a>=0)
     printf("%d",count);
}
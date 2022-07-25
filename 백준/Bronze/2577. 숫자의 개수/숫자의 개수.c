#include<stdio.h>
int main(){
    int a,sum=1,d[10];
    for(int i=0;i<10;i++)
        d[i]=0;
    for(int i=0;i<3;i++){
       scanf("%d",&a);
       sum*=a;
    }
    for(int i=0;sum>0;i++){
        a=sum%10;
        d[a]+=1;
        sum=sum/10;
    }
    for(int i=0;i<10;i++)
        printf("%d\n",d[i]);
}
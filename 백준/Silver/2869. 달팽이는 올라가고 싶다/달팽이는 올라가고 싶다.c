#include<stdio.h>
int main(){
    int a,b,c;
    scanf("%d%d%d",&a,&b,&c);
    int sum=a,cnt=0;
    cnt=(c-b-1)/(a-b)+1;
    printf("%d",cnt);
    return 0;
  }
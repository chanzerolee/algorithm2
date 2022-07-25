#include<stdio.h>
int main(){
    int a,b=2,c=5,cnt=2;
    scanf("%d",&a);
    if(a==1)
    {printf("%d",1);
    return 0;};
    while(1){
       if(b<=a&&b+c>=a){
        printf("%d",cnt);
        break;}
        b=b+c+1;
        c+=6;
        cnt++;
    }
}
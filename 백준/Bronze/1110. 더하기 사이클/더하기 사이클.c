#include<stdio.h>
int main(){
    int a,q=0,i=0,x=0;
    scanf("%d",&a);
    x=a;
    while(1){
       q=(x/10+x%10);
       x=((x%10)*10+q%10);
         i++;
        if(x==a)
            break;
    }
    printf("%d\n",i);
}
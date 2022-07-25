#include<stdio.h>
int main(){
    int a;
    scanf("%d",&a);
    if(a<=100&&90<=a)
        printf("A");
    else if(a<90&&a>=80)
        printf("B");
    else if(a<80&&a>=70)
        printf("C");
    else if(a<70&&a>=60)
        printf("D");
    else
        printf("F");
}
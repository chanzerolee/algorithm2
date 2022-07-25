#include<stdio.h>
int main(){
    int a,b,c,count;
    scanf("%d%d%d",&a,&b,&c);
    if(b>=c){
        printf("-1");
        return 0;}
        count=a/(c-b)+1;
    printf("%d",count);
    return 0;
}
#include<stdio.h>
int main(){
    int a,hap=0;
    scanf("%d",&a);
    char arr[a];
    scanf("%s",&arr);
    for(int i=0;i<a;i++){
        hap+=arr[i]-'0';
    }
     printf("%d",hap)  ;
}
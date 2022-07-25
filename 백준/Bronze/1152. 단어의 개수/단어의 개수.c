#include<stdio.h>
#include<string.h>
int main(){
    char *ptr;
    char a[1000001];
    gets(a);
    int count=0;
    ptr=strtok(a,(" "));
    while(ptr!=NULL){
        count++;
        ptr=strtok(NULL,(" "));
    }
    printf("%d",count);
    
}
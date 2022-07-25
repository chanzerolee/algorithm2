#include<stdio.h>
#include<string.h>
int main(){
    char a[100];
    scanf("%s",a);
    int count=strlen(a);
    for(int i=0;i<strlen(a);i++){
        if(a[i]=='-'||a[i]=='=')
            count--;
        else if(a[i]=='j'&&(a[i-1]=='n'||a[i-1]=='l'))
            count--;
         else if(a[i]=='d'&&a[i+1]=='z'&&a[i+2]=='=')
        count--;
    }
    printf("%d",count);
}
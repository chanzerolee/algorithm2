#include<stdio.h>
#include<string.h>
int main(){
    int a,n;
    char x[20];
    scanf("%d",&n);
    for (int i=0;i<n;i++){
        scanf("%d%s",&a,x);
        for(int j=0;j<strlen(x);j++){  
            for(int k=0;k<a;k++){
                printf("%c",x[j]);
            }
           }
      printf("\n");
    }
}
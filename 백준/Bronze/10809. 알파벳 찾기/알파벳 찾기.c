#include<stdio.h>
int main(){
    char a[100]={0};
    scanf("%s",a);
    for(int i=97;i<=122;i++){
        int j=0;
        while(a[j]!=0){
            if(a[j]==(char)i) break;
                j++;
        }
        if(a[j]==(char)i) printf("%d ",j);
        else
            printf("%d ",-1);
    }
}
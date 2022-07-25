#include<stdio.h>
#include<string.h>
int main(){
    int a,hap,count;
    char b[80];
    scanf("%d",&a);
    for (int i=0;i<a;i++){
        scanf("%s",b);
        hap=0;
        count=1;
        for(int j=0;j<=strlen(b);j++){
            if(b[j]=='O'){
                hap+=count;
                count++;
            }
            if(b[j]=='X')
                count=1;
        }
        printf("%d\n",hap);
        }
   
}
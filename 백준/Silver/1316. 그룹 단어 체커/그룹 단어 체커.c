#include<stdio.h>
#include<string.h>
int main(){
    int a,hap=0;
    char x[100];
    scanf("%d",&a);
    for(int i=0;i<a;i++){
        scanf("%s",x);
        hap+=selec(x,strlen(x));
    }
    printf("%d",hap);
}
int selec(char a[],int len){
    int key=0;
    for(int i=0;i<len;i++){
        for(int j=0;j<len;j++){
            if(a[i]==a[j]){
                key=j-i;
                if(key>1)
                    if(a[j-1]!=a[j])
                        return 0;}
        }
    }
    return 1;
}
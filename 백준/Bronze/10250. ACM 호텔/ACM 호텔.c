#include<stdio.h>
int selec();
int main(){
    int oh,h,w,t,n;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        scanf("%d%d%d",&h,&w,&n);
        oh=selec(h,w,n);
        printf("%d\n",oh);
    }
}
int selec(int h,int w,int n){
    int count=1;
    for(int i=1;i<=w;i++){
        for(int j=1;j<=h;j++){
            if(count==n)
                return j*100+i;
            count++;
        }
    }
}
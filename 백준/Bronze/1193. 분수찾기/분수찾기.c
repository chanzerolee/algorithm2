#include<stdio.h>
int main(){
    int x;
    int q,w,e,r;
    scanf("%d",&x);
    if(x==1)
        printf("1/1");
    else{
        q=1;
        w=x;
        while(w>q){
            w-=q;
            q++;
        }
        if(q%2==0){
            e=1;r=q;
            for(int i=1;i<w;i++){
                e++;r--;
            }
        }
        else{
            e=q;r=1;
            for(int i=1;i<w;i++){
                e--;r++;
            }
        }
        printf("%d/%d",e,r);
    }
    return 0;
}
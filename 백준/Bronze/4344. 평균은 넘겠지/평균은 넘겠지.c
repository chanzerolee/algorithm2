#include<stdio.h>
int main(){
    int n,nx;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&nx);
        int arr[nx],count=0,hap=0;
        for(int j=0;j<nx;j++){
            scanf("%d",&arr[j]);
            hap+=arr[j];
        }
        double avg;
        avg=hap/nx;
        for(int j=0;j<nx;j++){
            if(avg<arr[j])
                count++;
        }
        printf("%.3f%%\n",(float)count/nx*100);
       
    }
}
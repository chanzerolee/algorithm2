#include<stdio.h>
int main(){
    int a,i,d[10],result=0;
    for(i=0;i<10;i++){
    scanf("%d",&a);
    d[i]=(a%42);
    }
    for(i=0;i<10;i++){
        int count=0;
        for(int j=i+1;j<10;j++){
            if(d[i]==d[j])
                count++;
        }
      if(count==0)
          result++;
    }
    printf("%d",result);
  }
#include<stdio.h>
int main(){
    int num;
    double max=0,hap=0,avr=0;
    scanf("%d",&num);
    int input[num];
    for(int i=0;i<num;i++){
        scanf("%d",&input[i]);
        if(max<input[i])
            max=input[i];
        }
    for(int i=0;i<num;i++){
        hap+=input[i]/max*100;
    }
    avr=hap/num;
    printf("%f",avr);
}
#include<stdio.h>
#include<string.h>
int aTT(int n){
    switch(n){
        case 'A':
        case 'B':
        case 'C':
            return 2;
        case 'D':
        case 'E':
        case 'F':
            return 3;
        case 'G':
        case 'H':
        case 'I':
            return 4;
        case 'J':
        case 'K':
        case 'L':
            return 5;
        case 'M':
        case 'N':
        case 'O':
            return 6;
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
            return 7;
        case 'T':
        case 'U':
        case 'V':
            return 8;
        default:
            return 9;
         
    }
}
int main(){
    int count=0;
    char a[15];
        scanf("%s",a);
    for(int i='A';i<='Z';i++){
     for(int j=0;j<strlen(a);j++){
         if(a[j]==i)
             count+=aTT(a[j]);
     }   
    }
    count+=strlen(a);
    printf("%d",count);
}
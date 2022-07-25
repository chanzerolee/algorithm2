import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt();
        for(int t=0;t<n;t++){
            int a=stdin.nextInt();
            int b=stdin.nextInt();
            int arr1[]=new int[b];
            int arr2[]=new int[b];
            for(int j=0;j<b;j++){
                    arr1[j]=j+1;
                }
            arr2[0]=arr1[0];
            for(int j=1;j<=a;j++){
            for(int i=1;i<b;i++){
                if(j%2==1){
                    arr2[i]=arr2[i-1]+arr1[i];
                }
                else{
                    arr1[i]=arr1[i-1]+arr2[i];                    
                }
                
                
            }}
                if(arr1[b-1]>arr2[b-1])
                    System.out.println(arr1[b-1]);
                else
                    System.out.println(arr2[b-1]);
        }
}
}
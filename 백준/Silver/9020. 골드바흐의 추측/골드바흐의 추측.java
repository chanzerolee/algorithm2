import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt();
        for(int i=0;i<n;i++){
            int a=stdin.nextInt();
            int count=0;
            boolean arr[]=new boolean[a+1];
            arr[0]=arr[1]=true;
            for(int j=0;j<=a;j++){
                if(arr[j]==true)
                    continue;
                arr[j]=false;
                count++;
                   for(int k=2;k<=a;k++){
                    if(j*k>a)
                        break;
                    arr[j*k]=true;
                }
            }   
            int arr1[]=new int[count+1];
            int b=0;
            for(int k=2;k<=a;k++){
                if(arr[k]==false){
                        arr1[b]=k;
                    b++;
                    }
            }
            int x=0,y=0;
            int min=a;
            for(int j=0;j<count;j++){
                for(int k=j;k<count;k++){
                    if(arr1[j]+arr1[k]==a){
                        if(min>k-j)
                            x=j;y=k;
                    }
            }
        }
           System.out.println(arr1[x]+" "+arr1[y]);
    }
}}
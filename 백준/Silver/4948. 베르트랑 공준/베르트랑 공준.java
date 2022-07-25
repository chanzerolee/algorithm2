import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        boolean arr[]=new boolean[2*123458];
        Scanner stdin=new Scanner(System.in);
        arr[0]=arr[1]=true;
        for(int i=2;i<2*123457;i++){
            if(arr[i]==true)
                continue;
            arr[i]=false;
            for(int j=2;j<2*123457;j++){
                if(i*j>2*123457)
                    break;
                arr[i*j]=true;
            }
        }
            while(true){
                int n=stdin.nextInt();
                if(n==0)
                    break;
                else if(n==1){
                    System.out.println(n);
                    continue;
                }
                int count=0;
                for(int i=n;i<n*2;i++){
                    if(arr[i+1]==false)
                        count++;
                    }
                System.out.println(count);
            }
        }
}

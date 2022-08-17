import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt();
        long dp[]=new long[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
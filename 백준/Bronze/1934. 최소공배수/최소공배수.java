import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
        int n=stdin.nextInt();
        for(int i=0;i<n;i++){
            int a=stdin.nextInt();
            int b=stdin.nextInt();
            int max=Math.min(a,b);
            for(int j=max;j>0;j--){
                if(a%j==0&&b%j==0){
                    max=j;
                    break;
                }
            }
            System.out.println(a/max*b);
        }
	}
}

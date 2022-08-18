import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();
	    for(int i=0;i<n;i++){
	        int a=stdin.nextInt();
	        int b=stdin.nextInt();
	        long sum=1;
	        for(int j=0;j<a;j++){
	            sum*=(b-j);
	            sum/=(j+1);
	        }
	        System.out.println(sum);
	    }
	}
}

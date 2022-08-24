import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int a=stdin.nextInt();
	    int b=stdin.nextInt();
	    int max=Math.min(a,b);
	    for(int i=max;i>0;i--){
	        if(a%i==0&&b%i==0){
	            max=i;
	            break;
	        }
	    }
	    System.out.println(max+" "+a*b/max);
	}
}

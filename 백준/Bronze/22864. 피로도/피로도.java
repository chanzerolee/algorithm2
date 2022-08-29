import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int a=stdin.nextInt();
	    int b=stdin.nextInt();
	    int c=stdin.nextInt();
	    int m=stdin.nextInt();
	    int p=0;
	    int h=0;
	    int t=0;
	    if(a>m)
	        t=24;
	    while(t<24){
	        if(p+a<=m){
	            p+=a;
	            h+=b;
	            t++;
	        }else{
	            p-=c;
	            t++;
	        }
	        if(p<0)
	            p=0;
	    }
	    System.out.println(h);
	}
}
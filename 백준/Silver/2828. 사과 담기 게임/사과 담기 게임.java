import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();
	    int m=stdin.nextInt();
	    int j=stdin.nextInt();
	    int count=0;
	    int jj=1;
	    for(int i=0;i<j;i++){
	        int k=stdin.nextInt();
	        if(k>m){
	            count+=k-m;
	            jj+=k-m;
	            m+=k-m;
	        }
	        if(k<jj){
	            count+=jj-k;
	            m-=jj-k;
	            jj-=jj-k;
	        }
	    }
	    System.out.println(count);
	}
}

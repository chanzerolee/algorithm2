import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int c=stdin.nextInt();
	    for(int i=0;i<c;i++){
	    int s=stdin.nextInt();
	    int q=0,d=0,n=0,p=0;
	    if(s/25>0){
	        q=s/25;
	        s%=25;
	    }
	    if(s/10>0){
	        d=s/10;
	        s%=10;
	    }
	    
	    if(s/5>0){
	        n=s/5;
	        s%=5;
	    }
	    
	    if(s!=0){
	        p=s;
	    }
	    System.out.println(q+" "+d+" "+n+" "+p);
	    }
	}
}
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();
	    String s=stdin.next();
	    int count=0;
	    int bool=0;
	    for(int i=0;i<n;i++){
	        if(s.charAt(i)=='L'){
	            if(bool==0)
	                count+=2;
	            else
	                count++;
	            bool=1;
	            i++;
	        }
	        else{
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    String s=stdin.next();
	    char a=s.charAt(0);
	    int count=0;
	    int bool=0;
	    for(int i=1;i<s.length();i++){
	        if(a==s.charAt(i))
	            bool=0;
	        if(bool==1){
	            continue;
	        }
	        if(a!=s.charAt(i)){
	            count++;
	            bool++;
	        }
	    }
	    System.out.println(count);
	}
}

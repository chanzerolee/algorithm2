import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
        String first=stdin.nextLine();
	    String last=stdin.nextLine();
	    int t=0;
	    int count=0;
	    for(int i=0;i<first.length();i++){
	        if(first.charAt(i)==last.charAt(t)){
	            t++;
	            if(t==last.length()){
	                count++;
	                t=0;
	            }
	        }
	        else{
                i-=t;
	            t=0;}
	    }
	    System.out.println(count);
		}
}
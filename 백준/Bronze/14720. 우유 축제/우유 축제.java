import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();
	    int milk=0;
	    int drink=0;
	    for(int i=0;i<n;i++){
	        int m=stdin.nextInt();
	        if(m==milk){
	            drink++;
	            milk++;
	            if(milk==3)
	                milk=0;
	        }
	    }
	    System.out.println(drink);
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int s=stdin.nextInt();
	    int a=0,b=0,c=0;
	    while(s>0){
	        if(s/300>0){
	            a+=s/300;
	            s%=300;
	        }
	        else if(s/60>0){
	            b+=s/60;
	            s%=60;
	        }
	        else if(s/10>0){
	            c+=s/10;
	            s%=10;
	        }
	        else{
	            s=-1;
	        }
	    }
	    if(s==-1)
	        System.out.println(s);
	    else
	        System.out.println(a+" "+b+" "+c);
		}
}

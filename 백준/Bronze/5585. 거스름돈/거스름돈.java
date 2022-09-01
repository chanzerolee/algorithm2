import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int b=stdin.nextInt();
	    int count=0;
	    int a=1000-b;
	    while(true){
	        if(a>=500){
	            count+=a/500;
	            a%=500;
	        }else if(a>=100){
	            count+=a/100;
	            a%=100;
	        }else if(a>=50){
	            count+=a/50;
	            a%=50;
	        }else if(a>=10){
	            count+=a/10;
	            a%=10;
	        }else if(a>=5){
	            count+=a/5;
	            a%=5;
	        }else{
	            count+=a;
	            break;
	        }
	        
	    }
	        System.out.println(count);
	        
	}
}
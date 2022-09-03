import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int i=0;
	        while(true){
	            int count=0;
	            i++;
	            int a=stdin.nextInt();
	            int b=stdin.nextInt();
	            int c=stdin.nextInt();
	            if(a==0&&b==0&&c==0)
	                break;
                while(c>b){
                    count+=a;
                    c-=b;
                }
                if(c<a){
                    count+=c;
                    
                }else{
                    count+=a;
                }
                
	        System.out.println("Case "+i+": "+count);	        
	    }
	        
	}
}
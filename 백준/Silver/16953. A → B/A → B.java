import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int first=stdin.nextInt();
	    int last=stdin.nextInt();
	    int count=1;
	    while(last>first){
	        if(last%2==0){
	            last/=2;
	            count++;
	        }
	        else if(last%10==1){
	            last/=10;
	            count++;
	        }
	        else
	            break;
	    }
	    if(last==first)
	         System.out.println(count);
	    else
	         System.out.println(-1);
		}
}
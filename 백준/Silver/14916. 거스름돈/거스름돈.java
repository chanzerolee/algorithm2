import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    int n=stdin.nextInt();//거스름돈
	    int count=0;
	    if(n<5&&n%2!=0)//거스름 돈이 5보다 작고 2로 안나눠질떄.
	   {     count=-1;}
	    else if(n%5==0)//5로 나누어 질떄
	    {   count=n/5;}
	    else if(n%5==2||n%5==4)//5로 나눈 나머지가 2일떄
	    {   count=n/5;
	        n%=5;
	        count+=n/2;}
	    else if((n%5+5)%2==0)
	        {count=n/5-1;
	        n=n%5+5;
	        count+=n/2;}
	    else
	        count=n/2;
	   System.out.println(count);
	        
	}
}
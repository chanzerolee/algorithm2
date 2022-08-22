import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    String s=stdin.next();
	    String s1="";
	    int count=0;
	    for(int i=0;i<s.length();i++){
	            if(count/4>0){
	                count=0;
	                s1+="AAAA";
	            }
	            if(s.charAt(i)=='X'){
	                count++;
	                continue;
	            }
	            if(count%2!=0){
	                s1="-1";
	                break;}
	            else if(count>0){
	                count=0;
	                s1+="BB";
	            }
	            s1+=".";
	        }
	        if(count!=0){
	            if(count%2!=0)
	                s1="-1";
	            else {
	                if(count==4){
	                    s1+="AAAA";
	                }else
	                s1+="BB";}}
	    System.out.println(s1);
	}
}

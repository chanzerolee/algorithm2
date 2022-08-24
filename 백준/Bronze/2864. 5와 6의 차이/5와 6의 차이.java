import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner stdin=new Scanner(System.in);
	    String s=stdin.next();
	    String x=stdin.next();
	    String z="";
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)=='6'){
	            z+='5';
	            continue;
	        }
	        z+=s.charAt(i);
	    }
	    s=z;
	    z="";
	    for(int i=0;i<x.length();i++){
    	    if(x.charAt(i)=='6'){
	            z+='5';
	            continue;
	        }
	        z+=x.charAt(i);
	    }
	    x=z;
	    z="";
	    int min=Integer.parseInt(s)+Integer.parseInt(x);
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)=='5'){
	            z+='6';
	            continue;
	        }
	        z+=s.charAt(i);
	    }
	    s=z;
	    z="";
	    for(int i=0;i<x.length();i++){
    	    if(x.charAt(i)=='5'){
	            z+='6';
	            continue;
	        }
	        z+=x.charAt(i);
	    }
	    x=z;
	    int max=Integer.parseInt(s)+Integer.parseInt(x);
	    System.out.println(min+" "+max);
	}
}